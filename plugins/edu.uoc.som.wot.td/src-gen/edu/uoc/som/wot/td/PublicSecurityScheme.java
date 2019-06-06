/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.PublicSecurityScheme#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getPublicSecurityScheme()
 * @model
 * @generated
 */
public interface PublicSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getPublicSecurityScheme_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.PublicSecurityScheme#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

} // PublicSecurityScheme
