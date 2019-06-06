/**
 */
package edu.uoc.som.wot.td;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefreshUrl <em>Refresh Url</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme()
 * @model
 * @generated
 */
public interface OAuth2SecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme_Flow()
	 * @model
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme_Scopes()
	 * @model
	 * @generated
	 */
	EList<String> getScopes();

	/**
	 * Returns the value of the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Url</em>' attribute.
	 * @see #setTokenUrl(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme_TokenUrl()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getTokenUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(URI value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme_AuthorizationUrl()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(URI value);

	/**
	 * Returns the value of the '<em><b>Refresh Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Url</em>' attribute.
	 * @see #setRefreshUrl(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getOAuth2SecurityScheme_RefreshUrl()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getRefreshUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefreshUrl <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Url</em>' attribute.
	 * @see #getRefreshUrl()
	 * @generated
	 */
	void setRefreshUrl(URI value);

} // OAuth2SecurityScheme
