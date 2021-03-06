/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkManipulationAtPosition.java,v 1.2 2011/03/05 21:37:37 auhl Exp $
 */
package data.classes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Manipulation At Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An implementation that optionally specifies a position in an ordered link set telling where to apply the modification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.classes.LinkManipulationAtPosition#getAt <em>At</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.classes.ClassesPackage#getLinkManipulationAtPosition()
 * @model abstract="true"
 * @generated
 */
public interface LinkManipulationAtPosition extends ExtentModifyingAssociationEndSignatureImplementation {
	/**
	 * Returns the value of the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' attribute.
	 * @see #setAt(int)
	 * @see data.classes.ClassesPackage#getLinkManipulationAtPosition_At()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getAt();

	/**
	 * Sets the value of the '{@link data.classes.LinkManipulationAtPosition#getAt <em>At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' attribute.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(int value);

} // LinkManipulationAtPosition
