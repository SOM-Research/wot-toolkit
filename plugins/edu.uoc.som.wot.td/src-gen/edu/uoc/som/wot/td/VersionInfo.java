/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.VersionInfo#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getVersionInfo()
 * @model
 * @generated
 */
public interface VersionInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getVersionInfo_Instance()
	 * @model required="true"
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.VersionInfo#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

} // VersionInfo
