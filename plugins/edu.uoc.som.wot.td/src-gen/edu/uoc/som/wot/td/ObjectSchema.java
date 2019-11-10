/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.ObjectSchema#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ObjectSchema#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getObjectSchema()
 * @model
 * @generated
 */
public interface ObjectSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getObjectSchema_Required()
	 * @model
	 * @generated
	 */
	EList<String> getRequired();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getObjectSchema_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getProperties();

} // ObjectSchema
