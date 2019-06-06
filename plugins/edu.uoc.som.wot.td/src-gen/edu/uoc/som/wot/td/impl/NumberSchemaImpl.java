/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.NumberSchema;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.NumberSchemaImpl#getMinumum <em>Minumum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.NumberSchemaImpl#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberSchemaImpl extends DataSchemaImpl implements NumberSchema {
	/**
	 * The default value of the '{@link #getMinumum() <em>Minumum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinumum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinumum() <em>Minumum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinumum()
	 * @generated
	 * @ordered
	 */
	protected double minumum = MINUMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.NUMBER_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinumum() {
		return minumum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinumum(double newMinumum) {
		double oldMinumum = minumum;
		minumum = newMinumum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.NUMBER_SCHEMA__MINUMUM, oldMinumum,
					minumum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.NUMBER_SCHEMA__MAXIMUM, oldMaximum,
					maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.NUMBER_SCHEMA__MINUMUM:
			return getMinumum();
		case TdPackage.NUMBER_SCHEMA__MAXIMUM:
			return getMaximum();
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
		case TdPackage.NUMBER_SCHEMA__MINUMUM:
			setMinumum((Double) newValue);
			return;
		case TdPackage.NUMBER_SCHEMA__MAXIMUM:
			setMaximum((Double) newValue);
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
		case TdPackage.NUMBER_SCHEMA__MINUMUM:
			setMinumum(MINUMUM_EDEFAULT);
			return;
		case TdPackage.NUMBER_SCHEMA__MAXIMUM:
			setMaximum(MAXIMUM_EDEFAULT);
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
		case TdPackage.NUMBER_SCHEMA__MINUMUM:
			return minumum != MINUMUM_EDEFAULT;
		case TdPackage.NUMBER_SCHEMA__MAXIMUM:
			return maximum != MAXIMUM_EDEFAULT;
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
		result.append(" (minumum: ");
		result.append(minumum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(')');
		return result.toString();
	}

} //NumberSchemaImpl
