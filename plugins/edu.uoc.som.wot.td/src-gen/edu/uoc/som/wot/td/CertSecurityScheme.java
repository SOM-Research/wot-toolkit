/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cert Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.CertSecurityScheme#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getCertSecurityScheme()
 * @model
 * @generated
 */
public interface CertSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getCertSecurityScheme_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.CertSecurityScheme#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

} // CertSecurityScheme
