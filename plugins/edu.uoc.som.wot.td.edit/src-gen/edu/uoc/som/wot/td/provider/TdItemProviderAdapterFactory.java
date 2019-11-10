/**
 */
package edu.uoc.som.wot.td.provider;

import edu.uoc.som.wot.td.util.TdAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TdItemProviderAdapterFactory extends TdAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.Thing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingItemProvider thingItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThingAdapter() {
		if (thingItemProvider == null) {
			thingItemProvider = new ThingItemProvider(this);
		}

		return thingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.ExpectedResponse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectedResponseItemProvider expectedResponseItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.ExpectedResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpectedResponseAdapter() {
		if (expectedResponseItemProvider == null) {
			expectedResponseItemProvider = new ExpectedResponseItemProvider(this);
		}

		return expectedResponseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.MultiLanguage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiLanguageItemProvider multiLanguageItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiLanguageAdapter() {
		if (multiLanguageItemProvider == null) {
			multiLanguageItemProvider = new MultiLanguageItemProvider(this);
		}

		return multiLanguageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageToContentMapItemProvider languageToContentMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLanguageToContentMapAdapter() {
		if (languageToContentMapItemProvider == null) {
			languageToContentMapItemProvider = new LanguageToContentMapItemProvider(this);
		}

		return languageToContentMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.VersionInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionInfoItemProvider versionInfoItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.VersionInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionInfoAdapter() {
		if (versionInfoItemProvider == null) {
			versionInfoItemProvider = new VersionInfoItemProvider(this);
		}

		return versionInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.InteractionAffordance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionAffordanceItemProvider interactionAffordanceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.InteractionAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionAffordanceAdapter() {
		if (interactionAffordanceItemProvider == null) {
			interactionAffordanceItemProvider = new InteractionAffordanceItemProvider(this);
		}

		return interactionAffordanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.PropertyAffordance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAffordanceItemProvider propertyAffordanceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.PropertyAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAffordanceAdapter() {
		if (propertyAffordanceItemProvider == null) {
			propertyAffordanceItemProvider = new PropertyAffordanceItemProvider(this);
		}

		return propertyAffordanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.ActionAffordance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAffordanceItemProvider actionAffordanceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.ActionAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAffordanceAdapter() {
		if (actionAffordanceItemProvider == null) {
			actionAffordanceItemProvider = new ActionAffordanceItemProvider(this);
		}

		return actionAffordanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.EventAffordance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAffordanceItemProvider eventAffordanceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.EventAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAffordanceAdapter() {
		if (eventAffordanceItemProvider == null) {
			eventAffordanceItemProvider = new EventAffordanceItemProvider(this);
		}

		return eventAffordanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.DataSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSchemaItemProvider dataSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataSchemaAdapter() {
		if (dataSchemaItemProvider == null) {
			dataSchemaItemProvider = new DataSchemaItemProvider(this);
		}

		return dataSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.ArraySchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArraySchemaItemProvider arraySchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.ArraySchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArraySchemaAdapter() {
		if (arraySchemaItemProvider == null) {
			arraySchemaItemProvider = new ArraySchemaItemProvider(this);
		}

		return arraySchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.ObjectSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSchemaItemProvider objectSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.ObjectSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectSchemaAdapter() {
		if (objectSchemaItemProvider == null) {
			objectSchemaItemProvider = new ObjectSchemaItemProvider(this);
		}

		return objectSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.NumberSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberSchemaItemProvider numberSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.NumberSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberSchemaAdapter() {
		if (numberSchemaItemProvider == null) {
			numberSchemaItemProvider = new NumberSchemaItemProvider(this);
		}

		return numberSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.IntegerSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerSchemaItemProvider integerSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.IntegerSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerSchemaAdapter() {
		if (integerSchemaItemProvider == null) {
			integerSchemaItemProvider = new IntegerSchemaItemProvider(this);
		}

		return integerSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.StringSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringSchemaItemProvider stringSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.StringSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringSchemaAdapter() {
		if (stringSchemaItemProvider == null) {
			stringSchemaItemProvider = new StringSchemaItemProvider(this);
		}

		return stringSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.BooleanSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanSchemaItemProvider booleanSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.BooleanSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanSchemaAdapter() {
		if (booleanSchemaItemProvider == null) {
			booleanSchemaItemProvider = new BooleanSchemaItemProvider(this);
		}

		return booleanSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.NullSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullSchemaItemProvider nullSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.NullSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullSchemaAdapter() {
		if (nullSchemaItemProvider == null) {
			nullSchemaItemProvider = new NullSchemaItemProvider(this);
		}

		return nullSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.SecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeItemProvider securitySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecuritySchemeAdapter() {
		if (securitySchemeItemProvider == null) {
			securitySchemeItemProvider = new SecuritySchemeItemProvider(this);
		}

		return securitySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.NoSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoSecuritySchemeItemProvider noSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.NoSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoSecuritySchemeAdapter() {
		if (noSecuritySchemeItemProvider == null) {
			noSecuritySchemeItemProvider = new NoSecuritySchemeItemProvider(this);
		}

		return noSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.BasicSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicSecuritySchemeItemProvider basicSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.BasicSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicSecuritySchemeAdapter() {
		if (basicSecuritySchemeItemProvider == null) {
			basicSecuritySchemeItemProvider = new BasicSecuritySchemeItemProvider(this);
		}

		return basicSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.DigestSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigestSecuritySchemeItemProvider digestSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.DigestSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigestSecuritySchemeAdapter() {
		if (digestSecuritySchemeItemProvider == null) {
			digestSecuritySchemeItemProvider = new DigestSecuritySchemeItemProvider(this);
		}

		return digestSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.APIKeySecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIKeySecuritySchemeItemProvider apiKeySecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.APIKeySecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAPIKeySecuritySchemeAdapter() {
		if (apiKeySecuritySchemeItemProvider == null) {
			apiKeySecuritySchemeItemProvider = new APIKeySecuritySchemeItemProvider(this);
		}

		return apiKeySecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.BearerSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BearerSecuritySchemeItemProvider bearerSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.BearerSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBearerSecuritySchemeAdapter() {
		if (bearerSecuritySchemeItemProvider == null) {
			bearerSecuritySchemeItemProvider = new BearerSecuritySchemeItemProvider(this);
		}

		return bearerSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.CertSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertSecuritySchemeItemProvider certSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.CertSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCertSecuritySchemeAdapter() {
		if (certSecuritySchemeItemProvider == null) {
			certSecuritySchemeItemProvider = new CertSecuritySchemeItemProvider(this);
		}

		return certSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.PSKSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSKSecuritySchemeItemProvider pskSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.PSKSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPSKSecuritySchemeAdapter() {
		if (pskSecuritySchemeItemProvider == null) {
			pskSecuritySchemeItemProvider = new PSKSecuritySchemeItemProvider(this);
		}

		return pskSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.PublicSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicSecuritySchemeItemProvider publicSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.PublicSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublicSecuritySchemeAdapter() {
		if (publicSecuritySchemeItemProvider == null) {
			publicSecuritySchemeItemProvider = new PublicSecuritySchemeItemProvider(this);
		}

		return publicSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.PoPSecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoPSecuritySchemeItemProvider poPSecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.PoPSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoPSecuritySchemeAdapter() {
		if (poPSecuritySchemeItemProvider == null) {
			poPSecuritySchemeItemProvider = new PoPSecuritySchemeItemProvider(this);
		}

		return poPSecuritySchemeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.uoc.som.wot.td.OAuth2SecurityScheme} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2SecuritySchemeItemProvider oAuth2SecuritySchemeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.uoc.som.wot.td.OAuth2SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOAuth2SecuritySchemeAdapter() {
		if (oAuth2SecuritySchemeItemProvider == null) {
			oAuth2SecuritySchemeItemProvider = new OAuth2SecuritySchemeItemProvider(this);
		}

		return oAuth2SecuritySchemeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (thingItemProvider != null)
			thingItemProvider.dispose();
		if (formItemProvider != null)
			formItemProvider.dispose();
		if (expectedResponseItemProvider != null)
			expectedResponseItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (multiLanguageItemProvider != null)
			multiLanguageItemProvider.dispose();
		if (languageToContentMapItemProvider != null)
			languageToContentMapItemProvider.dispose();
		if (versionInfoItemProvider != null)
			versionInfoItemProvider.dispose();
		if (interactionAffordanceItemProvider != null)
			interactionAffordanceItemProvider.dispose();
		if (propertyAffordanceItemProvider != null)
			propertyAffordanceItemProvider.dispose();
		if (actionAffordanceItemProvider != null)
			actionAffordanceItemProvider.dispose();
		if (eventAffordanceItemProvider != null)
			eventAffordanceItemProvider.dispose();
		if (dataSchemaItemProvider != null)
			dataSchemaItemProvider.dispose();
		if (arraySchemaItemProvider != null)
			arraySchemaItemProvider.dispose();
		if (objectSchemaItemProvider != null)
			objectSchemaItemProvider.dispose();
		if (numberSchemaItemProvider != null)
			numberSchemaItemProvider.dispose();
		if (integerSchemaItemProvider != null)
			integerSchemaItemProvider.dispose();
		if (stringSchemaItemProvider != null)
			stringSchemaItemProvider.dispose();
		if (booleanSchemaItemProvider != null)
			booleanSchemaItemProvider.dispose();
		if (nullSchemaItemProvider != null)
			nullSchemaItemProvider.dispose();
		if (securitySchemeItemProvider != null)
			securitySchemeItemProvider.dispose();
		if (noSecuritySchemeItemProvider != null)
			noSecuritySchemeItemProvider.dispose();
		if (basicSecuritySchemeItemProvider != null)
			basicSecuritySchemeItemProvider.dispose();
		if (digestSecuritySchemeItemProvider != null)
			digestSecuritySchemeItemProvider.dispose();
		if (apiKeySecuritySchemeItemProvider != null)
			apiKeySecuritySchemeItemProvider.dispose();
		if (bearerSecuritySchemeItemProvider != null)
			bearerSecuritySchemeItemProvider.dispose();
		if (certSecuritySchemeItemProvider != null)
			certSecuritySchemeItemProvider.dispose();
		if (pskSecuritySchemeItemProvider != null)
			pskSecuritySchemeItemProvider.dispose();
		if (publicSecuritySchemeItemProvider != null)
			publicSecuritySchemeItemProvider.dispose();
		if (poPSecuritySchemeItemProvider != null)
			poPSecuritySchemeItemProvider.dispose();
		if (oAuth2SecuritySchemeItemProvider != null)
			oAuth2SecuritySchemeItemProvider.dispose();
	}

}
