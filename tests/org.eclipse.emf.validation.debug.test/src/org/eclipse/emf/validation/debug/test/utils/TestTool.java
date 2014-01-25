/**
 * <copyright>
 *
 * Copyright (c) 2014 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Obeo - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.validation.debug.test.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.emf.validation.validity.ConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.Result;
import org.eclipse.ocl.examples.emf.validation.validity.RootConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.ValidatableNode;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCSResource;

/**
 * Test tools Class.
 */
public class TestTool {

	public static final String PLUGIN_ID = "org.eclipse.emf.validation.debug.test"; //$NON-NLS-1$
	
	private static ProjectMap projectMap = null;
	
	public static void doCompleteOCLSetup() {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			CompleteOCLStandaloneSetup.doSetup();
		} else {
			CompleteOCLStandaloneSetup.init();
		}
	}

	public static ProjectMap getProjectMap() {
		if (projectMap == null) {
			projectMap = new ProjectMap();
		}
		return projectMap;
	}

	public static URI getTestModelURI(String localFileName) {
		ProjectMap projectMap = getProjectMap();
		String urlString = projectMap.getLocation(PLUGIN_ID).toString();
		return DomainUtil.nonNullEMF(URI.createURI(urlString + localFileName));
	}
	
	public static ValidatableNode getValidatableNodeFromRootByLabel(
			EList<RootValidatableNode> validatableNodes, String label) {
		ValidatableNode result = null;
		Iterator<RootValidatableNode> iterator = validatableNodes.iterator();
		while (iterator.hasNext() && result == null) {
			RootValidatableNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static Result getResultFromResultValidatableNode(
			List<Result> validatableNodeResults, String label) {
		Result result = null;
		Iterator<Result> iterator = validatableNodeResults.iterator();
		while (iterator.hasNext() && result == null) {
			Result resultIterated = iterator.next();
			if (label.equals(resultIterated.getResultValidatableNode()
				.getLabel())) {
				result = resultIterated;
			}
		}
		return result;
	}
	
	public static Result getResultOfValidatableNodeFromLabel(EList<Result> results, 
			String labelValidatableNode, String labelResultConstrainingNode) {
		Result result = null;
		Iterator<Result> iterator = results.iterator();
		while (iterator.hasNext() && result == null) {
			Result resultIter = iterator.next();
			if (labelValidatableNode.equals(resultIter.getResultValidatableNode().getLabel())
					&& labelResultConstrainingNode.equals(resultIter.getResultConstrainingNode().getLabel())) {
				result = resultIter;
			}
		}
		return result;
	}
	
	public static ConstrainingNode getConstrainingNodeFromRootByLabel(
			EList<RootConstrainingNode> rootNodeChildren, String label) {
		ConstrainingNode result = null;
		Iterator<RootConstrainingNode> iterator = rootNodeChildren.iterator();
		while (iterator.hasNext() && result == null) {
			ConstrainingNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static ConstrainingNode getConstrainingNodeByLabel(
			EList<ConstrainingNode> rootNodeChildren, String label) {
		ConstrainingNode result = null;
		Iterator<ConstrainingNode> iterator = rootNodeChildren.iterator();
		while (iterator.hasNext() && result == null) {
			ConstrainingNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}
	
	public static ValidatableNode getValidatableNodeByLabel(
			EList<ValidatableNode> validatableNodes, String label) {
		ValidatableNode result = null;
		Iterator<ValidatableNode> iterator = validatableNodes.iterator();
		while (iterator.hasNext() && result == null) {
			ValidatableNode constrainingNode = iterator.next();
			if (label.equals(constrainingNode.getLabel())) {
				result = constrainingNode;
			}
		}
		return result;
	}

	public static boolean isCompleteOCLCSResourcePresent(Set<Resource> resources) {
		boolean found = false;
		Iterator<Resource> iterator = resources.iterator();
		while (iterator.hasNext() && !found) {
			Resource resource = iterator.next();
			if (resource instanceof CompleteOCLCSResource) {
				found = true;
			}
		}
		return found;
	}
	
	/**
	 * Returns the file containing the given resource if it exists in the workspace.
	 * 
	 * @param resource
	 * @return the file if it exists in the workspace, <code>null</code> otherwise.
	 */
	public static IFile getIResource(Resource resource) {
		if (resource == null) {
			return null;
		}
		URI resourceURI = resource.getURI();
		if (resourceURI == null || !resourceURI.isPlatform()) {
			return null;
		}
		IPath resourcePath = new Path(resourceURI.toPlatformString(true));
		return ResourcesPlugin.getWorkspace().getRoot().getFile(resourcePath);
	}
}
