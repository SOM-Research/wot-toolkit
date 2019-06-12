/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.Event;
import edu.uoc.som.wot.td.TdPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventImpl#getConst <em>Const</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends InteractionPatternImpl implements Event {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected Object const_ = CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected Object enum_ = ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConst(Object newConst) {
		Object oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT__CONST, oldConst, const_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(Object newEnum) {
		Object oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.EVENT__TYPE:
			return getType();
		case TdPackage.EVENT__DESCRIPTION:
			return getDescription();
		case TdPackage.EVENT__CONST:
			return getConst();
		case TdPackage.EVENT__ENUM:
			return getEnum();
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
		case TdPackage.EVENT__TYPE:
			setType((String) newValue);
			return;
		case TdPackage.EVENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.EVENT__CONST:
			setConst(newValue);
			return;
		case TdPackage.EVENT__ENUM:
			setEnum(newValue);
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
		case TdPackage.EVENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TdPackage.EVENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.EVENT__CONST:
			setConst(CONST_EDEFAULT);
			return;
		case TdPackage.EVENT__ENUM:
			setEnum(ENUM_EDEFAULT);
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
		case TdPackage.EVENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case TdPackage.EVENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.EVENT__CONST:
			return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
		case TdPackage.EVENT__ENUM:
			return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataSchema.class) {
			switch (derivedFeatureID) {
			case TdPackage.EVENT__TYPE:
				return TdPackage.DATA_SCHEMA__TYPE;
			case TdPackage.EVENT__DESCRIPTION:
				return TdPackage.DATA_SCHEMA__DESCRIPTION;
			case TdPackage.EVENT__CONST:
				return TdPackage.DATA_SCHEMA__CONST;
			case TdPackage.EVENT__ENUM:
				return TdPackage.DATA_SCHEMA__ENUM;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataSchema.class) {
			switch (baseFeatureID) {
			case TdPackage.DATA_SCHEMA__TYPE:
				return TdPackage.EVENT__TYPE;
			case TdPackage.DATA_SCHEMA__DESCRIPTION:
				return TdPackage.EVENT__DESCRIPTION;
			case TdPackage.DATA_SCHEMA__CONST:
				return TdPackage.EVENT__CONST;
			case TdPackage.DATA_SCHEMA__ENUM:
				return TdPackage.EVENT__ENUM;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", const: ");
		result.append(const_);
		result.append(", enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}

} //EventImpl
