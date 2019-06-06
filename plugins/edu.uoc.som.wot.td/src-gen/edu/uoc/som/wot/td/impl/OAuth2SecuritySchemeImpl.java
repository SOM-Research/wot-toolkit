/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.OAuth2SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.net.URI;

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
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl#getRefreshUrl <em>Refresh Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2SecuritySchemeImpl extends SecuritySchemeImpl implements OAuth2SecurityScheme {
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
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scopes;

	/**
	 * The default value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URI TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected URI tokenUrl = TOKEN_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URI AUTHORIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected URI authorizationUrl = AUTHORIZATION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshUrl() <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URI REFRESH_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshUrl() <em>Refresh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshUrl()
	 * @generated
	 * @ordered
	 */
	protected URI refreshUrl = REFRESH_URL_EDEFAULT;

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
	public URI getTokenUrl() {
		return tokenUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenUrl(URI newTokenUrl) {
		URI oldTokenUrl = tokenUrl;
		tokenUrl = newTokenUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL,
					oldTokenUrl, tokenUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationUrl(URI newAuthorizationUrl) {
		URI oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL,
					oldAuthorizationUrl, authorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getRefreshUrl() {
		return refreshUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshUrl(URI newRefreshUrl) {
		URI oldRefreshUrl = refreshUrl;
		refreshUrl = newRefreshUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL,
					oldRefreshUrl, refreshUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			return getFlow();
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			return getScopes();
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL:
			return getTokenUrl();
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL:
			return getAuthorizationUrl();
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL:
			return getRefreshUrl();
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			setFlow((String) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL:
			setTokenUrl((URI) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL:
			setAuthorizationUrl((URI) newValue);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL:
			setRefreshUrl((URI) newValue);
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			setFlow(FLOW_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			getScopes().clear();
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL:
			setTokenUrl(TOKEN_URL_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL:
			setAuthorizationUrl(AUTHORIZATION_URL_EDEFAULT);
			return;
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL:
			setRefreshUrl(REFRESH_URL_EDEFAULT);
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
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
			return FLOW_EDEFAULT == null ? flow != null : !FLOW_EDEFAULT.equals(flow);
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL:
			return TOKEN_URL_EDEFAULT == null ? tokenUrl != null : !TOKEN_URL_EDEFAULT.equals(tokenUrl);
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL:
			return AUTHORIZATION_URL_EDEFAULT == null ? authorizationUrl != null
					: !AUTHORIZATION_URL_EDEFAULT.equals(authorizationUrl);
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL:
			return REFRESH_URL_EDEFAULT == null ? refreshUrl != null : !REFRESH_URL_EDEFAULT.equals(refreshUrl);
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
		result.append(" (flow: ");
		result.append(flow);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(", tokenUrl: ");
		result.append(tokenUrl);
		result.append(", authorizationUrl: ");
		result.append(authorizationUrl);
		result.append(", refreshUrl: ");
		result.append(refreshUrl);
		result.append(')');
		return result.toString();
	}

} //OAuth2SecuritySchemeImpl
