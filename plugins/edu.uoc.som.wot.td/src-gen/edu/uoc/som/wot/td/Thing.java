/**
 */
package edu.uoc.som.wot.td;

import javax.xml.datatype.XMLGregorianCalendar;

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
 *   <li>{@link edu.uoc.som.wot.td.Thing#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getModified <em>Modified</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getSupport <em>Support</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getBase <em>Base</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getForms <em>Forms</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getTitles <em>Titles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getActions <em>Actions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.Thing#getSecurityDefinitions <em>Security Definitions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
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
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(XMLGregorianCalendar)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Created()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getCreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(XMLGregorianCalendar)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Modified()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getModified();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' attribute.
	 * @see #setSupport(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Support()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
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
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Security()
	 * @model
	 * @generated
	 */
	EList<String> getSecurity();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

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
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference.
	 * @see #setTitles(MultiLanguage)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Titles()
	 * @model containment="true"
	 * @generated
	 */
	MultiLanguage getTitles();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(MultiLanguage value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference.
	 * @see #setDescriptions(MultiLanguage)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getDescriptions <em>Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' containment reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(MultiLanguage value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(VersionInfo)
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Version()
	 * @model containment="true"
	 * @generated
	 */
	VersionInfo getVersion();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.Thing#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionInfo value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.PropertyAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAffordance> getProperties();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.ActionAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionAffordance> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.EventAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventAffordance> getEvents();

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.wot.td.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference list.
	 * @see edu.uoc.som.wot.td.TdPackage#getThing_SecurityDefinitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SecurityScheme> getSecurityDefinitions();

} // Thing
