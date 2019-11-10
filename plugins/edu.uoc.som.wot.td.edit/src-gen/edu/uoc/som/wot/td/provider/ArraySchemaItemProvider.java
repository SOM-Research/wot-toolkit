/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.ArraySchema;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.ArraySchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArraySchemaItemProvider extends DataSchemaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySchemaItemProvider(AdapterFactory adapterFactory) {
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

			addMinItemsPropertyDescriptor(object);
			addMaxItemsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ArraySchema_minItems_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ArraySchema_minItems_feature",
								"_UI_ArraySchema_type"),
						TdPackage.Literals.ARRAY_SCHEMA__MIN_ITEMS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ArraySchema_maxItems_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ArraySchema_maxItems_feature",
								"_UI_ArraySchema_type"),
						TdPackage.Literals.ARRAY_SCHEMA__MAX_ITEMS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(TdPackage.Literals.ARRAY_SCHEMA__ITEMS);
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
	 * This returns ArraySchema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArraySchema"));
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
		Object labelValue = ((EObject) object).eGet(TdPackage.Literals.DATA_SCHEMA__DTITLE);
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ArraySchema_type")
				: getString("_UI_ArraySchema_type") + " " + label;
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

		switch (notification.getFeatureID(ArraySchema.class)) {
		case TdPackage.ARRAY_SCHEMA__MIN_ITEMS:
		case TdPackage.ARRAY_SCHEMA__MAX_ITEMS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.ARRAY_SCHEMA__ITEMS:
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

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.ARRAY_SCHEMA__ITEMS, TdFactory.eINSTANCE.createNullSchema()));
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

		boolean qualify = childFeature == TdPackage.Literals.DATA_SCHEMA__ONE_OF
				|| childFeature == TdPackage.Literals.ARRAY_SCHEMA__ITEMS
				|| childFeature == TdPackage.Literals.DATA_SCHEMA__DTITLES
				|| childFeature == TdPackage.Literals.DATA_SCHEMA__DDESCRIPTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
