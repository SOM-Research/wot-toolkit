/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.ObjectSchema;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSchemaImpl extends DataSchemaImpl implements ObjectSchema {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected DataSchema properties;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<String> required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.OBJECT_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getProperties() {
		if (properties != null && properties.eIsProxy()) {
			InternalEObject oldProperties = (InternalEObject) properties;
			properties = (DataSchema) eResolveProxy(oldProperties);
			if (properties != oldProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TdPackage.OBJECT_SCHEMA__PROPERTIES,
							oldProperties, properties));
			}
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema basicGetProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperties(DataSchema newProperties) {
		DataSchema oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OBJECT_SCHEMA__PROPERTIES, oldProperties,
					properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequired() {
		if (required == null) {
			required = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.OBJECT_SCHEMA__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			if (resolve)
				return getProperties();
			return basicGetProperties();
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			return getRequired();
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
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			setProperties((DataSchema) newValue);
			return;
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			getRequired().clear();
			getRequired().addAll((Collection<? extends String>) newValue);
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
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			setProperties((DataSchema) null);
			return;
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			getRequired().clear();
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
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			return properties != null;
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			return required != null && !required.isEmpty();
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
		result.append(" (required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //ObjectSchemaImpl
