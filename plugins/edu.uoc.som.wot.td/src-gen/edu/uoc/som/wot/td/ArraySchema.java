/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.ArraySchema#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ArraySchema#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.ArraySchema#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getArraySchema()
 * @model
 * @generated
 */
public interface ArraySchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(int)
	 * @see edu.uoc.som.wot.td.TdPackage#getArraySchema_MinItems()
	 * @model
	 * @generated
	 */
	int getMinItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ArraySchema#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(int value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(int)
	 * @see edu.uoc.som.wot.td.TdPackage#getArraySchema_MaxItems()
	 * @model
	 * @generated
	 */
	int getMaxItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ArraySchema#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(int value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getArraySchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getItems();

} // ArraySchema
