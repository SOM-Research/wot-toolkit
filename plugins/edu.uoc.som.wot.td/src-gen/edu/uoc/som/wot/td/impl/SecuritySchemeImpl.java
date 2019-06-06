/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl#getProxyUrl <em>Proxy Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySchemeImpl extends MinimalEObjectImpl.Container implements SecurityScheme {
	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

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
	 * The default value of the '{@link #getProxyUrl() <em>Proxy Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URI PROXY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyUrl() <em>Proxy Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyUrl()
	 * @generated
	 * @ordered
	 */
	protected URI proxyUrl = PROXY_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.SECURITY_SCHEME__SCHEME, oldScheme,
					scheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.SECURITY_SCHEME__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getProxyUrl() {
		return proxyUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyUrl(URI newProxyUrl) {
		URI oldProxyUrl = proxyUrl;
		proxyUrl = newProxyUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.SECURITY_SCHEME__PROXY_URL, oldProxyUrl,
					proxyUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.SECURITY_SCHEME__SCHEME:
			return getScheme();
		case TdPackage.SECURITY_SCHEME__DESCRIPTION:
			return getDescription();
		case TdPackage.SECURITY_SCHEME__PROXY_URL:
			return getProxyUrl();
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
		case TdPackage.SECURITY_SCHEME__SCHEME:
			setScheme((String) newValue);
			return;
		case TdPackage.SECURITY_SCHEME__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TdPackage.SECURITY_SCHEME__PROXY_URL:
			setProxyUrl((URI) newValue);
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
		case TdPackage.SECURITY_SCHEME__SCHEME:
			setScheme(SCHEME_EDEFAULT);
			return;
		case TdPackage.SECURITY_SCHEME__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TdPackage.SECURITY_SCHEME__PROXY_URL:
			setProxyUrl(PROXY_URL_EDEFAULT);
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
		case TdPackage.SECURITY_SCHEME__SCHEME:
			return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
		case TdPackage.SECURITY_SCHEME__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TdPackage.SECURITY_SCHEME__PROXY_URL:
			return PROXY_URL_EDEFAULT == null ? proxyUrl != null : !PROXY_URL_EDEFAULT.equals(proxyUrl);
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
		result.append(" (scheme: ");
		result.append(scheme);
		result.append(", description: ");
		result.append(description);
		result.append(", proxyUrl: ");
		result.append(proxyUrl);
		result.append(')');
		return result.toString();
	}

} //SecuritySchemeImpl
