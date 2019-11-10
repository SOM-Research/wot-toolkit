/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.InteractionAffordance;
import edu.uoc.som.wot.td.MultiLanguage;
import edu.uoc.som.wot.td.TdPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Interaction Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getItitle <em>Ititle</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getIdescription <em>Idescription</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getUriVariable <em>Uri Variable</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getItitles <em>Ititles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl#getIdescriptions <em>Idescriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionAffordanceImpl extends MinimalEObjectImpl.Container implements InteractionAffordance {
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
	 * The default value of the '{@link #getItitle() <em>Ititle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ITITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItitle() <em>Ititle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItitle()
	 * @generated
	 * @ordered
	 */
	protected String ititle = ITITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdescription() <em>Idescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String IDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdescription() <em>Idescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdescription()
	 * @generated
	 * @ordered
	 */
	protected String idescription = IDESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getUriVariable() <em>Uri Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSchema> uriVariable;

	/**
	 * The cached value of the '{@link #getItitles() <em>Ititles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItitles()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage ititles;

	/**
	 * The cached value of the '{@link #getIdescriptions() <em>Idescriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdescriptions()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage idescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.INTERACTION_AFFORDANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_AFFORDANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItitle() {
		return ititle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItitle(String newItitle) {
		String oldItitle = ititle;
		ititle = newItitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_AFFORDANCE__ITITLE, oldItitle,
					ititle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdescription() {
		return idescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdescription(String newIdescription) {
		String oldIdescription = idescription;
		idescription = newIdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION,
					oldIdescription, idescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, TdPackage.INTERACTION_AFFORDANCE__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSchema> getUriVariable() {
		if (uriVariable == null) {
			uriVariable = new EObjectContainmentEList<DataSchema>(DataSchema.class, this,
					TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE);
		}
		return uriVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getItitles() {
		return ititles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItitles(MultiLanguage newItitles, NotificationChain msgs) {
		MultiLanguage oldItitles = ititles;
		ititles = newItitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.INTERACTION_AFFORDANCE__ITITLES, oldItitles, newItitles);
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
	public void setItitles(MultiLanguage newItitles) {
		if (newItitles != ititles) {
			NotificationChain msgs = null;
			if (ititles != null)
				msgs = ((InternalEObject) ititles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.INTERACTION_AFFORDANCE__ITITLES, null, msgs);
			if (newItitles != null)
				msgs = ((InternalEObject) newItitles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.INTERACTION_AFFORDANCE__ITITLES, null, msgs);
			msgs = basicSetItitles(newItitles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_AFFORDANCE__ITITLES, newItitles,
					newItitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getIdescriptions() {
		return idescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdescriptions(MultiLanguage newIdescriptions, NotificationChain msgs) {
		MultiLanguage oldIdescriptions = idescriptions;
		idescriptions = newIdescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS, oldIdescriptions, newIdescriptions);
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
	public void setIdescriptions(MultiLanguage newIdescriptions) {
		if (newIdescriptions != idescriptions) {
			NotificationChain msgs = null;
			if (idescriptions != null)
				msgs = ((InternalEObject) idescriptions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS, null, msgs);
			if (newIdescriptions != null)
				msgs = ((InternalEObject) newIdescriptions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS, null, msgs);
			msgs = basicSetIdescriptions(newIdescriptions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS,
					newIdescriptions, newIdescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return this.ititle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String title) {
		this.ititle = title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return this.idescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(final String description) {
		this.idescription = description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getTitles() {
		return this.ititles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitles(final MultiLanguage titles) {
		this.ititles = titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getDescriptions() {
		return this.idescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptions(final MultiLanguage descriptions) {
		this.idescriptions = descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
			return ((InternalEList<?>) getUriVariable()).basicRemove(otherEnd, msgs);
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
			return basicSetItitles(null, msgs);
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
			return basicSetIdescriptions(null, msgs);
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
		case TdPackage.INTERACTION_AFFORDANCE__ID:
			return getId();
		case TdPackage.INTERACTION_AFFORDANCE__ITITLE:
			return getItitle();
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION:
			return getIdescription();
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
			return getForms();
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
			return getUriVariable();
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
			return getItitles();
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
			return getIdescriptions();
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
		case TdPackage.INTERACTION_AFFORDANCE__ID:
			setId((String) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__ITITLE:
			setItitle((String) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION:
			setIdescription((String) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
			getUriVariable().clear();
			getUriVariable().addAll((Collection<? extends DataSchema>) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
			setItitles((MultiLanguage) newValue);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
			setIdescriptions((MultiLanguage) newValue);
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
		case TdPackage.INTERACTION_AFFORDANCE__ID:
			setId(ID_EDEFAULT);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__ITITLE:
			setItitle(ITITLE_EDEFAULT);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION:
			setIdescription(IDESCRIPTION_EDEFAULT);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
			getForms().clear();
			return;
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
			getUriVariable().clear();
			return;
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
			setItitles((MultiLanguage) null);
			return;
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
			setIdescriptions((MultiLanguage) null);
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
		case TdPackage.INTERACTION_AFFORDANCE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TdPackage.INTERACTION_AFFORDANCE__ITITLE:
			return ITITLE_EDEFAULT == null ? ititle != null : !ITITLE_EDEFAULT.equals(ititle);
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION:
			return IDESCRIPTION_EDEFAULT == null ? idescription != null : !IDESCRIPTION_EDEFAULT.equals(idescription);
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
			return forms != null && !forms.isEmpty();
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
			return uriVariable != null && !uriVariable.isEmpty();
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
			return ititles != null;
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
			return idescriptions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TdPackage.INTERACTION_AFFORDANCE___GET_TITLE:
			return getTitle();
		case TdPackage.INTERACTION_AFFORDANCE___SET_TITLE__STRING:
			setTitle((String) arguments.get(0));
			return null;
		case TdPackage.INTERACTION_AFFORDANCE___GET_DESCRIPTION:
			return getDescription();
		case TdPackage.INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING:
			setDescription((String) arguments.get(0));
			return null;
		case TdPackage.INTERACTION_AFFORDANCE___GET_TITLES:
			return getTitles();
		case TdPackage.INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE:
			setTitles((MultiLanguage) arguments.get(0));
			return null;
		case TdPackage.INTERACTION_AFFORDANCE___GET_DESCRIPTIONS:
			return getDescriptions();
		case TdPackage.INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE:
			setDescriptions((MultiLanguage) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", ititle: ");
		result.append(ititle);
		result.append(", idescription: ");
		result.append(idescription);
		result.append(')');
		return result.toString();
	}

} //InteractionAffordanceImpl
