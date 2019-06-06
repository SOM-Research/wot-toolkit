/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.PopSecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pop Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl#getAlg <em>Alg</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl#getIn <em>In</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopSecuritySchemeImpl extends SecuritySchemeImpl implements PopSecurityScheme {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlg() <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlg()
	 * @generated
	 * @ordered
	 */
	protected static final String ALG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlg() <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlg()
	 * @generated
	 * @ordered
	 */
	protected String alg = ALG_EDEFAULT;

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
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopSecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.POP_SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.POP_SECURITY_SCHEME__FORMAT, oldFormat,
					format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlg() {
		return alg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlg(String newAlg) {
		String oldAlg = alg;
		alg = newAlg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.POP_SECURITY_SCHEME__ALG, oldAlg, alg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.POP_SECURITY_SCHEME__AUTHORIZATION_URL,
					oldAuthorizationUrl, authorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.POP_SECURITY_SCHEME__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.POP_SECURITY_SCHEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.POP_SECURITY_SCHEME__FORMAT:
			return getFormat();
		case TdPackage.POP_SECURITY_SCHEME__ALG:
			return getAlg();
		case TdPackage.POP_SECURITY_SCHEME__AUTHORIZATION_URL:
			return getAuthorizationUrl();
		case TdPackage.POP_SECURITY_SCHEME__IN:
			return getIn();
		case TdPackage.POP_SECURITY_SCHEME__NAME:
			return getName();
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
		case TdPackage.POP_SECURITY_SCHEME__FORMAT:
			setFormat((String) newValue);
			return;
		case TdPackage.POP_SECURITY_SCHEME__ALG:
			setAlg((String) newValue);
			return;
		case TdPackage.POP_SECURITY_SCHEME__AUTHORIZATION_URL:
			setAuthorizationUrl((URI) newValue);
			return;
		case TdPackage.POP_SECURITY_SCHEME__IN:
			setIn((String) newValue);
			return;
		case TdPackage.POP_SECURITY_SCHEME__NAME:
			setName((String) newValue);
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
		case TdPackage.POP_SECURITY_SCHEME__FORMAT:
			setFormat(FORMAT_EDEFAULT);
			return;
		case TdPackage.POP_SECURITY_SCHEME__ALG:
			setAlg(ALG_EDEFAULT);
			return;
		case TdPackage.POP_SECURITY_SCHEME__AUTHORIZATION_URL:
			setAuthorizationUrl(AUTHORIZATION_URL_EDEFAULT);
			return;
		case TdPackage.POP_SECURITY_SCHEME__IN:
			setIn(IN_EDEFAULT);
			return;
		case TdPackage.POP_SECURITY_SCHEME__NAME:
			setName(NAME_EDEFAULT);
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
		case TdPackage.POP_SECURITY_SCHEME__FORMAT:
			return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		case TdPackage.POP_SECURITY_SCHEME__ALG:
			return ALG_EDEFAULT == null ? alg != null : !ALG_EDEFAULT.equals(alg);
		case TdPackage.POP_SECURITY_SCHEME__AUTHORIZATION_URL:
			return AUTHORIZATION_URL_EDEFAULT == null ? authorizationUrl != null
					: !AUTHORIZATION_URL_EDEFAULT.equals(authorizationUrl);
		case TdPackage.POP_SECURITY_SCHEME__IN:
			return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
		case TdPackage.POP_SECURITY_SCHEME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (format: ");
		result.append(format);
		result.append(", alg: ");
		result.append(alg);
		result.append(", authorizationUrl: ");
		result.append(authorizationUrl);
		result.append(", in: ");
		result.append(in);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PopSecuritySchemeImpl
