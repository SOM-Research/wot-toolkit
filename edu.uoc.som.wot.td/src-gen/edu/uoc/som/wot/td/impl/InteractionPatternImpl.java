/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.InteractionPattern;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionPatternImpl extends MinimalEObjectImpl.Container implements InteractionPattern {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scopes;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScheme> security;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.INTERACTION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.INTERACTION_PATTERN__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScopes() {
		if (scopes == null) {
			scopes = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.INTERACTION_PATTERN__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScheme> getSecurity() {
		if (security == null) {
			security = new EObjectResolvingEList<SecurityScheme>(SecurityScheme.class, this,
					TdPackage.INTERACTION_PATTERN__SECURITY);
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
			forms = new EObjectContainmentEList<Form>(Form.class, this, TdPackage.INTERACTION_PATTERN__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.INTERACTION_PATTERN__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
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
		case TdPackage.INTERACTION_PATTERN__LABEL:
			return getLabel();
		case TdPackage.INTERACTION_PATTERN__SCOPES:
			return getScopes();
		case TdPackage.INTERACTION_PATTERN__SECURITY:
			return getSecurity();
		case TdPackage.INTERACTION_PATTERN__FORMS:
			return getForms();
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
		case TdPackage.INTERACTION_PATTERN__LABEL:
			setLabel((String) newValue);
			return;
		case TdPackage.INTERACTION_PATTERN__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.INTERACTION_PATTERN__SECURITY:
			getSecurity().clear();
			getSecurity().addAll((Collection<? extends SecurityScheme>) newValue);
			return;
		case TdPackage.INTERACTION_PATTERN__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
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
		case TdPackage.INTERACTION_PATTERN__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case TdPackage.INTERACTION_PATTERN__SCOPES:
			getScopes().clear();
			return;
		case TdPackage.INTERACTION_PATTERN__SECURITY:
			getSecurity().clear();
			return;
		case TdPackage.INTERACTION_PATTERN__FORMS:
			getForms().clear();
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
		case TdPackage.INTERACTION_PATTERN__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case TdPackage.INTERACTION_PATTERN__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case TdPackage.INTERACTION_PATTERN__SECURITY:
			return security != null && !security.isEmpty();
		case TdPackage.INTERACTION_PATTERN__FORMS:
			return forms != null && !forms.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(')');
		return result.toString();
	}

} //InteractionPatternImpl
