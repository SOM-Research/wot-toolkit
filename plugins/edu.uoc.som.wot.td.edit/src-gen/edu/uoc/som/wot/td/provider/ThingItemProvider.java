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

			addIdPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addSupportPropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addSecurityPropertyDescriptor(object);
			addLinksPropertyDescriptor(object);
			addTitlesPropertyDescriptor(object);
			addDescriptionsPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addActionsPropertyDescriptor(object);
			addEventsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_title_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__TITLE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_created_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_created_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__CREATED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_modified_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_modified_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__MODIFIED, true, false, false,
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
						TdPackage.Literals.THING__SECURITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	 * This adds a property descriptor for the Titles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_titles_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_titles_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__TITLES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_descriptions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_descriptions_feature",
								"_UI_Thing_type"),
						TdPackage.Literals.THING__DESCRIPTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Thing_version_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Thing_version_feature", "_UI_Thing_type"),
						TdPackage.Literals.THING__VERSION, true, false, true, null, null, null));
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
			childrenFeatures.add(TdPackage.Literals.THING__FORMS);
			childrenFeatures.add(TdPackage.Literals.THING__LINKS);
			childrenFeatures.add(TdPackage.Literals.THING__TITLES);
			childrenFeatures.add(TdPackage.Literals.THING__DESCRIPTIONS);
			childrenFeatures.add(TdPackage.Literals.THING__VERSION);
			childrenFeatures.add(TdPackage.Literals.THING__PROPERTIES);
			childrenFeatures.add(TdPackage.Literals.THING__ACTIONS);
			childrenFeatures.add(TdPackage.Literals.THING__EVENTS);
			childrenFeatures.add(TdPackage.Literals.THING__SECURITY_DEFINITIONS);
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
		String label = ((Thing) object).getId();
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
		case TdPackage.THING__ID:
		case TdPackage.THING__TITLE:
		case TdPackage.THING__DESCRIPTION:
		case TdPackage.THING__CREATED:
		case TdPackage.THING__MODIFIED:
		case TdPackage.THING__SUPPORT:
		case TdPackage.THING__BASE:
		case TdPackage.THING__SECURITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.THING__FORMS:
		case TdPackage.THING__LINKS:
		case TdPackage.THING__TITLES:
		case TdPackage.THING__DESCRIPTIONS:
		case TdPackage.THING__VERSION:
		case TdPackage.THING__PROPERTIES:
		case TdPackage.THING__ACTIONS:
		case TdPackage.THING__EVENTS:
		case TdPackage.THING__SECURITY_DEFINITIONS:
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

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__FORMS, TdFactory.eINSTANCE.createForm()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__LINKS, TdFactory.eINSTANCE.createLink()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__TITLES, TdFactory.eINSTANCE.createMultiLanguage()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__DESCRIPTIONS,
				TdFactory.eINSTANCE.createMultiLanguage()));

		newChildDescriptors
				.add(createChildParameter(TdPackage.Literals.THING__VERSION, TdFactory.eINSTANCE.createVersionInfo()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__PROPERTIES,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.THING__ACTIONS, TdFactory.eINSTANCE.createActionAffordance()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.THING__EVENTS, TdFactory.eINSTANCE.createEventAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createNoSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createBasicSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createDigestSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createAPIKeySecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createBearerSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createCertSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createPSKSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createPublicSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createPoPSecurityScheme()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.THING__SECURITY_DEFINITIONS,
				TdFactory.eINSTANCE.createOAuth2SecurityScheme()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == TdPackage.Literals.THING__TITLES
				|| childFeature == TdPackage.Literals.THING__DESCRIPTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
