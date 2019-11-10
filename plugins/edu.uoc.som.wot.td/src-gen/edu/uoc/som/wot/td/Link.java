/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.Link#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Link#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getLink()
 * @model features="_href" 
 *        _hrefDataType="org.eclipse.emf.ecore.xml.type.AnyURI" _hrefRequired="true" _hrefSuppressedGetVisibility="true" _hrefSuppressedSetVisibility="true" _hrefSuppressedIsSetVisibility="true" _hrefSuppressedUnsetVisibility="true"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getLink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getLink_Rel()
	 * @model
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' attribute.
	 * @see #setAnchor(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getLink_Anchor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getAnchor();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Link#getAnchor <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' attribute.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(String value);

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

} // Link
