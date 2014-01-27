/**
 * <copyright>
 *
 * Copyright (c) 2013 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *	Obeo - Add selection facilities
 *
 * </copyright>
 */
package org.eclipse.emf.validation.debug.ui.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.validation.debug.validity.AbstractNode;
import org.eclipse.emf.validation.debug.validity.ConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultConstrainingNode;
import org.eclipse.emf.validation.debug.validity.ResultValidatableNode;
import org.eclipse.emf.validation.debug.validity.RootConstrainingNode;
import org.eclipse.emf.validation.debug.validity.RootValidatableNode;
import org.eclipse.emf.validation.debug.validity.ValidatableNode;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;

public class ValidityNodeCheckStateListener implements ICheckStateListener {
	private final CheckboxTreeViewer validatableTree;
	
	private final CheckboxTreeViewer constraintsTree;
	
	public ValidityNodeCheckStateListener(CheckboxTreeViewer validatableTree, CheckboxTreeViewer constraintsTree) {
		this.validatableTree = validatableTree;
		this.constraintsTree = constraintsTree;
	}
	
	public void checkStateChanged(CheckStateChangedEvent event) {
		Object element = event.getElement();
		if (element instanceof AbstractNode) {
			AbstractNode abstractNode = (AbstractNode) element;
			boolean checked = event.getChecked();

			// update Selected Element check
			abstractNode.setEnabled(checked);

			// update Selected Element Results children check
			updateChildrenNodesState(abstractNode, checked);

			// update Selected Element parents checks/grayed
			if (abstractNode instanceof RootValidatableNode || abstractNode instanceof RootConstrainingNode){
				updateRootNode(abstractNode);					
			} else if (abstractNode instanceof ConstrainingNode) {
				ConstrainingNode constrainingNode = (ConstrainingNode) abstractNode;
				updateConstrainingNodeAncestors(constrainingNode, checked);
			} else if (abstractNode instanceof ValidatableNode) {
				ValidatableNode validatableNode = (ValidatableNode) abstractNode;
				updateValidatableNodeAncestors(validatableNode, checked);
			}

			// update corresponding element in the adjacent tree
			propagateToAdjacentTree(abstractNode, checked);
		} else {
			// DO NOTHING
		}
	}

	private void updateRootNode(AbstractNode root) {
		List<AbstractNode> checkedChildren = getCheckedAbstractNodeChildren(root);
		if (checkedChildren.size() == root.getChildren().size()) {
			List<AbstractNode> grayedChildren = getGrayedAbstractNodeChildren(root);
			if (grayedChildren.size() == 0) {
				if (root instanceof RootValidatableNode) {
					validatableTree.setGrayed(root, false);
				} else if (root instanceof RootConstrainingNode) {
					constraintsTree.setGrayed(root, false);
				}
			} else {
				if (root instanceof RootValidatableNode) {
					validatableTree.setGrayed(root, true);
				} else if (root instanceof RootConstrainingNode) {
					constraintsTree.setGrayed(root, true);
				}
			}
		} else {
			if (root instanceof RootValidatableNode) {
				validatableTree.setGrayed(root, true);
			} else if (root instanceof RootConstrainingNode) {
				constraintsTree.setGrayed(root, true);
			}
		}
	}
	
	private void updateConstrainingNodeAncestors(ConstrainingNode child, boolean checked) {
		ConstrainingNode parent = child.getParent();
		if (parent != null) {
			//Enable/disable the parent if all children are enabled/disabled
			if (checked && !parent.isAllChildrenDisabled() || !checked && parent.isAllChildrenEnabled()){
				parent.setEnabled(checked);
				constraintsTree.setChecked(parent, checked);
			} else if (!checked && parent.isAllChildrenDisabled()){
				parent.setEnabled(checked);
				constraintsTree.setChecked(parent, checked);
			}
			List<ConstrainingNode> checkedChildren = getCheckedConstrainingNodeChildren(parent);
			if (parent.isEnabled()){
				if (checkedChildren.size() == parent.getChildren().size()) {
					List<ConstrainingNode> grayedChildren = getGrayedConstrainingNodeChildren(parent);
					if (grayedChildren.size() == 0) {
						constraintsTree.setGrayed(parent, false);
					} else {
						constraintsTree.setGrayed(parent, true);
					}
				} else {
					constraintsTree.setGrayed(parent, true);
				}
			}
			updateConstrainingNodeAncestors(parent, checked);
		}
	}

	private List<AbstractNode> getCheckedAbstractNodeChildren(
			AbstractNode root) {
		List<AbstractNode> checkedChildren = new ArrayList<AbstractNode>();
		if (root instanceof RootValidatableNode) {
			for (AbstractNode child : root.getChildren()) {
				if (validatableTree.getChecked(child)) {
					checkedChildren.add(child);
				}
			}
		} else if (root instanceof RootConstrainingNode) {
			for (AbstractNode child : root.getChildren()) {
				if (constraintsTree.getChecked(child)) {
					checkedChildren.add(child);
				}
			}
		}
		return checkedChildren;
	}

