/**
 */
package edu.uoc.som.wot.td;

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
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getScheme <em>Scheme</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getProxy <em>Proxy</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.SecurityScheme#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_Proxy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getProxy();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference.
	 * @see #setDescriptions(MultiLanguage)
	 * @see edu.uoc.som.wot.td.TdPackage#getSecurityScheme_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.SecurityScheme#getDescriptions <em>Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' containment reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(MultiLanguage value);

} // SecurityScheme
