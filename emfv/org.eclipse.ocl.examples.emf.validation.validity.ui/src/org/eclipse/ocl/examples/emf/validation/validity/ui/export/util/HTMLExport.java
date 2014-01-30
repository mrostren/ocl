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
package org.eclipse.ocl.examples.emf.validation.validity.ui.export.util;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.emf.validation.validity.LeafConstrainingNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.Severity;
import org.eclipse.ocl.examples.emf.validation.validity.ui.messages.ValidationDebugMessages;

/**
 * Exports ocl validation results as an html file.
 */
public class HTMLExport extends AbstractExport {

	/**
	 * Returns a stream containing the initial contents to be given to new
	 * exported validation results file resource instances.
	 * 
	 * @return exported File contents to be given to new exported file resource
	 *         instances
	 */
	@Override
	public String createContents(@NonNull Resource validatedResource, RootNode rootNode, String exportedFileName) {
		StringBuilder html = new StringBuilder();
		html.append("<html>\n");
		html.append("\t<head></head>\n");
		html.append("\t<body>\n");
		html.append("\t\t<h1>1. GENERAL INFORMATION</h1>\n");

		html.append("\t\t<table border=\"1\">\n");

		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Output file name: </b></td>\n");
		html.append("\t\t\t\t<td>" + exportedFileName + "</td>\n");
		html.append("\t\t\t</tr>\n");

		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Author: </b></td>\n");
		html.append("\t\t\t\t<td>" + System.getProperty("user.name") + "</td>\n");
		html.append("\t\t\t</tr>\n");

		html.append("\t\t</table>\n");

		html.append("\n");
		html.append("\n");

		html.append("\t\t<h1>2. RESOURCES USED</h1>\n");
		html.append("\t\t\t<h2>2.1. Model checked</h2>\n");

		html.append("\t\t\t<ul>\n");
		html.append("\t\t\t\t<li>" + validatedResource.getURI().lastSegment() + "</li>\n");

		html.append("\t\t\t</ul>\n");

		html.append("<br/>\n");

		html.append("\t\t<h1>3. METRICS</h1>\n");
		html.append("\t\t<table border=\"1\">\n");

		int total = getConstraintCount();
		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Total number of evaluated constraints: </b></td>\n");
		html.append("\t\t\t\t<td>" + total + "</td>\n");
		html.append("\t\t\t</tr>\n");

		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Number of Success: </b></td>\n");
		html.append("\t\t\t\t<td>" + validationSuccess.size() + "</td>\n");
		html.append("\t\t\t</tr>\n");
		
		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Number of Infos: </b></td>\n");
		html.append("\t\t\t\t<td>" + validationInfos.size() + "</td>\n");
		html.append("\t\t\t</tr>\n");
		
		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Number of Warnings: </b></td>\n");
		html.append("\t\t\t\t<td>" + validationWarnings.size() + "</td>\n");
		html.append("\t\t\t</tr>\n");

		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Number of Errors: </b></td>\n");
		html.append("\t\t\t\t<td>" + validationErrors.size() + "</td>\n");
		html.append("\t\t\t</tr>\n");
		
		html.append("\t\t\t<tr>\n");
		html.append("\t\t\t\t<td><b>Number of Failures: </b></td>\n");
		html.append("\t\t\t\t<td>" + validationFailures.size() + "</td>\n");
		html.append("\t\t\t</tr>\n");

		html.append("\t\t</table>\n");

		html.append("\t\t<h1>4. LOGS</h1>\n");

		if (validationSuccess.size() == total) {
			html.append("<p>No log to display: models has been successfully validated.</p>\n");
		} else {
			int section = 1;
			Set<Object> loggedConstrainingObjects = new HashSet<Object>();
			if (!validationInfos.isEmpty()) {
				html.append("\t\t<h2>4." + section + ". Infos</h2>\n");
				html.append("\t\t<table border=\"1\">\n");
				appendTitlesTable(html);
				for (LeafConstrainingNode infoNode : validationInfos) {
					if (loggedConstrainingObjects.add(infoNode.getConstrainingObject())) {
						appendLogFile(infoNode, html, Severity.INFO.getLiteral());
					}
				}
				html.append("\t\t</table>\n");
				section++;
			}
			if (!validationWarnings.isEmpty()) {
				html.append("\t\t<h2>4." + section + ". Warnings</h2>\n");
				html.append("\t\t<table border=\"1\">\n");
				appendTitlesTable(html);
				for (LeafConstrainingNode warningNode : validationWarnings) {
					if (loggedConstrainingObjects.add(warningNode.getConstrainingObject())) {
						appendLogFile(warningNode, html, Severity.WARNING.getLiteral());
					}
				}
				html.append("\t\t</table>\n");
				section++;
			}
			if (!validationErrors.isEmpty()) {
				html.append("\t\t<h2>4." + section + ". Errors</h2>\n");
				html.append("\t\t<table border=\"1\">\n");
				appendTitlesTable(html);
				for (LeafConstrainingNode errorNode : validationErrors) {
					if (loggedConstrainingObjects.add(errorNode.getConstrainingObject())) {
						appendLogFile(errorNode, html, Severity.ERROR.getLiteral());
					}
				}
				html.append("\t\t</table>\n");
				section++;
			}
			if (!validationFailures.isEmpty()) {
				html.append("\t\t<h2>4." + section + ". Failures</h2>\n");
				html.append("\t\t<table border=\"1\">\n");
				appendTitlesTable(html);
				for (LeafConstrainingNode failureNode : validationFailures) {
					if (loggedConstrainingObjects.add(failureNode.getConstrainingObject())) {
						appendLogFile(failureNode, html, Severity.FATAL.getLiteral());
					}
				}
				html.append("\t\t</table>\n");
				section++;
			}
		}
		html.append("</body>\n");
		html.append("</html>\n");
		return html.toString();
	}
	
	private void appendTitlesTable(StringBuilder s) {
		s.append("\t\t\t<tr>\n");
		s.append("\t\t\t\t<td><b>Resource</b></td>\n");
		s.append("\t\t\t\t<td><b>Invariant</b></td>\n");
		s.append("\t\t\t\t<td><b>Expression</b></td>\n");
		s.append("\t\t\t\t<td><b>Severity</b></td>\n");
		s.append("\t\t\t\t<td><b>Message</b></td>\n");
		s.append("\t\t\t</tr>\n");
	}

	private void appendLogFile(LeafConstrainingNode node, StringBuilder s, String severity) {
		s.append("\t\t\t<tr>\n");
		Resource resource = node.getConstraintResource();
		if (resource != null) {
			s.append("\t\t\t<td> Resource: " + resource.getURI().lastSegment() + "</td>\n");
		} else {
			s.append("\t\t\t\t<td>"
				+ ValidationDebugMessages.ValidityView_Constraints_LabelProvider_UnexistingResource
				+ "</td>\n");
		}
		s.append("\t\t\t\t<td>" + node.getLabel() + "</td>\n");

		String expression = node.getConstraintString();
		if (expression != null) {
			s.append("\t\t\t\t<td>" + expression + "</td>\n");
		} else {
			s.append("\t\t\t\t<td>"
				+ ValidationDebugMessages.ValidityView_Constraints_LabelProvider_UnattainableExpression
				+ "</td>\n");
		}
		s.append("\t\t\t\t<td>" + severity + "</td>\n");
		s.append("\t\t\t\t<td>" + StringEscapeUtils.escapeHtml(getMessage(node.getWorstResult())) + "</td>\n");
		s.append("\t\t\t</tr>\n");
	}
}
