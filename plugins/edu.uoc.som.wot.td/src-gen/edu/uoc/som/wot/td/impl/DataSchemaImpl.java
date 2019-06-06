/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getAnyType <em>Any Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSchemaImpl extends MinimalEObjectImpl.Container implements DataSchema {
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
	 * The default value of the '{@link #getAnyType() <em>Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyType()
	 * @generated
	 * @ordered
	 */
	protected static final Object ANY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnyType() <em>Any Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyType()
	 * @generated
	 * @ordered
	 */
	protected Object anyType = ANY_TYPE_EDEFAULT;

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
	protected DataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.DATA_SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAnyType() {
		return anyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyType(Object newAnyType) {
		Object oldAnyType = anyType;
		anyType = newAnyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__ANY_TYPE, oldAnyType,
					anyType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.DATA_SCHEMA__TYPE:
			return getType();
		case TdPackage.DATA_SCHEMA__DESCRIPTION:
			return getDescription();
		case TdPackage.DATA_SCHEMA__ANY_TYPE:
			return getAnyType();
		case TdPackage.DATA_SCHEMA__ENUM:
			return getEnum();
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
		case TdPackage.DATA_SCHEMA__TYPE:
			setType((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__ANY_TYPE:
			setAnyType(newValue);
			return;
		case TdPackage.DATA_SCHEMA__ENUM:
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
		case TdPackage.DATA_SCHEMA__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__ANY_TYPE:
			setAnyType(ANY_TYPE_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__ENUM:
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
		case TdPackage.DATA_SCHEMA__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case TdPackage.DATA_SCHEMA__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.DATA_SCHEMA__ANY_TYPE:
			return ANY_TYPE_EDEFAULT == null ? anyType != null : !ANY_TYPE_EDEFAULT.equals(anyType);
		case TdPackage.DATA_SCHEMA__ENUM:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", anyType: ");
		result.append(anyType);
		result.append(", enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}

} //DataSchemaImpl
