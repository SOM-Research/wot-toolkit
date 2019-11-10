/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.ActionAffordance;
import edu.uoc.som.wot.td.EventAffordance;
import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.Link;
import edu.uoc.som.wot.td.MultiLanguage;
import edu.uoc.som.wot.td.PropertyAffordance;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;
import edu.uoc.som.wot.td.Thing;
import edu.uoc.som.wot.td.VersionInfo;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected String support = SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<String> security;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage titles;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage descriptions;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionInfo version;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAffordance> properties;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionAffordance> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAffordance> events;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScheme> securityDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(XMLGregorianCalendar newCreated) {
		XMLGregorianCalendar oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(XMLGregorianCalendar newModified) {
		XMLGregorianCalendar oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupport() {
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupport(String newSupport) {
		String oldSupport = support;
		support = newSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__SUPPORT, oldSupport, support));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSecurity() {
		if (security == null) {
			security = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.THING__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, TdPackage.THING__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TdPackage.THING__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getTitles() {
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitles(MultiLanguage newTitles, NotificationChain msgs) {
		MultiLanguage oldTitles = titles;
		titles = newTitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdPackage.THING__TITLES,
					oldTitles, newTitles);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitles(MultiLanguage newTitles) {
		if (newTitles != titles) {
			NotificationChain msgs = null;
			if (titles != null)
				msgs = ((InternalEObject) titles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdPackage.THING__TITLES,
						null, msgs);
			if (newTitles != null)
				msgs = ((InternalEObject) newTitles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdPackage.THING__TITLES,
						null, msgs);
			msgs = basicSetTitles(newTitles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__TITLES, newTitles, newTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptions(MultiLanguage newDescriptions, NotificationChain msgs) {
		MultiLanguage oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.THING__DESCRIPTIONS, oldDescriptions, newDescriptions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptions(MultiLanguage newDescriptions) {
		if (newDescriptions != descriptions) {
			NotificationChain msgs = null;
			if (descriptions != null)
				msgs = ((InternalEObject) descriptions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.THING__DESCRIPTIONS, null, msgs);
			if (newDescriptions != null)
				msgs = ((InternalEObject) newDescriptions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.THING__DESCRIPTIONS, null, msgs);
			msgs = basicSetDescriptions(newDescriptions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__DESCRIPTIONS, newDescriptions,
					newDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionInfo getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(VersionInfo newVersion, NotificationChain msgs) {
		VersionInfo oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdPackage.THING__VERSION,
					oldVersion, newVersion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(VersionInfo newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject) version).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.THING__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.THING__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyAffordance> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyAffordance>(PropertyAffordance.class, this,
					TdPackage.THING__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionAffordance> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ActionAffordance>(ActionAffordance.class, this,
					TdPackage.THING__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventAffordance> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EventAffordance>(EventAffordance.class, this, TdPackage.THING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScheme> getSecurityDefinitions() {
		if (securityDefinitions == null) {
			securityDefinitions = new EObjectContainmentEList<SecurityScheme>(SecurityScheme.class, this,
					TdPackage.THING__SECURITY_DEFINITIONS);
		}
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.THING__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__TITLES:
			return basicSetTitles(null, msgs);
		case TdPackage.THING__DESCRIPTIONS:
			return basicSetDescriptions(null, msgs);
		case TdPackage.THING__VERSION:
			return basicSetVersion(null, msgs);
		case TdPackage.THING__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__SECURITY_DEFINITIONS:
			return ((InternalEList<?>) getSecurityDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.THING__ID:
			return getId();
		case TdPackage.THING__TITLE:
			return getTitle();
		case TdPackage.THING__DESCRIPTION:
			return getDescription();
		case TdPackage.THING__CREATED:
			return getCreated();
		case TdPackage.THING__MODIFIED:
			return getModified();
		case TdPackage.THING__SUPPORT:
			return getSupport();
		case TdPackage.THING__BASE:
			return getBase();
		case TdPackage.THING__SECURITY:
			return getSecurity();
		case TdPackage.THING__FORMS:
			return getForms();
		case TdPackage.THING__LINKS:
			return getLinks();
		case TdPackage.THING__TITLES:
			return getTitles();
		case TdPackage.THING__DESCRIPTIONS:
			return getDescriptions();
		case TdPackage.THING__VERSION:
			return getVersion();
		case TdPackage.THING__PROPERTIES:
			return getProperties();
		case TdPackage.THING__ACTIONS:
			return getActions();
		case TdPackage.THING__EVENTS:
			return getEvents();
		case TdPackage.THING__SECURITY_DEFINITIONS:
			return getSecurityDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TdPackage.THING__ID:
			setId((String) newValue);
			return;
		case TdPackage.THING__TITLE:
			setTitle((String) newValue);
			return;
		case TdPackage.THING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.THING__CREATED:
			setCreated((XMLGregorianCalendar) newValue);
			return;
		case TdPackage.THING__MODIFIED:
			setModified((XMLGregorianCalendar) newValue);
			return;
		case TdPackage.THING__SUPPORT:
			setSupport((String) newValue);
			return;
		case TdPackage.THING__BASE:
			setBase((String) newValue);
			return;
		case TdPackage.THING__SECURITY:
			getSecurity().clear();
			getSecurity().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.THING__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
			return;
		case TdPackage.THING__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TdPackage.THING__TITLES:
			setTitles((MultiLanguage) newValue);
			return;
		case TdPackage.THING__DESCRIPTIONS:
			setDescriptions((MultiLanguage) newValue);
			return;
		case TdPackage.THING__VERSION:
			setVersion((VersionInfo) newValue);
			return;
		case TdPackage.THING__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends PropertyAffordance>) newValue);
			return;
		case TdPackage.THING__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends ActionAffordance>) newValue);
			return;
		case TdPackage.THING__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends EventAffordance>) newValue);
			return;
		case TdPackage.THING__SECURITY_DEFINITIONS:
			getSecurityDefinitions().clear();
			getSecurityDefinitions().addAll((Collection<? extends SecurityScheme>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TdPackage.THING__ID:
			setId(ID_EDEFAULT);
			return;
		case TdPackage.THING__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TdPackage.THING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.THING__CREATED:
			setCreated(CREATED_EDEFAULT);
			return;
		case TdPackage.THING__MODIFIED:
			setModified(MODIFIED_EDEFAULT);
			return;
		case TdPackage.THING__SUPPORT:
			setSupport(SUPPORT_EDEFAULT);
			return;
		case TdPackage.THING__BASE:
			setBase(BASE_EDEFAULT);
			return;
		case TdPackage.THING__SECURITY:
			getSecurity().clear();
			return;
		case TdPackage.THING__FORMS:
			getForms().clear();
			return;
		case TdPackage.THING__LINKS:
			getLinks().clear();
			return;
		case TdPackage.THING__TITLES:
			setTitles((MultiLanguage) null);
			return;
		case TdPackage.THING__DESCRIPTIONS:
			setDescriptions((MultiLanguage) null);
			return;
		case TdPackage.THING__VERSION:
			setVersion((VersionInfo) null);
			return;
		case TdPackage.THING__PROPERTIES:
			getProperties().clear();
			return;
		case TdPackage.THING__ACTIONS:
			getActions().clear();
			return;
		case TdPackage.THING__EVENTS:
			getEvents().clear();
			return;
		case TdPackage.THING__SECURITY_DEFINITIONS:
			getSecurityDefinitions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TdPackage.THING__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TdPackage.THING__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case TdPackage.THING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.THING__CREATED:
			return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
		case TdPackage.THING__MODIFIED:
			return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
		case TdPackage.THING__SUPPORT:
			return SUPPORT_EDEFAULT == null ? support != null : !SUPPORT_EDEFAULT.equals(support);
		case TdPackage.THING__BASE:
			return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
		case TdPackage.THING__SECURITY:
			return security != null && !security.isEmpty();
		case TdPackage.THING__FORMS:
			return forms != null && !forms.isEmpty();
		case TdPackage.THING__LINKS:
			return links != null && !links.isEmpty();
		case TdPackage.THING__TITLES:
			return titles != null;
		case TdPackage.THING__DESCRIPTIONS:
			return descriptions != null;
		case TdPackage.THING__VERSION:
			return version != null;
		case TdPackage.THING__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case TdPackage.THING__ACTIONS:
			return actions != null && !actions.isEmpty();
		case TdPackage.THING__EVENTS:
			return events != null && !events.isEmpty();
		case TdPackage.THING__SECURITY_DEFINITIONS:
			return securityDefinitions != null && !securityDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(", support: ");
		result.append(support);
		result.append(", base: ");
		result.append(base);
		result.append(", security: ");
		result.append(security);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
