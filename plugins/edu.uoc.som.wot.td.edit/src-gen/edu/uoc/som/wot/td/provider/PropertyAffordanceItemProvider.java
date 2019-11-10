/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.PropertyAffordance;
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
 * This is the item provider adapter for a {@link edu.uoc.som.wot.td.PropertyAffordance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyAffordanceItemProvider extends InteractionAffordanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAffordanceItemProvider(AdapterFactory adapterFactory) {
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

			addDtitlePropertyDescriptor(object);
			addDdescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addConstPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addEnumPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addWriteOnlyPropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addDtitlesPropertyDescriptor(object);
			addDdescriptionsPropertyDescriptor(object);
			addObservablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dtitle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDtitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_dtitle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_dtitle_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__DTITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ddescription feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDdescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_ddescription_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_ddescription_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__DDESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_type_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_const_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_const_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__CONST, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_unit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_unit_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__UNIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_enum_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_enum_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__ENUM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_readOnly_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_readOnly_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__READ_ONLY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Write Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_writeOnly_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_writeOnly_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__WRITE_ONLY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_format_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_format_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__FORMAT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dtitles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDtitlesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_dtitles_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_dtitles_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__DTITLES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Ddescriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDdescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataSchema_ddescriptions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataSchema_ddescriptions_feature",
								"_UI_DataSchema_type"),
						TdPackage.Literals.DATA_SCHEMA__DDESCRIPTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Observable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PropertyAffordance_observable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PropertyAffordance_observable_feature",
								"_UI_PropertyAffordance_type"),
						TdPackage.Literals.PROPERTY_AFFORDANCE__OBSERVABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(TdPackage.Literals.DATA_SCHEMA__ONE_OF);
			childrenFeatures.add(TdPackage.Literals.DATA_SCHEMA__DTITLES);
			childrenFeatures.add(TdPackage.Literals.DATA_SCHEMA__DDESCRIPTIONS);
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
	 * This returns PropertyAffordance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyAffordance"));
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
		String label = ((PropertyAffordance) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_PropertyAffordance_type")
				: getString("_UI_PropertyAffordance_type") + " " + label;
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

		switch (notification.getFeatureID(PropertyAffordance.class)) {
		case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
		case TdPackage.PROPERTY_AFFORDANCE__TYPE:
		case TdPackage.PROPERTY_AFFORDANCE__CONST:
		case TdPackage.PROPERTY_AFFORDANCE__UNIT:
		case TdPackage.PROPERTY_AFFORDANCE__ENUM:
		case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
		case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
		case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
		case TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
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

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF,
				TdFactory.eINSTANCE.createPropertyAffordance()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createDataSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createArraySchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createObjectSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createNumberSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF,
				TdFactory.eINSTANCE.createIntegerSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createStringSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF,
				TdFactory.eINSTANCE.createBooleanSchema()));

		newChildDescriptors.add(
				createChildParameter(TdPackage.Literals.DATA_SCHEMA__ONE_OF, TdFactory.eINSTANCE.createNullSchema()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.DATA_SCHEMA__DTITLES,
				TdFactory.eINSTANCE.createMultiLanguage()));

		newChildDescriptors.add(createChildParameter(TdPackage.Literals.DATA_SCHEMA__DDESCRIPTIONS,
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

		boolean qualify = childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__URI_VARIABLE
				|| childFeature == TdPackage.Literals.DATA_SCHEMA__ONE_OF
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__ITITLES
				|| childFeature == TdPackage.Literals.INTERACTION_AFFORDANCE__IDESCRIPTIONS
				|| childFeature == TdPackage.Literals.DATA_SCHEMA__DTITLES
				|| childFeature == TdPackage.Literals.DATA_SCHEMA__DDESCRIPTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
