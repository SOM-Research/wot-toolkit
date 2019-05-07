/**
 */
package edu.uoc.som.wot.td;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getBase <em>Base</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getSupport <em>Support</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(URI)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Base()
	 * @model dataType="edu.uoc.som.wot.td.AnyURI"
	 * @generated
	 */
	URI getBase();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(URI value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' attribute.
	 * @see #setSupport(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Support()
	 * @model
	 * @generated
	 */
	String getSupport();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getSupport <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' attribute.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScheme> getSecurity();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Thing
