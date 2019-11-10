/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TdFactoryImpl extends EFactoryImpl implements TdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TdFactory init() {
		try {
			TdFactory theTdFactory = (TdFactory) EPackage.Registry.INSTANCE.getEFactory(TdPackage.eNS_URI);
			if (theTdFactory != null) {
				return theTdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TdPackage.THING:
			return createThing();
		case TdPackage.FORM:
			return createForm();
		case TdPackage.EXPECTED_RESPONSE:
			return createExpectedResponse();
		case TdPackage.LINK:
			return createLink();
		case TdPackage.MULTI_LANGUAGE:
			return createMultiLanguage();
		case TdPackage.LANGUAGE_TO_CONTENT_MAP:
			return (EObject) createLanguageToContentMap();
		case TdPackage.VERSION_INFO:
			return createVersionInfo();
		case TdPackage.INTERACTION_AFFORDANCE:
			return createInteractionAffordance();
		case TdPackage.PROPERTY_AFFORDANCE:
			return createPropertyAffordance();
		case TdPackage.ACTION_AFFORDANCE:
			return createActionAffordance();
		case TdPackage.EVENT_AFFORDANCE:
			return createEventAffordance();
		case TdPackage.DATA_SCHEMA:
			return createDataSchema();
		case TdPackage.ARRAY_SCHEMA:
			return createArraySchema();
		case TdPackage.OBJECT_SCHEMA:
			return createObjectSchema();
		case TdPackage.NUMBER_SCHEMA:
			return createNumberSchema();
		case TdPackage.INTEGER_SCHEMA:
			return createIntegerSchema();
		case TdPackage.STRING_SCHEMA:
			return createStringSchema();
		case TdPackage.BOOLEAN_SCHEMA:
			return createBooleanSchema();
		case TdPackage.NULL_SCHEMA:
			return createNullSchema();
		case TdPackage.SECURITY_SCHEME:
			return createSecurityScheme();
		case TdPackage.NO_SECURITY_SCHEME:
			return createNoSecurityScheme();
		case TdPackage.BASIC_SECURITY_SCHEME:
			return createBasicSecurityScheme();
		case TdPackage.DIGEST_SECURITY_SCHEME:
			return createDigestSecurityScheme();
		case TdPackage.API_KEY_SECURITY_SCHEME:
			return createAPIKeySecurityScheme();
		case TdPackage.BEARER_SECURITY_SCHEME:
			return createBearerSecurityScheme();
		case TdPackage.CERT_SECURITY_SCHEME:
			return createCertSecurityScheme();
		case TdPackage.PSK_SECURITY_SCHEME:
			return createPSKSecurityScheme();
		case TdPackage.PUBLIC_SECURITY_SCHEME:
			return createPublicSecurityScheme();
		case TdPackage.PO_PSECURITY_SCHEME:
			return createPoPSecurityScheme();
		case TdPackage.OAUTH2_SECURITY_SCHEME:
			return createOAuth2SecurityScheme();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TdPackage.ANY_TYPE:
			return createAnyTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TdPackage.ANY_TYPE:
			return convertAnyTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpectedResponse createExpectedResponse() {
		ExpectedResponseImpl expectedResponse = new ExpectedResponseImpl();
		return expectedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage createMultiLanguage() {
		MultiLanguageImpl multiLanguage = new MultiLanguageImpl();
		return multiLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createLanguageToContentMap() {
		LanguageToContentMapImpl languageToContentMap = new LanguageToContentMapImpl();
		return languageToContentMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionInfo createVersionInfo() {
		VersionInfoImpl versionInfo = new VersionInfoImpl();
		return versionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionAffordance createInteractionAffordance() {
		InteractionAffordanceImpl interactionAffordance = new InteractionAffordanceImpl();
		return interactionAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAffordance createPropertyAffordance() {
		PropertyAffordanceImpl propertyAffordance = new PropertyAffordanceImpl();
		return propertyAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionAffordance createActionAffordance() {
		ActionAffordanceImpl actionAffordance = new ActionAffordanceImpl();
		return actionAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventAffordance createEventAffordance() {
		EventAffordanceImpl eventAffordance = new EventAffordanceImpl();
		return eventAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema createDataSchema() {
		DataSchemaImpl dataSchema = new DataSchemaImpl();
		return dataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArraySchema createArraySchema() {
		ArraySchemaImpl arraySchema = new ArraySchemaImpl();
		return arraySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectSchema createObjectSchema() {
		ObjectSchemaImpl objectSchema = new ObjectSchemaImpl();
		return objectSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberSchema createNumberSchema() {
		NumberSchemaImpl numberSchema = new NumberSchemaImpl();
		return numberSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerSchema createIntegerSchema() {
		IntegerSchemaImpl integerSchema = new IntegerSchemaImpl();
		return integerSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringSchema createStringSchema() {
		StringSchemaImpl stringSchema = new StringSchemaImpl();
		return stringSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanSchema createBooleanSchema() {
		BooleanSchemaImpl booleanSchema = new BooleanSchemaImpl();
		return booleanSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullSchema createNullSchema() {
		NullSchemaImpl nullSchema = new NullSchemaImpl();
		return nullSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScheme createSecurityScheme() {
		SecuritySchemeImpl securityScheme = new SecuritySchemeImpl();
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoSecurityScheme createNoSecurityScheme() {
		NoSecuritySchemeImpl noSecurityScheme = new NoSecuritySchemeImpl();
		return noSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicSecurityScheme createBasicSecurityScheme() {
		BasicSecuritySchemeImpl basicSecurityScheme = new BasicSecuritySchemeImpl();
		return basicSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigestSecurityScheme createDigestSecurityScheme() {
		DigestSecuritySchemeImpl digestSecurityScheme = new DigestSecuritySchemeImpl();
		return digestSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIKeySecurityScheme createAPIKeySecurityScheme() {
		APIKeySecuritySchemeImpl apiKeySecurityScheme = new APIKeySecuritySchemeImpl();
		return apiKeySecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BearerSecurityScheme createBearerSecurityScheme() {
		BearerSecuritySchemeImpl bearerSecurityScheme = new BearerSecuritySchemeImpl();
		return bearerSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertSecurityScheme createCertSecurityScheme() {
		CertSecuritySchemeImpl certSecurityScheme = new CertSecuritySchemeImpl();
		return certSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSKSecurityScheme createPSKSecurityScheme() {
		PSKSecuritySchemeImpl pskSecurityScheme = new PSKSecuritySchemeImpl();
		return pskSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicSecurityScheme createPublicSecurityScheme() {
		PublicSecuritySchemeImpl publicSecurityScheme = new PublicSecuritySchemeImpl();
		return publicSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoPSecurityScheme createPoPSecurityScheme() {
		PoPSecuritySchemeImpl poPSecurityScheme = new PoPSecuritySchemeImpl();
		return poPSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2SecurityScheme createOAuth2SecurityScheme() {
		OAuth2SecuritySchemeImpl oAuth2SecurityScheme = new OAuth2SecuritySchemeImpl();
		return oAuth2SecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAnyTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnyTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdPackage getTdPackage() {
		return (TdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TdPackage getPackage() {
		return TdPackage.eINSTANCE;
	}

} //TdFactoryImpl
