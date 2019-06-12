/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.NumberSchema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.NumberSchema#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getNumberSchema()
 * @model
 * @generated
 */
public interface NumberSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see edu.uoc.som.wot.td.TdPackage#getNumberSchema_Minimum()
	 * @model
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.NumberSchema#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see edu.uoc.som.wot.td.TdPackage#getNumberSchema_Maximum()
	 * @model
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.NumberSchema#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

} // NumberSchema
