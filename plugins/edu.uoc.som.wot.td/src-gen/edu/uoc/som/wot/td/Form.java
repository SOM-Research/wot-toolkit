/**
 */
package edu.uoc.som.wot.td;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.Form#getHref <em>Href</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getRel <em>Rel</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getSubProtocol <em>Sub Protocol</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Href()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI" required="true"
	 * @generated
	 */
	URI getHref();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(URI value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_MediaType()
	 * @model
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Rel()
	 * @model
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Sub Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Protocol</em>' attribute.
	 * @see #setSubProtocol(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_SubProtocol()
	 * @model
	 * @generated
	 */
	String getSubProtocol();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getSubProtocol <em>Sub Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Protocol</em>' attribute.
	 * @see #getSubProtocol()
	 * @generated
	 */
	void setSubProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Scopes()
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
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Security()
	 * @model
	 * @generated
	 */
	EList<SecurityScheme> getSecurity();

} // Form
