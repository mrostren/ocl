/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 SAP AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Axel Uhl - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OppositeEndFinder.java,v 1.2 2011/05/10 21:18:33 auhl Exp $
 */
package org.eclipse.ocl.ecore.opposites;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;

/**
 * Implementations shall be able to find and navigate "hidden references" on a classifier by name. Such references can be declared
 * by the annotation detail {@link EcoreEnvironment#PROPERTY_OPPOSITE_ROLE_NAME_KEY} on an {@link EAnnotation} with
 * {@link EAnnotation#getSource() source} {@link EMOFExtendedMetaData#EMOF_PACKAGE_NS_URI_2_0} on an {@link EReference}, thus
 * declaring the name for the otherwise non-existing opposite.<br>
 * <b>ATTENTION</b><br>
 * Per convention each {@link OppositeEndFinder implementation} must offer a {@code public} {@link Constructor constructor} with the 
 * {@link EPackage.Registry registry} as {@link Constructor#getParameterTypes() parameter} to support loading by the 
 * {@link OCLDelegateDomain} and therefore link between ecore model and {@link OppositeEndFinder finder}.
 * 
 * @author Axel Uhl
 * @since 3.1
 * 
 */
public interface OppositeEndFinder {

    /**
     * The key that identifies opposite role names in an annotation
     */
    public static final String PROPERTY_OPPOSITE_ROLE_NAME_KEY = "Property.oppositeRoleName"; //$NON-NLS-1$

    /**
     * Looks for {@link EReference}s whose {@link ETypedElement#getEType() type} is <code>classifier</code> or any of
     * <code>classifier</code>'s super types and that owns an {@link EAnnotation annotation} with source
     * {@link EMOFExtendedMetaData#EMOF_PACKAGE_NS_URI_2_0} containing a detail entry with key
     * {@link EcoreEnvironment#PROPERTY_OPPOSITE_ROLE_NAME_KEY} and the value equalling <code>name</code>. Such references are
     * added to <code>ends</code>.
     */
    void findOppositeEnds(EClassifier classifier, String name, List<EReference> ends);

    /**
     * Finds all {@link EReference}s whose {@link ETypedElement#getEType() type} is <code>classifier</code> or any of
     * <code>classifier</code>'s super types and that own an {@link EAnnotation annotation} with source
     * {@link EMOFExtendedMetaData#EMOF_PACKAGE_NS_URI_2_0} containing a detail entry with key
     * {@link EcoreEnvironment#PROPERTY_OPPOSITE_ROLE_NAME_KEY}. The value of the annotation detail is entered into the resulting
     * map as a key, the {@link EReference} on which the annotation was found is entered into the result map as the corresponding
     * value.
     * <p>
     * 
     * @return a non-<code>null</code> map of all "hidden references" accessible from <code>classifier</code> together with their
     *         corresponding forward references
     */
    Map<String, EReference> getAllOppositeEnds(EClassifier classifier);

    /**
     * Reverse-navigates the <code>property</code> starting at <code>target</code>. As a result, one or more objects may result
     * such that when navigating <code>property</code> from any of those, then <code>target</code> will be among the results. If
     * no such objects are found, it is permissible for an implementation to return <code>null</code>. As scope used
     * for this query one should be used by implementers that contains everything that can be seen from <code>target</code>.
     */
    Collection<EObject> navigateOppositePropertyWithForwardScope(EReference property, EObject target);

    /**
     * Reverse-navigates the <code>property</code> starting at <code>target</code>. As a result, one or more objects may result
     * such that when navigating <code>property</code> from any of those, then <code>target</code> will be among the results. If
     * no such objects are found, it is permissible for an implementation to return <code>null</code>. As scope used
     * for this query one should be used by implementers that contains everything that can see <code>target</code>.
     */
    Collection<EObject> navigateOppositePropertyWithBackwardScope(EReference property, EObject target);
    
    /**
     * Finds all instances of class <code>cls</code> and all its subclasses that can "see" <code>context</code>.
     * 
     * @return a non-<code>null</code> set
     */
    Set<EObject> getAllInstancesSeeing(EClass cls, Notifier context);

    /**
     * Finds all instances of class <code>cls</code> and all its subclasses that are visible from <code>context</code>.
     * 
     * @return a non-<code>null</code> set
     */
    Set<EObject> getAllInstancesSeenBy(EClass cls, Notifier context);

}
