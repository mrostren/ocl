/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: PivotConstants.java,v 1.1.2.3 2010/12/19 15:52:40 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface PivotConstants
{
	static final int MONIKER_OVERFLOW_LIMIT = 256;
	static final String ANNOTATION_QUOTE = "'"; //$NON-NLS-1$
	static final String BINDINGS_PREFIX = "/"; //$NON-NLS-1$ // FIXME Rename
	static final String ITERATOR_SEPARATOR = ";"; //$NON-NLS-1$
	static final String ACCUMULATOR_SEPARATOR = "|"; //$NON-NLS-1$
	static final String NULL_MARKER = "<<null-element>>"; //$NON-NLS-1$
	static final String OVERFLOW_MARKER = "##"; //$NON-NLS-1$
	static final String MONIKER_PART_SEPARATOR = "@"; //$NON-NLS-1$
	static final String MONIKER_SCOPE_SEPARATOR = "|"; //"::"; //$NON-NLS-1$
	static final String MONIKER_OPERATOR_SEPARATOR = "~"; //$NON-NLS-1$
	static final String PARAMETER_PREFIX = "("; //$NON-NLS-1$
	static final String PARAMETER_SEPARATOR = ","; //$NON-NLS-1$
	static final String PARAMETER_SUFFIX = ")"; //$NON-NLS-1$
	static final String PRECEDENCE_PREFIX = "~"; //$NON-NLS-1$
	static final String TEMPLATE_BINDING_PREFIX = "["; //$NON-NLS-1$
	static final String TEMPLATE_BINDING_SEPARATOR = ","; //$NON-NLS-1$
	static final String TEMPLATE_BINDING_SUFFIX = "]"; //$NON-NLS-1$
	static final String TEMPLATE_PARAMETER_PREFIX = "?"; //$NON-NLS-1$
	static final String TEMPLATE_SIGNATURE_PREFIX = "{"; //$NON-NLS-1$
	static final String TEMPLATE_SIGNATURE_SEPARATOR = ","; //$NON-NLS-1$
	static final String TEMPLATE_SIGNATURE_SUFFIX = "}"; //$NON-NLS-1$
	static final String WILDCARD_INDICATOR = "?"; //$NON-NLS-1$

	static final String COLLECTION_NAVIGATION_OPERATOR = "->";
	static final String OBJECT_NAVIGATION_OPERATOR = ".";

	static final String MONIKER_IF_EXP = "if";
	static final String MONIKER_INVALID_LITERAL_EXP = "invalid";
	static final String MONIKER_LET_EXP = "let";
	static final String MONIKER_NULL_LITERAL_EXP = "null";
	static final String MONIKER_STRING_LITERAL_EXP = "string";
	static final String MONIKER_TUPLE_LITERAL_EXP = "tuple";
	static final String MONIKER_TYPE_LITERAL_EXP = "type";
	static final String MONIKER_UNLIMITED_NATURAL_LITERAL_EXP = "*";

	static final String MONIKER_EXP_CHILD_PREFIX = "x";
	
	static final String ORPHANAGE_NAME = "orphanage";
	static final String ORPHANAGE_URI = "orphanage";

	public static final String PIVOT_URI = "http://www.org.eclipse/ocl/pivot"; //$NON-NLS-1$
	public static final String PIVOT_EATTRIBUTE__ID = "EATTRIBUTE__ID"; //$NON-NLS-1$
	public static final String PIVOT_ECLASS__INTERFACE = "ECLASS__INTERFACE"; //$NON-NLS-1$
	public static final String PIVOT_ECLASSIFIER__INSTANCE_CLASS_NAME = "ECLASSIFIER__INSTANCE_CLASS_NAME"; //$NON-NLS-1$
	public static final String PIVOT_EDATA_TYPE__SERIALIZABLE = "EDATA_TYPE__SERIALIZABLE"; //$NON-NLS-1$
//	public static final String PIVOT_EPACKAGE__NS_PREFIX = "EPACKAGE__NS_PREFIX"; //$NON-NLS-1$
//	public static final String PIVOT_EPACKAGE__NS_URI = "EPACKAGE__NS_URI"; //$NON-NLS-1$
	public static final String PIVOT_EREFERENCE__RESOLVE_PROXIES = "EREFERENCE__RESOLVE_PROXIES"; //$NON-NLS-1$
	public static final String PIVOT_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = "ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL"; //$NON-NLS-1$
	public static final String PIVOT_ESTRUCTURAL_FEATURE__TRANSIENT = "ESTRUCTURAL_FEATURE__TRANSIENT"; //$NON-NLS-1$
	public static final String PIVOT_ESTRUCTURAL_FEATURE__UNSETTABLE = "ESTRUCTURAL_FEATURE__UNSETTABLE"; //$NON-NLS-1$
	public static final String PIVOT_ESTRUCTURAL_FEATURE__VOLATILE = "ESTRUCTURAL_FEATURE__VOLATILE"; //$NON-NLS-1$
	
	public static Map<EStructuralFeature,String> roleNames = new HashMap<EStructuralFeature,String>();
}