/**
 */
package edu.uoc.som.wot.td;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getScheme <em>Scheme</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getProxyUrl <em>Proxy Url</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_Scheme()
	 * @model required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Url</em>' attribute.
	 * @see #setProxyUrl(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_ProxyUrl()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getProxyUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getProxyUrl <em>Proxy Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Url</em>' attribute.
	 * @see #getProxyUrl()
	 * @generated
	 */
	void setProxyUrl(URI value);

} // SecurityScheme
