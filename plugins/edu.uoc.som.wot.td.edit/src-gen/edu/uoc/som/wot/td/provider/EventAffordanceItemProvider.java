/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.EventAffordance;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.EventAffordance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventAffordanceItemProvider extends InteractionAffordanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAffordanceItemProvider(AdapterFactory adapterFactory) {
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

			addDataPropertyDescriptor(object);
			addSubscriptionPropertyDescriptor(object);
			addCancellationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EventAffordance_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EventAffordance_data_feature",
								"_UI_EventAffordance_type"),
						TdPackage.Literals.EVENT_AFFORDANCE__DATA, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subscription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EventAffordance_subscription_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EventAffordance_subscription_feature",
								"_UI_EventAffordance_type"),
						TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cancellation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancellationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EventAffordance_cancellation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EventAffordance_cancellation_feature",
								"_UI_EventAffordance_type"),
						TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION, true, false, true, null, null, null));
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
			childrenFeatures.add(TdPackage.Literals.EVENT_AFFORDANCE__DATA);
			childrenFeatures.add(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION);
			childrenFeatures.add(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION);
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
	 * This returns EventAffordance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventAffordance"));
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
		String label = ((EventAffordance) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_EventAffordance_type")
				: getString("_UI_EventAffordance_type") + " " + label;
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

		switch (notification.getFeatureID(EventAffordance.class)) {
		case TdPackage.EVENT_AFFORDANCE__DATA:
		case TdPackage.EVENT_AFFORDANCE__SUBSCRIPTION:
		case TdPackage.EVENT_AFFORDANCE__CANCELLATION:
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

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__DATA,
				TdFactory.eINSTANCE.createNullSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION,
				TdFactory.eINSTANCE.createNullSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION,
				TdFactory.eINSTANCE.createNullSchema()));
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

		boolean qualify = childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE
				|| childFeature == TdPackage.Literals.EVENT_AFFORDANCE__DATA
				|| childFeature == TdPackage.Literals.EVENT_AFFORDANCE__SUBSCRIPTION
				|| childFeature == TdPackage.Literals.EVENT_AFFORDANCE__CANCELLATION
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
