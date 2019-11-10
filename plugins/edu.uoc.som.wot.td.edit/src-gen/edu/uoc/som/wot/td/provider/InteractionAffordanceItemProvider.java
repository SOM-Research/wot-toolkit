/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.InteractionAffordance;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;

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
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.InteractionAffordance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionAffordanceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionAffordanceItemProvider(AdapterFactory adapterFactory) {
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
			addItitlePropertyDescriptor(object);
			addIdescriptionPropertyDescriptor(object);
			addItitlesPropertyDescriptor(object);
			addIdescriptionsPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_InteractionAffordance_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InteractionAffordance_id_feature",
								"_UI_InteractionAffordance_type"),
						TdPackage.Literals.INTERACTION_AFFORDANCE__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ititle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InteractionAffordance_ititle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InteractionAffordance_ititle_feature",
								"_UI_InteractionAffordance_type"),
						TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Idescription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InteractionAffordance_idescription_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InteractionAffordance_idescription_feature",
						"_UI_InteractionAffordance_type"),
				TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ititles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItitlesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InteractionAffordance_ititles_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InteractionAffordance_ititles_feature",
								"_UI_InteractionAffordance_type"),
						TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Idescriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InteractionAffordance_idescriptions_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InteractionAffordance_idescriptions_feature", "_UI_InteractionAffordance_type"),
						TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS, true, false, true, null, null, null));
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
			childrenFeatures.add(TdPackage.Literals.INTERACTION_AFFORDANCE__FORMS);
			childrenFeatures.add(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE);
			childrenFeatures.add(TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES);
			childrenFeatures.add(TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS);
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
	 * This returns InteractionAffordance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteractionAffordance"));
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
		String label = ((InteractionAffordance) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_InteractionAffordance_type")
				: getString("_UI_InteractionAffordance_type") + " " + label;
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

		switch (notification.getFeatureID(InteractionAffordance.class)) {
		case TdPackage.INTERACTION_AFFORDANCE__ID:
		case TdPackage.INTERACTION_AFFORDANCE__ITITLE:
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.INTERACTION_AFFORDANCE__FORMS:
		case TdPackage.INTERACTION_AFFORDANCE__URI_VARIABLE:
		case TdPackage.INTERACTION_AFFORDANCE__ITITLES:
		case TdPackage.INTERACTION_AFFORDANCE__IDESCRIPTIONS:
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

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__FORMS,
				TdFactory.eINSTANCE.createForm()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE,
				TdFactory.eINSTANCE.createNullSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES,
				TdFactory.eINSTANCE.createMultiLanguage()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS,
				TdFactory.eINSTANCE.createMultiLanguage()));
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

		boolean qualify = childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS;

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
