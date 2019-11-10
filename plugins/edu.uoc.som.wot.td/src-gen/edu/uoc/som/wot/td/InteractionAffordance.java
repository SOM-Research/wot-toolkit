/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.InteractionAffordance#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.InteractionAffordance#getForms <em>Forms</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.InteractionAffordance#getUriVariable <em>Uri Variable</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getInteractionAffordance()
 * @model features="ititle idescription ititles idescriptions" 
 *        ititleDataType="org.eclipse.emf.ecore.EString" ititleSuppressedGetVisibility="true" ititleSuppressedSetVisibility="true" ititleSuppressedIsSetVisibility="true" ititleSuppressedUnsetVisibility="true"
 *        idescriptionDataType="org.eclipse.emf.ecore.EString" idescriptionSuppressedGetVisibility="true" idescriptionSuppressedSetVisibility="true" idescriptionSuppressedIsSetVisibility="true" idescriptionSuppressedUnsetVisibility="true"
 *        ititlesType="edu.uoc.som.wot.td.MultiLanguage" ititlesContainment="true" ititlesSuppressedGetVisibility="true" ititlesSuppressedSetVisibility="true" ititlesSuppressedIsSetVisibility="true" ititlesSuppressedUnsetVisibility="true"
 *        idescriptionsType="edu.uoc.som.wot.td.MultiLanguage" idescriptionsContainment="true" idescriptionsSuppressedGetVisibility="true" idescriptionsSuppressedSetVisibility="true" idescriptionsSuppressedIsSetVisibility="true" idescriptionsSuppressedUnsetVisibility="true"
 * @generated
 */
public interface InteractionAffordance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionAffordance_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.InteractionAffordance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionAffordance_Forms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Uri Variable</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Variable</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionAffordance_UriVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getUriVariable();

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

} // InteractionAffordance
