/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.Action#getInput <em>Input</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Action#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Action#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends InteractionPattern {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getAction_Input()
	 * @model
	 * @generated
	 */
	DataSchema getInput();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Action#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getAction_Output()
	 * @model
	 * @generated
	 */
	DataSchema getOutput();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Action#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getAction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Action#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Action
