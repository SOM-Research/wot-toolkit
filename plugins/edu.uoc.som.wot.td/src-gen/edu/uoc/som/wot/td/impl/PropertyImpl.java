/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.Property;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#getConst <em>Const</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#isWritable <em>Writable</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyImpl#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends InteractionPatternImpl implements Property {
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
	 * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected boolean writable = WRITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected boolean observable = OBSERVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__DESCRIPTION, oldDescription,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__CONST, oldConst, const_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWritable() {
		return writable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritable(boolean newWritable) {
		boolean oldWritable = writable;
		writable = newWritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__WRITABLE, oldWritable, writable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservable(boolean newObservable) {
		boolean oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY__OBSERVABLE, oldObservable,
					observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.PROPERTY__TYPE:
			return getType();
		case TdPackage.PROPERTY__DESCRIPTION:
			return getDescription();
		case TdPackage.PROPERTY__CONST:
			return getConst();
		case TdPackage.PROPERTY__ENUM:
			return getEnum();
		case TdPackage.PROPERTY__WRITABLE:
			return isWritable();
		case TdPackage.PROPERTY__OBSERVABLE:
			return isObservable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TdPackage.PROPERTY__TYPE:
			setType((String) newValue);
			return;
		case TdPackage.PROPERTY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.PROPERTY__CONST:
			setConst(newValue);
			return;
		case TdPackage.PROPERTY__ENUM:
			setEnum(newValue);
			return;
		case TdPackage.PROPERTY__WRITABLE:
			setWritable((Boolean) newValue);
			return;
		case TdPackage.PROPERTY__OBSERVABLE:
			setObservable((Boolean) newValue);
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
		case TdPackage.PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TdPackage.PROPERTY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.PROPERTY__CONST:
			setConst(CONST_EDEFAULT);
			return;
		case TdPackage.PROPERTY__ENUM:
			setEnum(ENUM_EDEFAULT);
			return;
		case TdPackage.PROPERTY__WRITABLE:
			setWritable(WRITABLE_EDEFAULT);
			return;
		case TdPackage.PROPERTY__OBSERVABLE:
			setObservable(OBSERVABLE_EDEFAULT);
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
		case TdPackage.PROPERTY__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case TdPackage.PROPERTY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.PROPERTY__CONST:
			return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
		case TdPackage.PROPERTY__ENUM:
			return ENUM_EDEFAULT == null ? enum_ != null : !ENUM_EDEFAULT.equals(enum_);
		case TdPackage.PROPERTY__WRITABLE:
			return writable != WRITABLE_EDEFAULT;
		case TdPackage.PROPERTY__OBSERVABLE:
			return observable != OBSERVABLE_EDEFAULT;
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
			case TdPackage.PROPERTY__TYPE:
				return TdPackage.DATA_SCHEMA__TYPE;
			case TdPackage.PROPERTY__DESCRIPTION:
				return TdPackage.DATA_SCHEMA__DESCRIPTION;
			case TdPackage.PROPERTY__CONST:
				return TdPackage.DATA_SCHEMA__CONST;
			case TdPackage.PROPERTY__ENUM:
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
				return TdPackage.PROPERTY__TYPE;
			case TdPackage.DATA_SCHEMA__DESCRIPTION:
				return TdPackage.PROPERTY__DESCRIPTION;
			case TdPackage.DATA_SCHEMA__CONST:
				return TdPackage.PROPERTY__CONST;
			case TdPackage.DATA_SCHEMA__ENUM:
				return TdPackage.PROPERTY__ENUM;
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
		result.append(", writable: ");
		result.append(writable);
		result.append(", observable: ");
		result.append(observable);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
