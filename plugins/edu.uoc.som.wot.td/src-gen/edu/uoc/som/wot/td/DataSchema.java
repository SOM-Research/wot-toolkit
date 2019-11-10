/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getConst <em>Const</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getUnit <em>Unit</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getEnum <em>Enum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DataSchema#getOneOf <em>One Of</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema()
 * @model features="dtitle ddescription dtitles ddescriptions" 
 *        dtitleDataType="org.eclipse.emf.ecore.EString" dtitleSuppressedGetVisibility="true" dtitleSuppressedSetVisibility="true" dtitleSuppressedIsSetVisibility="true" dtitleSuppressedUnsetVisibility="true"
 *        ddescriptionDataType="org.eclipse.emf.ecore.EString" ddescriptionSuppressedGetVisibility="true" ddescriptionSuppressedSetVisibility="true" ddescriptionSuppressedIsSetVisibility="true" ddescriptionSuppressedUnsetVisibility="true"
 *        dtitlesType="edu.uoc.som.wot.td.MultiLanguage" dtitlesContainment="true" dtitlesSuppressedGetVisibility="true" dtitlesSuppressedSetVisibility="true" dtitlesSuppressedIsSetVisibility="true" dtitlesSuppressedUnsetVisibility="true"
 *        ddescriptionsType="edu.uoc.som.wot.td.MultiLanguage" ddescriptionsContainment="true" ddescriptionsSuppressedGetVisibility="true" ddescriptionsSuppressedSetVisibility="true" ddescriptionsSuppressedIsSetVisibility="true" ddescriptionsSuppressedUnsetVisibility="true"
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(Object)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Const()
	 * @model dataType="edu.uoc.som.wot.td.AnyType"
	 * @generated
	 */
	Object getConst();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(Object value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Enum()
	 * @model dataType="edu.uoc.som.wot.td.AnyType"
	 * @generated
	 */
	EList<Object> getEnum();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_ReadOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_WriteOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DataSchema#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getDataSchema_OneOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getOneOf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTitle(String title);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDescription(String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MultiLanguage getTitles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTitles(MultiLanguage titles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDescriptions(MultiLanguage descriptions);

} // DataSchema
