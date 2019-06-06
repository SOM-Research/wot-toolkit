/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digest Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.DigestSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DigestSecurityScheme#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.DigestSecurityScheme#getQop <em>Qop</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getDigestSecurityScheme()
 * @model
 * @generated
 */
public interface DigestSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDigestSecurityScheme_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getIn <em>In</em>}' attribute.
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
	 * @see edu.uoc.som.wot.td.TdPackage#getDigestSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qop</em>' attribute.
	 * @see #setQop(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getDigestSecurityScheme_Qop()
	 * @model
	 * @generated
	 */
	String getQop();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getQop <em>Qop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qop</em>' attribute.
	 * @see #getQop()
	 * @generated
	 */
	void setQop(String value);

} // DigestSecurityScheme
