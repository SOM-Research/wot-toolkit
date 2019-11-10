/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.ActionAffordance;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.ActionAffordance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionAffordanceItemProvider extends InteractionAffordanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAffordanceItemProvider(AdapterFactory adapterFactory) {
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

			addSafePropertyDescriptor(object);
			addIdempotentPropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Safe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionAffordance_safe_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionAffordance_safe_feature",
								"_UI_ActionAffordance_type"),
						TdPackage.Literals.ACTION_AFFORDANCE__SAFE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Idempotent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdempotentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionAffordance_idempotent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionAffordance_idempotent_feature",
								"_UI_ActionAffordance_type"),
						TdPackage.Literals.ACTION_AFFORDANCE__IDEMPOTENT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionAffordance_input_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionAffordance_input_feature",
								"_UI_ActionAffordance_type"),
						TdPackage.Literals.ACTION_AFFORDANCE__INPUT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionAffordance_output_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionAffordance_output_feature",
								"_UI_ActionAffordance_type"),
						TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT, true, false, true, null, null, null));
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
			childrenFeatures.add(TdPackage.Literals.ACTION_AFFORDANCE__INPUT);
			childrenFeatures.add(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT);
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
	 * This returns ActionAffordance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionAffordance"));
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
		String label = ((ActionAffordance) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ActionAffordance_type")
				: getString("_UI_ActionAffordance_type") + " " + label;
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

		switch (notification.getFeatureID(ActionAffordance.class)) {
		case TdPackage.ACTION_AFFORDANCE__SAFE:
		case TdPackage.ACTION_AFFORDANCE__IDEMPOTENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.ACTION_AFFORDANCE__INPUT:
		case TdPackage.ACTION_AFFORDANCE__OUTPUT:
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

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__INPUT,
				TdFactory.eINSTANCE.createNullSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT,
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
				|| childFeature == TdPackage.Literals.ACTION_AFFORDANCE__INPUT
				|| childFeature == TdPackage.Literals.ACTION_AFFORDANCE__OUTPUT
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
