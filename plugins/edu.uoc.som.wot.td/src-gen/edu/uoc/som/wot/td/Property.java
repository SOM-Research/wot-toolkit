/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.Property#isWritable <em>Writable</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Property#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends InteractionPattern, DataSchema {
	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getProperty_Writable()
	 * @model
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Property#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' attribute.
	 * @see #setObservable(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getProperty_Observable()
	 * @model
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Property#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);

} // Property
