/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.PropertyAffordance#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getPropertyAffordance()
 * @model
 * @generated
 */
public interface PropertyAffordance extends InteractionAffordance, DataSchema {
	/**
	 * Returns the value of the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' attribute.
	 * @see #setObservable(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getPropertyAffordance_Observable()
	 * @model
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PropertyAffordance#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);

} // PropertyAffordance
