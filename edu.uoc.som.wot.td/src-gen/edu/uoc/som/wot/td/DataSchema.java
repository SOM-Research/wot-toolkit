/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getAnyType <em>Any Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema()
 * @model
 * @generated
 */
public interface DataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Any Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Type</em>' attribute.
	 * @see #setAnyType(Object)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_AnyType()
	 * @model dataType="edu.uoc.som.wot.td.AnyType"
	 * @generated
	 */
	Object getAnyType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getAnyType <em>Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Type</em>' attribute.
	 * @see #getAnyType()
	 * @generated
	 */
	void setAnyType(Object value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(Object)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Enum()
	 * @model dataType="edu.uoc.som.wot.td.AnyType"
	 * @generated
	 */
	Object getEnum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(Object value);

} // DataSchema
