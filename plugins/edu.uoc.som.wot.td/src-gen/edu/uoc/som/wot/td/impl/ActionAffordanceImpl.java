/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.ActionAffordance;
import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.TdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl#isSafe <em>Safe</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionAffordanceImpl extends InteractionAffordanceImpl implements ActionAffordance {
	/**
	 * The default value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected boolean safe = SAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDEMPOTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotent()
	 * @generated
	 * @ordered
	 */
	protected boolean idempotent = IDEMPOTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected DataSchema input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected DataSchema output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.ACTION_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSafe() {
		return safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafe(boolean newSafe) {
		boolean oldSafe = safe;
		safe = newSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ACTION_AFFORDANCE__SAFE, oldSafe, safe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIdempotent() {
		return idempotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdempotent(boolean newIdempotent) {
		boolean oldIdempotent = idempotent;
		idempotent = newIdempotent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ACTION_AFFORDANCE__IDEMPOTENT,
					oldIdempotent, idempotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(DataSchema newInput, NotificationChain msgs) {
		DataSchema oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.ACTION_AFFORDANCE__INPUT, oldInput, newInput);
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
	public void setInput(DataSchema newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.ACTION_AFFORDANCE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.ACTION_AFFORDANCE__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ACTION_AFFORDANCE__INPUT, newInput,
					newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(DataSchema newOutput, NotificationChain msgs) {
		DataSchema oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.ACTION_AFFORDANCE__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(DataSchema newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.ACTION_AFFORDANCE__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.ACTION_AFFORDANCE__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.ACTION_AFFORDANCE__OUTPUT, newOutput,
					newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.ACTION_AFFORDANCE__INPUT:
			return basicSetInput(null, msgs);
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
			return basicSetOutput(null, msgs);
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
		case TdPackage.ACTION_AFFORDANCE__SAFE:
			return isSafe();
		case TdPackage.ACTION_AFFORDANCE__IDEMPOTENT:
			return isIdempotent();
		case TdPackage.ACTION_AFFORDANCE__INPUT:
			return getInput();
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
			return getOutput();
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
		case TdPackage.ACTION_AFFORDANCE__SAFE:
			setSafe((Boolean) newValue);
			return;
		case TdPackage.ACTION_AFFORDANCE__IDEMPOTENT:
			setIdempotent((Boolean) newValue);
			return;
		case TdPackage.ACTION_AFFORDANCE__INPUT:
			setInput((DataSchema) newValue);
			return;
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
			setOutput((DataSchema) newValue);
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
		case TdPackage.ACTION_AFFORDANCE__SAFE:
			setSafe(SAFE_EDEFAULT);
			return;
		case TdPackage.ACTION_AFFORDANCE__IDEMPOTENT:
			setIdempotent(IDEMPOTENT_EDEFAULT);
			return;
		case TdPackage.ACTION_AFFORDANCE__INPUT:
			setInput((DataSchema) null);
			return;
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
			setOutput((DataSchema) null);
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
		case TdPackage.ACTION_AFFORDANCE__SAFE:
			return safe != SAFE_EDEFAULT;
		case TdPackage.ACTION_AFFORDANCE__IDEMPOTENT:
			return idempotent != IDEMPOTENT_EDEFAULT;
		case TdPackage.ACTION_AFFORDANCE__INPUT:
			return input != null;
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
			return output != null;
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
		result.append(" (safe: ");
		result.append(safe);
		result.append(", idempotent: ");
		result.append(idempotent);
		result.append(')');
		return result.toString();
	}

} //ActionAffordanceImpl
