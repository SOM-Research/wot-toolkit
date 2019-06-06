/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.ArraySchema;
import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl#getMaxItems <em>Max Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArraySchemaImpl extends DataSchemaImpl implements ArraySchema {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected DataSchema items;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected int minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected int maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArraySchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.ARRAY_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getItems() {
		if (items != null && items.eIsProxy()) {
			InternalEObject oldItems = (InternalEObject) items;
			items = (DataSchema) eResolveProxy(oldItems);
			if (items != oldItems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TdPackage.ARRAY_SCHEMA__ITEMS, oldItems,
							items));
			}
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema basicGetItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems(DataSchema newItems) {
		DataSchema oldItems = items;
		items = newItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ARRAY_SCHEMA__ITEMS, oldItems, items));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItems(int newMinItems) {
		int oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ARRAY_SCHEMA__MIN_ITEMS, oldMinItems,
					minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems(int newMaxItems) {
		int oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ARRAY_SCHEMA__MAX_ITEMS, oldMaxItems,
					maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.ARRAY_SCHEMA__ITEMS:
			if (resolve)
				return getItems();
			return basicGetItems();
		case TdPackage.ARRAY_SCHEMA__MIN_ITEMS:
			return getMinItems();
		case TdPackage.ARRAY_SCHEMA__MAX_ITEMS:
			return getMaxItems();
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
		case TdPackage.ARRAY_SCHEMA__ITEMS:
			setItems((DataSchema) newValue);
			return;
		case TdPackage.ARRAY_SCHEMA__MIN_ITEMS:
			setMinItems((Integer) newValue);
			return;
		case TdPackage.ARRAY_SCHEMA__MAX_ITEMS:
			setMaxItems((Integer) newValue);
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
		case TdPackage.ARRAY_SCHEMA__ITEMS:
			setItems((DataSchema) null);
			return;
		case TdPackage.ARRAY_SCHEMA__MIN_ITEMS:
			setMinItems(MIN_ITEMS_EDEFAULT);
			return;
		case TdPackage.ARRAY_SCHEMA__MAX_ITEMS:
			setMaxItems(MAX_ITEMS_EDEFAULT);
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
		case TdPackage.ARRAY_SCHEMA__ITEMS:
			return items != null;
		case TdPackage.ARRAY_SCHEMA__MIN_ITEMS:
			return minItems != MIN_ITEMS_EDEFAULT;
		case TdPackage.ARRAY_SCHEMA__MAX_ITEMS:
			return maxItems != MAX_ITEMS_EDEFAULT;
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
		result.append(" (minItems: ");
		result.append(minItems);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(')');
		return result.toString();
	}

} //ArraySchemaImpl
