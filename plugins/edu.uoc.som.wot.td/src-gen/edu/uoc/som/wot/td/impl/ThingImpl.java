/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.Action;
import edu.uoc.som.wot.td.Event;
import edu.uoc.som.wot.td.Link;
import edu.uoc.som.wot.td.Property;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;
import edu.uoc.som.wot.td.Thing;

import java.net.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ThingImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final URI BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected URI base = BASE_EDEFAULT;

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
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScheme> security;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

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
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.THING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(URI newBase) {
		URI oldBase = base;
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
	public EList<SecurityScheme> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityScheme>(SecurityScheme.class, this,
					TdPackage.THING__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, TdPackage.THING__PROPERTIES);
		}
		return properties;
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
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, TdPackage.THING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, TdPackage.THING__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.THING__SECURITY:
			return ((InternalEList<?>) getSecurity()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case TdPackage.THING__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
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
		case TdPackage.THING__NAME:
			return getName();
		case TdPackage.THING__BASE:
			return getBase();
		case TdPackage.THING__ID:
			return getId();
		case TdPackage.THING__DESCRIPTION:
			return getDescription();
		case TdPackage.THING__SUPPORT:
			return getSupport();
		case TdPackage.THING__SECURITY:
			return getSecurity();
		case TdPackage.THING__PROPERTIES:
			return getProperties();
		case TdPackage.THING__LINKS:
			return getLinks();
		case TdPackage.THING__EVENTS:
			return getEvents();
		case TdPackage.THING__ACTIONS:
			return getActions();
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
		case TdPackage.THING__NAME:
			setName((String) newValue);
			return;
		case TdPackage.THING__BASE:
			setBase((URI) newValue);
			return;
		case TdPackage.THING__ID:
			setId((String) newValue);
			return;
		case TdPackage.THING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.THING__SUPPORT:
			setSupport((String) newValue);
			return;
		case TdPackage.THING__SECURITY:
			getSecurity().clear();
			getSecurity().addAll((Collection<? extends SecurityScheme>) newValue);
			return;
		case TdPackage.THING__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case TdPackage.THING__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TdPackage.THING__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case TdPackage.THING__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
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
		case TdPackage.THING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TdPackage.THING__BASE:
			setBase(BASE_EDEFAULT);
			return;
		case TdPackage.THING__ID:
			setId(ID_EDEFAULT);
			return;
		case TdPackage.THING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.THING__SUPPORT:
			setSupport(SUPPORT_EDEFAULT);
			return;
		case TdPackage.THING__SECURITY:
			getSecurity().clear();
			return;
		case TdPackage.THING__PROPERTIES:
			getProperties().clear();
			return;
		case TdPackage.THING__LINKS:
			getLinks().clear();
			return;
		case TdPackage.THING__EVENTS:
			getEvents().clear();
			return;
		case TdPackage.THING__ACTIONS:
			getActions().clear();
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
		case TdPackage.THING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TdPackage.THING__BASE:
			return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
		case TdPackage.THING__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TdPackage.THING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.THING__SUPPORT:
			return SUPPORT_EDEFAULT == null ? support != null : !SUPPORT_EDEFAULT.equals(support);
		case TdPackage.THING__SECURITY:
			return security != null && !security.isEmpty();
		case TdPackage.THING__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case TdPackage.THING__LINKS:
			return links != null && !links.isEmpty();
		case TdPackage.THING__EVENTS:
			return events != null && !events.isEmpty();
		case TdPackage.THING__ACTIONS:
			return actions != null && !actions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", base: ");
		result.append(base);
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", support: ");
		result.append(support);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
