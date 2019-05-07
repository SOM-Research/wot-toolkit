/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.InteractionPattern#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.InteractionPattern#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.InteractionPattern#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.InteractionPattern#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getInteractionPattern()
 * @model
 * @generated
 */
public interface InteractionPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionPattern_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.InteractionPattern#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionPattern_Scopes()
	 * @model
	 * @generated
	 */
	EList<String> getScopes();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionPattern_Security()
	 * @model
	 * @generated
	 */
	EList<SecurityScheme> getSecurity();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getInteractionPattern_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

} // InteractionPattern
