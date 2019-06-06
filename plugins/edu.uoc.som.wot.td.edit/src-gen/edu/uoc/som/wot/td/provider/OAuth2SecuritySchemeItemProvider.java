/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.OAuth2SecurityScheme;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.OAuth2SecurityScheme} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OAuth2SecuritySchemeItemProvider extends SecuritySchemeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2SecuritySchemeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFlowPropertyDescriptor(object);
			addScopesPropertyDescriptor(object);
			addTokenUrlPropertyDescriptor(object);
			addAuthorizationUrlPropertyDescriptor(object);
			addRefreshUrlPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Flow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OAuth2SecurityScheme_flow_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OAuth2SecurityScheme_flow_feature",
								"_UI_OAuth2SecurityScheme_type"),
						TdPackage.Literals.OAUTH2_SECURITY_SCHEME__FLOW, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scopes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OAuth2SecurityScheme_scopes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OAuth2SecurityScheme_scopes_feature",
								"_UI_OAuth2SecurityScheme_type"),
						TdPackage.Literals.OAUTH2_SECURITY_SCHEME__SCOPES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Token Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokenUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OAuth2SecurityScheme_tokenUrl_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OAuth2SecurityScheme_tokenUrl_feature",
								"_UI_OAuth2SecurityScheme_type"),
						TdPackage.Literals.OAUTH2_SECURITY_SCHEME__TOKEN_URL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Authorization Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizationUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuth2SecurityScheme_authorizationUrl_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuth2SecurityScheme_authorizationUrl_feature",
						"_UI_OAuth2SecurityScheme_type"),
				TdPackage.Literals.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Refresh Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OAuth2SecurityScheme_refreshUrl_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OAuth2SecurityScheme_refreshUrl_feature",
						"_UI_OAuth2SecurityScheme_type"),
				TdPackage.Literals.OAUTH2_SECURITY_SCHEME__REFRESH_URL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OAuth2SecurityScheme.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OAuth2SecurityScheme"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OAuth2SecurityScheme) object).getScheme();
		return label == null || label.length() == 0 ? getString("_UI_OAuth2SecurityScheme_type")
				: getString("_UI_OAuth2SecurityScheme_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OAuth2SecurityScheme.class)) {
		case TdPackage.OAUTH2_SECURITY_SCHEME__FLOW:
		case TdPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
		case TdPackage.OAUTH2_SECURITY_SCHEME__TOKEN_URL:
		case TdPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL:
		case TdPackage.OAUTH2_SECURITY_SCHEME__REFRESH_URL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
