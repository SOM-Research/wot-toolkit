/**
 */
package edu.uoc.som.wot.td;

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
 *   <li>{@link edu.uoc.som.wot.td.Form#getOp <em>Op</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getContentType <em>Content Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getContentCoding <em>Content Coding</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getSubProtocol <em>Sub Protocol</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Form#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getForm()
 * @model features="_href" 
 *        _hrefDataType="org.eclipse.emf.ecore.xml.type.AnyURI" _hrefRequired="true" _hrefSuppressedGetVisibility="true" _hrefSuppressedSetVisibility="true" _hrefSuppressedIsSetVisibility="true" _hrefSuppressedUnsetVisibility="true"
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Op()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getOp();

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_ContentType()
	 * @model required="true"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Content Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Coding</em>' attribute.
	 * @see #setContentCoding(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_ContentCoding()
	 * @model
	 * @generated
	 */
	String getContentCoding();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getContentCoding <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Coding</em>' attribute.
	 * @see #getContentCoding()
	 * @generated
	 */
	void setContentCoding(String value);

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
	 * Returns the value of the '<em><b>Security</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Security()
	 * @model
	 * @generated
	 */
	EList<String> getSecurity();

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
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(ExpectedResponse)
	 * @see edu.uoc.som.wot.td.TdPackage#getForm_Response()
	 * @model containment="true"
	 * @generated
	 */
	ExpectedResponse getResponse();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Form#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ExpectedResponse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getHref();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hrefDataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	void setHref(String href);

} // Form
