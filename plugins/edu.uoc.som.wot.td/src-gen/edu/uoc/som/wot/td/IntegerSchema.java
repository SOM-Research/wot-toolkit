/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.IntegerSchema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.IntegerSchema#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getIntegerSchema()
 * @model
 * @generated
 */
public interface IntegerSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see edu.uoc.som.wot.td.TdPackage#getIntegerSchema_Minimum()
	 * @model
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.IntegerSchema#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see edu.uoc.som.wot.td.TdPackage#getIntegerSchema_Maximum()
	 * @model
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.IntegerSchema#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

} // IntegerSchema