	private List<AbstractNode> getGrayedAbstractNodeChildren(
			AbstractNode root) {
		List<AbstractNode> grayedChildren = new ArrayList<AbstractNode>();

		if (root instanceof RootValidatableNode) {
			for (AbstractNode child : root.getChildren()) {
				if (validatableTree.getGrayed(child)) {
					grayedChildren.add(child);
				}
			}
		} else if (root instanceof RootConstrainingNode) {
			for (AbstractNode child : root.getChildren()) {
				if (constraintsTree.getGrayed(child)) {
					grayedChildren.add(child);
				}
			}
		}
		return grayedChildren;
	}
	
	private List<ConstrainingNode> getCheckedConstrainingNodeChildren(
			ConstrainingNode parent) {
		List<ConstrainingNode> checkedChildren = new ArrayList<ConstrainingNode>();
		for (ConstrainingNode child : parent.getChildren()) {
			if (constraintsTree.getChecked(child)) {
				checkedChildren.add(child);
			}
		}
		return checkedChildren;
	}
	
	private List<ConstrainingNode> getGrayedConstrainingNodeChildren(
			ConstrainingNode parent) {
		List<ConstrainingNode> grayedChildren = new ArrayList<ConstrainingNode>();
		for (ConstrainingNode child : parent.getChildren()) {
			if (constraintsTree.getGrayed(child)) {
				grayedChildren.add(child);
			}
		}
		return grayedChildren;
	}

	private void updateValidatableNodeAncestors(ValidatableNode child, boolean checked) {
		ValidatableNode parent = child.getParent();
		if (parent != null) {
			//Enable/disable the parent if all children are enabled/disabled
			if (checked && !parent.isAllChildrenDisabled() || !checked && parent.isAllChildrenEnabled()){
				parent.setEnabled(checked);
				validatableTree.setChecked(parent, checked);
			} else if (!checked && parent.isAllChildrenDisabled()){
				parent.setEnabled(checked);
				validatableTree.setChecked(parent, checked);
			}
			List<ValidatableNode> checkedChildren = getCheckedValidatableNodeChildren(parent);
			if (parent.isEnabled()){
				if (checkedChildren.size() == parent.getChildren().size()) {
					List<ValidatableNode> grayedChildren = getGrayedValidatableNodeChildren(parent);
					if (grayedChildren.size() == 0) {
						validatableTree.setGrayed(parent, false);
					} else {
						validatableTree.setGrayed(parent, true);
					}
				} else {
					validatableTree.setGrayed(parent, true);
				}
			}
			updateValidatableNodeAncestors(parent, checked);
		}
	}

	private List<ValidatableNode> getCheckedValidatableNodeChildren(
			ValidatableNode parent) {
		List<ValidatableNode> checkedChildren = new ArrayList<ValidatableNode>();
		for (ValidatableNode child : parent.getChildren()) {
			if (validatableTree.getChecked(child)) {
				checkedChildren.add(child);
			}
		}
		return checkedChildren;
	}
	
	private List<ValidatableNode> getGrayedValidatableNodeChildren(
			ValidatableNode parent) {
		List<ValidatableNode> grayedChildren = new ArrayList<ValidatableNode>();
		for (ValidatableNode child : parent.getChildren()) {
			if (validatableTree.getGrayed(child)) {
				grayedChildren.add(child);
			}
		}
		return grayedChildren;
	}
	/**
	 * Select/Deselect all results children nodes
	 */
	private void updateChildrenNodesState(AbstractNode abstractNode,
			boolean checked) {
		for (AbstractNode child : abstractNode.getChildren()) {
			if (child instanceof ResultValidatableNode) {
				child.setEnabled(checked);
				validatableTree.setChecked(child, checked);
				validatableTree.setGrayed(child, false);
			} else if (child instanceof ConstrainingNode) {
				child.setEnabled(checked);
				constraintsTree.setChecked(child, checked);
				updateChildrenNodesState(child, checked);
			}

			propagateToAdjacentTree(child, checked);
		}
	}

	/**
	 * Propagates results selection to the adjacent tree. The propagation is ascendant since the
	 * ResultValidatableNode and ResultConstrainingNode have no children to
	 * uptade.
	 */
	private void propagateToAdjacentTree(AbstractNode abstractNode,
			boolean checked) {
		if (abstractNode instanceof ResultValidatableNode) {
			ResultConstrainingNode resultConstrainingNode = ((ResultValidatableNode) abstractNode)
					.getResultConstrainingNode();
			resultConstrainingNode.setEnabled(checked);
			constraintsTree.setChecked(resultConstrainingNode, checked);

			// update Element parents checks/grayed
			updateConstrainingNodeAncestors(resultConstrainingNode, checked);
		} else if (abstractNode instanceof ResultConstrainingNode) {
			ResultValidatableNode resultValidatableNode = ((ResultConstrainingNode) abstractNode)
					.getResultValidatableNode();
			resultValidatableNode.setEnabled(checked);
			validatableTree.setChecked(resultValidatableNode, checked);

			// update Element parents checks/grayed
			updateValidatableNodeAncestors(resultValidatableNode, checked);
		}
	}
}
