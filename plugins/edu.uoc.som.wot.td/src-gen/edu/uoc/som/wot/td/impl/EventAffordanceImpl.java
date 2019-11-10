/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.EventAffordance;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventAffordanceImpl#getData <em>Data</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventAffordanceImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.EventAffordanceImpl#getCancellation <em>Cancellation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventAffordanceImpl extends InteractionAffordanceImpl implements EventAffordance {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataSchema data;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected DataSchema subscription;

	/**
	 * The cached value of the '{@link #getCancellation() <em>Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellation()
	 * @generated
	 * @ordered
	 */
	protected DataSchema cancellation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.EVENT_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataSchema newData, NotificationChain msgs) {
		DataSchema oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.EVENT_AFFORDANCE__DATA, oldData, newData);
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
	@Override
	public void setData(DataSchema newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject) data).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject) newData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT_AFFORDANCE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(DataSchema newSubscription, NotificationChain msgs) {
		DataSchema oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION, oldSubscription, newSubscription);
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
	@Override
	public void setSubscription(DataSchema newSubscription) {
		if (newSubscription != subscription) {
			NotificationChain msgs = null;
			if (subscription != null)
				msgs = ((InternalEObject) subscription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION, null, msgs);
			if (newSubscription != null)
				msgs = ((InternalEObject) newSubscription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION, null, msgs);
			msgs = basicSetSubscription(newSubscription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION,
					newSubscription, newSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getCancellation() {
		return cancellation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancellation(DataSchema newCancellation, NotificationChain msgs) {
		DataSchema oldCancellation = cancellation;
		cancellation = newCancellation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.EVENT_AFFORDANCE__CANCELLATION, oldCancellation, newCancellation);
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
	@Override
	public void setCancellation(DataSchema newCancellation) {
		if (newCancellation != cancellation) {
			NotificationChain msgs = null;
			if (cancellation != null)
				msgs = ((InternalEObject) cancellation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__CANCELLATION, null, msgs);
			if (newCancellation != null)
				msgs = ((InternalEObject) newCancellation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.EVENT_AFFORDANCE__CANCELLATION, null, msgs);
			msgs = basicSetCancellation(newCancellation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.EVENT_AFFORDANCE__CANCELLATION,
					newCancellation, newCancellation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.EVENT_AFFORDANCE__DATA:
			return basicSetData(null, msgs);
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
			return basicSetSubscription(null, msgs);
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
			return basicSetCancellation(null, msgs);
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
		case TdPackage.EVENT_AFFORDANCE__DATA:
			return getData();
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
			return getSubscription();
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
			return getCancellation();
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
		case TdPackage.EVENT_AFFORDANCE__DATA:
			setData((DataSchema) newValue);
			return;
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
			setSubscription((DataSchema) newValue);
			return;
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
			setCancellation((DataSchema) newValue);
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
		case TdPackage.EVENT_AFFORDANCE__DATA:
			setData((DataSchema) null);
			return;
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
			setSubscription((DataSchema) null);
			return;
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
			setCancellation((DataSchema) null);
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
		case TdPackage.EVENT_AFFORDANCE__DATA:
			return data != null;
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
			return subscription != null;
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
			return cancellation != null;
		}
		return super.eIsSet(featureID);
	}

} //EventAffordanceImpl
