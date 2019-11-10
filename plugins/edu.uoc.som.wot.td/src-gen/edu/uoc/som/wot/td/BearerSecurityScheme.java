/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bearer Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAlg <em>Alg</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.BearerSecurityScheme#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.BearerSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.BearerSecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme()
 * @model
 * @generated
 */
public interface BearerSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme_Authorization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

	/**
	 * Returns the value of the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alg</em>' attribute.
	 * @see #setAlg(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme_Alg()
	 * @model required="true"
	 * @generated
	 */
	String getAlg();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAlg <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alg</em>' attribute.
	 * @see #getAlg()
	 * @generated
	 */
	void setAlg(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme_In()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getIn <em>In</em>}' attribute.
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
	 * @see edu.uoc.som.wot.td.TdPackage#getBearerSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BearerSecurityScheme
