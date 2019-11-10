/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.ExpectedResponse;
import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.TdPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getOp <em>Op</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#get_href <em>href</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getContentCoding <em>Content Coding</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getSubProtocol <em>Sub Protocol</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> op;

	/**
	 * The default value of the '{@link #get_href() <em>href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_href()
	 * @generated
	 * @ordered
	 */
	protected static final String _HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_href() <em>href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_href()
	 * @generated
	 * @ordered
	 */
	protected String _href = _HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentCoding() <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentCoding() <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCoding()
	 * @generated
	 * @ordered
	 */
	protected String contentCoding = CONTENT_CODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubProtocol() <em>Sub Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubProtocol() <em>Sub Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProtocol()
	 * @generated
	 * @ordered
	 */
	protected String subProtocol = SUB_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<String> security;

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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected ExpectedResponse response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOp() {
		if (op == null) {
			op = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.FORM__OP);
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_href() {
		return _href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_href(String new_href) {
		String old_href = _href;
		_href = new_href;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__HREF, old_href, _href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__CONTENT_TYPE, oldContentType,
					contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentCoding() {
		return contentCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentCoding(String newContentCoding) {
		String oldContentCoding = contentCoding;
		contentCoding = newContentCoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__CONTENT_CODING, oldContentCoding,
					contentCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubProtocol() {
		return subProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubProtocol(String newSubProtocol) {
		String oldSubProtocol = subProtocol;
		subProtocol = newSubProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__SUB_PROTOCOL, oldSubProtocol,
					subProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSecurity() {
		if (security == null) {
			security = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.FORM__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScopes() {
		if (scopes == null) {
			scopes = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.FORM__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpectedResponse getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(ExpectedResponse newResponse, NotificationChain msgs) {
		ExpectedResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdPackage.FORM__RESPONSE,
					oldResponse, newResponse);
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
	public void setResponse(ExpectedResponse newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject) response).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.FORM__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject) newResponse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.FORM__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return this._href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(final String href) {
		this._href = href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.FORM__RESPONSE:
			return basicSetResponse(null, msgs);
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
		case TdPackage.FORM__OP:
			return getOp();
		case TdPackage.FORM__HREF:
			return get_href();
		case TdPackage.FORM__CONTENT_TYPE:
			return getContentType();
		case TdPackage.FORM__CONTENT_CODING:
			return getContentCoding();
		case TdPackage.FORM__SUB_PROTOCOL:
			return getSubProtocol();
		case TdPackage.FORM__SECURITY:
			return getSecurity();
		case TdPackage.FORM__SCOPES:
			return getScopes();
		case TdPackage.FORM__RESPONSE:
			return getResponse();
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
		case TdPackage.FORM__OP:
			getOp().clear();
			getOp().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.FORM__HREF:
			set_href((String) newValue);
			return;
		case TdPackage.FORM__CONTENT_TYPE:
			setContentType((String) newValue);
			return;
		case TdPackage.FORM__CONTENT_CODING:
			setContentCoding((String) newValue);
			return;
		case TdPackage.FORM__SUB_PROTOCOL:
			setSubProtocol((String) newValue);
			return;
		case TdPackage.FORM__SECURITY:
			getSecurity().clear();
			getSecurity().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.FORM__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.FORM__RESPONSE:
			setResponse((ExpectedResponse) newValue);
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
		case TdPackage.FORM__OP:
			getOp().clear();
			return;
		case TdPackage.FORM__HREF:
			set_href(_HREF_EDEFAULT);
			return;
		case TdPackage.FORM__CONTENT_TYPE:
			setContentType(CONTENT_TYPE_EDEFAULT);
			return;
		case TdPackage.FORM__CONTENT_CODING:
			setContentCoding(CONTENT_CODING_EDEFAULT);
			return;
		case TdPackage.FORM__SUB_PROTOCOL:
			setSubProtocol(SUB_PROTOCOL_EDEFAULT);
			return;
		case TdPackage.FORM__SECURITY:
			getSecurity().clear();
			return;
		case TdPackage.FORM__SCOPES:
			getScopes().clear();
			return;
		case TdPackage.FORM__RESPONSE:
			setResponse((ExpectedResponse) null);
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
		case TdPackage.FORM__OP:
			return op != null && !op.isEmpty();
		case TdPackage.FORM__HREF:
			return _HREF_EDEFAULT == null ? _href != null : !_HREF_EDEFAULT.equals(_href);
		case TdPackage.FORM__CONTENT_TYPE:
			return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
		case TdPackage.FORM__CONTENT_CODING:
			return CONTENT_CODING_EDEFAULT == null ? contentCoding != null
					: !CONTENT_CODING_EDEFAULT.equals(contentCoding);
		case TdPackage.FORM__SUB_PROTOCOL:
			return SUB_PROTOCOL_EDEFAULT == null ? subProtocol != null : !SUB_PROTOCOL_EDEFAULT.equals(subProtocol);
		case TdPackage.FORM__SECURITY:
			return security != null && !security.isEmpty();
		case TdPackage.FORM__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case TdPackage.FORM__RESPONSE:
			return response != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TdPackage.FORM___GET_HREF:
			return getHref();
		case TdPackage.FORM___SET_HREF__STRING:
			setHref((String) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (op: ");
		result.append(op);
		result.append(", _href: ");
		result.append(_href);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", contentCoding: ");
		result.append(contentCoding);
		result.append(", subProtocol: ");
		result.append(subProtocol);
		result.append(", security: ");
		result.append(security);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(')');
		return result.toString();
	}

} //FormImpl
