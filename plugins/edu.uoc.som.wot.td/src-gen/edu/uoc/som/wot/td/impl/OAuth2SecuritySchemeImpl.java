/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.OAuth2SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getRefresh <em>Refresh</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2SecuritySchemeImpl extends SecuritySchemeImpl implements OAuth2SecurityScheme {
	/**
	 * The default value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected String authorization = AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh()
	 * @generated
	 * @ordered
	 */
	protected String refresh = REFRESH_EDEFAULT;

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
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected String flow = FLOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.OAUTH2_SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorization(String newAuthorization) {
		String oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION,
					oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN, oldToken,
					token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefresh() {
		return refresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefresh(String newRefresh) {
		String oldRefresh = refresh;
		refresh = newRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH, oldRefresh,
					refresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScopes() {
		if (scopes == null) {
			scopes = new EDataTypeUniqueEList<String>(String.class, this, TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlow(String newFlow) {
		String oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__FLOW, oldFlow,
					flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
			return getAuthorization();
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
			return getToken();
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
			return getRefresh();
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			return getScopes();
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			return getFlow();
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
			setAuthorization((String) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
			setToken((String) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
			setRefresh((String) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			setFlow((String) newValue);
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
			setAuthorization(AUTHORIZATION_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
			setToken(TOKEN_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
			setRefresh(REFRESH_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			getScopes().clear();
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			setFlow(FLOW_EDEFAULT);
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
			return AUTHORIZATION_EDEFAULT == null ? authorization != null
					: !AUTHORIZATION_EDEFAULT.equals(authorization);
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
			return REFRESH_EDEFAULT == null ? refresh != null : !REFRESH_EDEFAULT.equals(refresh);
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			return FLOW_EDEFAULT == null ? flow != null : !FLOW_EDEFAULT.equals(flow);
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
		result.append(" (authorization: ");
		result.append(authorization);
		result.append(", token: ");
		result.append(token);
		result.append(", refresh: ");
		result.append(refresh);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(", flow: ");
		result.append(flow);
		result.append(')');
		return result.toString();
	}

} //OAuth2SecuritySchemeImpl
