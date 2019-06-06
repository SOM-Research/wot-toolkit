/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;
import edu.uoc.som.wot.td.Thing;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.Thing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addSupportPropertyDescriptor(object);
			addSecurityPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addLinksPropertyDescriptor(object);
			addEventsPropertyDescriptor(object);
			addActionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_name_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_base_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_base_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__BASE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_id_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_description_feature",
								"_UI_Thing_type"),
						TdPackage.Literals.THING__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_support_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_support_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__SUPPORT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_security_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_security_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__SECURITY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_properties_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_properties_feature",
								"_UI_Thing_type"),
						TdPackage.Literals.THING__PROPERTIES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_links_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_links_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__LINKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_events_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_events_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__EVENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_actions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_actions_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__ACTIONS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TdPackage.Literals.THING__SECURITY);
			childrenFeatures.add(TdPackage.Literals.THING__PROPERTIES);
			childrenFeatures.add(TdPackage.Literals.THING__LINKS);
			childrenFeatures.add(TdPackage.Literals.THING__EVENTS);
			childrenFeatures.add(TdPackage.Literals.THING__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Thing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Thing"));
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
		String label = ((Thing) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Thing_type")
				: getString("_UI_Thing_type") + " " + label;
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

		switch (notification.getFeatureID(Thing.class)) {
		case TdPackage.THING__NAME:
		case TdPackage.THING__BASE:
		case TdPackage.THING__ID:
		case TdPackage.THING__DESCRIPTION:
		case TdPackage.THING__SUPPORT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.THING__SECURITY:
		case TdPackage.THING__PROPERTIES:
		case TdPackage.THING__LINKS:
		case TdPackage.THING__EVENTS:
		case TdPackage.THING__ACTIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.THING__SECURITY, TdFactory.eINSTANCE.createSecurityScheme()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.THING__SECURITY, TdFactory.eINSTANCE.createNoSecurityCheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createBasicSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createOAuth2SecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createDigestSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createApikeySecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createPSKSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createCertSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createPublicSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createBearerSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY,
				TdFactory.eINSTANCE.createPopSecurityScheme()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__PROPERTIES, TdFactory.eINSTANCE.createProperty()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__LINKS, TdFactory.eINSTANCE.createLink()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__EVENTS, TdFactory.eINSTANCE.createEvent()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__ACTIONS, TdFactory.eINSTANCE.createAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TdEditPlugin.INSTANCE;
	}

}
