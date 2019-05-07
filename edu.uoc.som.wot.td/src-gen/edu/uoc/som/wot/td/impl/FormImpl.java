/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.net.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getHref <em>Href</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getSubProtocol <em>Sub Protocol</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.FormImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final URI HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected URI href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected String rel = REL_EDEFAULT;

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
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scopes;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScheme> security;

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
	public URI getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(URI newHref) {
		URI oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRel(String newRel) {
		String oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.FORM__REL, oldRel, rel));
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
	public EList<SecurityScheme> getSecurity() {
		if (security == null) {
			security = new EObjectResolvingEList<SecurityScheme>(SecurityScheme.class, this, TdPackage.FORM__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.FORM__HREF:
			return getHref();
		case TdPackage.FORM__MEDIA_TYPE:
			return getMediaType();
		case TdPackage.FORM__REL:
			return getRel();
		case TdPackage.FORM__SUB_PROTOCOL:
			return getSubProtocol();
		case TdPackage.FORM__SCOPES:
			return getScopes();
		case TdPackage.FORM__SECURITY:
			return getSecurity();
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
		case TdPackage.FORM__HREF:
			setHref((URI) newValue);
			return;
		case TdPackage.FORM__MEDIA_TYPE:
			setMediaType((String) newValue);
			return;
		case TdPackage.FORM__REL:
			setRel((String) newValue);
			return;
		case TdPackage.FORM__SUB_PROTOCOL:
			setSubProtocol((String) newValue);
			return;
		case TdPackage.FORM__SCOPES:
			getScopes().clear();
			getScopes().addAll((Collection<? extends String>) newValue);
			return;
		case TdPackage.FORM__SECURITY:
			getSecurity().clear();
			getSecurity().addAll((Collection<? extends SecurityScheme>) newValue);
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
		case TdPackage.FORM__HREF:
			setHref(HREF_EDEFAULT);
			return;
		case TdPackage.FORM__MEDIA_TYPE:
			setMediaType(MEDIA_TYPE_EDEFAULT);
			return;
		case TdPackage.FORM__REL:
			setRel(REL_EDEFAULT);
			return;
		case TdPackage.FORM__SUB_PROTOCOL:
			setSubProtocol(SUB_PROTOCOL_EDEFAULT);
			return;
		case TdPackage.FORM__SCOPES:
			getScopes().clear();
			return;
		case TdPackage.FORM__SECURITY:
			getSecurity().clear();
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
		case TdPackage.FORM__HREF:
			return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
		case TdPackage.FORM__MEDIA_TYPE:
			return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
		case TdPackage.FORM__REL:
			return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
		case TdPackage.FORM__SUB_PROTOCOL:
			return SUB_PROTOCOL_EDEFAULT == null ? subProtocol != null : !SUB_PROTOCOL_EDEFAULT.equals(subProtocol);
		case TdPackage.FORM__SCOPES:
			return scopes != null && !scopes.isEmpty();
		case TdPackage.FORM__SECURITY:
			return security != null && !security.isEmpty();
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
		result.append(" (href: ");
		result.append(href);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(", rel: ");
		result.append(rel);
		result.append(", subProtocol: ");
		result.append(subProtocol);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(')');
		return result.toString();
	}

} //FormImpl
