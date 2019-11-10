/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.ActionAffordance#isSafe <em>Safe</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ActionAffordance#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ActionAffordance#getInput <em>Input</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ActionAffordance#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getActionAffordance()
 * @model
 * @generated
 */
public interface ActionAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' attribute.
	 * @see #setSafe(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getActionAffordance_Safe()
	 * @model required="true"
	 * @generated
	 */
	boolean isSafe();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ActionAffordance#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' attribute.
	 * @see #isSafe()
	 * @generated
	 */
	void setSafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent</em>' attribute.
	 * @see #setIdempotent(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getActionAffordance_Idempotent()
	 * @model required="true"
	 * @generated
	 */
	boolean isIdempotent();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ActionAffordance#isIdempotent <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent</em>' attribute.
	 * @see #isIdempotent()
	 * @generated
	 */
	void setIdempotent(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getActionAffordance_Input()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getInput();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ActionAffordance#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getActionAffordance_Output()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getOutput();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ActionAffordance#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DataSchema value);

} // ActionAffordance
