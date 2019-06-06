/**
 */
package edu.uoc.som.wot.td;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pop Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.PopSecurityScheme#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.PopSecurityScheme#getAlg <em>Alg</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.PopSecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.PopSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.PopSecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme()
 * @model
 * @generated
 */
public interface PopSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PopSecurityScheme#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alg</em>' attribute.
	 * @see #setAlg(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme_Alg()
	 * @model
	 * @generated
	 */
	String getAlg();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PopSecurityScheme#getAlg <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alg</em>' attribute.
	 * @see #getAlg()
	 * @generated
	 */
	void setAlg(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme_AuthorizationUrl()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PopSecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(URI value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PopSecurityScheme#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getPopSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PopSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PopSecurityScheme
