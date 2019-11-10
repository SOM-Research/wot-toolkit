/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.ExpectedResponse#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getExpectedResponse()
 * @model
 * @generated
 */
public interface ExpectedResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getExpectedResponse_ContentType()
	 * @model required="true"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.ExpectedResponse#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // ExpectedResponse
