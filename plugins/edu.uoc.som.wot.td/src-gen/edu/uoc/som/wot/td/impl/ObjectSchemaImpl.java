/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.ObjectSchema;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSchemaImpl extends DataSchemaImpl implements ObjectSchema {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSchema> properties;

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
	public EList<DataSchema> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DataSchema>(DataSchema.class, this,
					TdPackage.OBJECT_SCHEMA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			return getRequired();
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			return getProperties();
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
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			getRequired().clear();
			getRequired().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends DataSchema>) newValue);
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
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			getRequired().clear();
			return;
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			getProperties().clear();
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
		case TdPackage.OBJECT_SCHEMA__REQUIRED:
			return required != null && !required.isEmpty();
		case TdPackage.OBJECT_SCHEMA__PROPERTIES:
			return properties != null && !properties.isEmpty();
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