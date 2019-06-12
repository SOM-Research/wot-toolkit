/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.Action;
import edu.uoc.som.wot.td.ApikeySecurityScheme;
import edu.uoc.som.wot.td.ArraySchema;
import edu.uoc.som.wot.td.BasicSecurityScheme;
import edu.uoc.som.wot.td.BearerSecurityScheme;
import edu.uoc.som.wot.td.BooleanSchema;
import edu.uoc.som.wot.td.CertSecurityScheme;
import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.DigestSecurityScheme;
import edu.uoc.som.wot.td.Event;
import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.IntegerSchema;
import edu.uoc.som.wot.td.InteractionPattern;
import edu.uoc.som.wot.td.Link;
import edu.uoc.som.wot.td.NoSecurityCheme;
import edu.uoc.som.wot.td.NumberSchema;
import edu.uoc.som.wot.td.OAuth2SecurityScheme;
import edu.uoc.som.wot.td.ObjectSchema;
import edu.uoc.som.wot.td.PSKSecurityScheme;
import edu.uoc.som.wot.td.PopSecurityScheme;
import edu.uoc.som.wot.td.Property;
import edu.uoc.som.wot.td.PublicSecurityScheme;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.StringSchema;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;
import edu.uoc.som.wot.td.Thing;

import java.net.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TdPackageImpl extends EPackageImpl implements TdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSecurityChemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2SecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apikeySecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pskSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearerSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.wot.td.TdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TdPackageImpl() {
		super(eNS_URI, TdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TdPackage init() {
		if (isInited)
			return (TdPackage) EPackage.Registry.INSTANCE.getEPackage(TdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TdPackageImpl theTdPackage = registeredTdPackage instanceof TdPackageImpl ? (TdPackageImpl) registeredTdPackage
				: new TdPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTdPackage.createPackageContents();

		// Initialize created meta-data
		theTdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TdPackage.eNS_URI, theTdPackage);
		return theTdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Name() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Base() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Id() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Description() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Support() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Security() {
		return (EReference) thingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Properties() {
		return (EReference) thingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Links() {
		return (EReference) thingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Events() {
		return (EReference) thingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Actions() {
		return (EReference) thingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Writable() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Observable() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractionPattern() {
		return interactionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionPattern_Label() {
		return (EAttribute) interactionPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionPattern_Scopes() {
		return (EAttribute) interactionPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionPattern_Security() {
		return (EReference) interactionPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionPattern_Forms() {
		return (EReference) interactionPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Input() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Output() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Description() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityScheme() {
		return securitySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Scheme() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_ProxyUrl() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Href() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_MediaType() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Rel() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Anchor() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_Href() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_MediaType() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_Rel() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_SubProtocol() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_Scopes() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForm_Security() {
		return (EReference) formEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSchema() {
		return dataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Type() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Description() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Const() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Enum() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArraySchema() {
		return arraySchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArraySchema_Items() {
		return (EReference) arraySchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArraySchema_MinItems() {
		return (EAttribute) arraySchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArraySchema_MaxItems() {
		return (EAttribute) arraySchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberSchema() {
		return numberSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberSchema_Minimum() {
		return (EAttribute) numberSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberSchema_Maximum() {
		return (EAttribute) numberSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringSchema() {
		return stringSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanSchema() {
		return booleanSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectSchema() {
		return objectSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectSchema_Properties() {
		return (EReference) objectSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectSchema_Required() {
		return (EAttribute) objectSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerSchema() {
		return integerSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerSchema_Minimum() {
		return (EAttribute) integerSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerSchema_Maximum() {
		return (EAttribute) integerSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSecurityCheme() {
		return noSecurityChemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicSecurityScheme() {
		return basicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicSecurityScheme_In() {
		return (EAttribute) basicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicSecurityScheme_Name() {
		return (EAttribute) basicSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOAuth2SecurityScheme() {
		return oAuth2SecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Flow() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Scopes() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_TokenUrl() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_AuthorizationUrl() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_RefreshUrl() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDigestSecurityScheme() {
		return digestSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_In() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_Name() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_Qop() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApikeySecurityScheme() {
		return apikeySecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApikeySecurityScheme_In() {
		return (EAttribute) apikeySecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApikeySecurityScheme_Name() {
		return (EAttribute) apikeySecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSKSecurityScheme() {
		return pskSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPSKSecurityScheme_Identity() {
		return (EAttribute) pskSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertSecurityScheme() {
		return certSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertSecurityScheme_Identity() {
		return (EAttribute) certSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicSecurityScheme() {
		return publicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicSecurityScheme_Identity() {
		return (EAttribute) publicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBearerSecurityScheme() {
		return bearerSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearerSecurityScheme_Format() {
		return (EAttribute) bearerSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearerSecurityScheme_Alg() {
		return (EAttribute) bearerSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearerSecurityScheme_AuthorizationUrl() {
		return (EAttribute) bearerSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearerSecurityScheme_In() {
		return (EAttribute) bearerSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBearerSecurityScheme_Name() {
		return (EAttribute) bearerSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopSecurityScheme() {
		return popSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopSecurityScheme_Format() {
		return (EAttribute) popSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopSecurityScheme_Alg() {
		return (EAttribute) popSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopSecurityScheme_AuthorizationUrl() {
		return (EAttribute) popSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopSecurityScheme_In() {
		return (EAttribute) popSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPopSecurityScheme_Name() {
		return (EAttribute) popSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnyURI() {
		return anyURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnyType() {
		return anyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdFactory getTdFactory() {
		return (TdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		thingEClass = createEClass(THING);
		createEAttribute(thingEClass, THING__NAME);
		createEAttribute(thingEClass, THING__BASE);
		createEAttribute(thingEClass, THING__ID);
		createEAttribute(thingEClass, THING__DESCRIPTION);
		createEAttribute(thingEClass, THING__SUPPORT);
		createEReference(thingEClass, THING__SECURITY);
		createEReference(thingEClass, THING__PROPERTIES);
		createEReference(thingEClass, THING__LINKS);
		createEReference(thingEClass, THING__EVENTS);
		createEReference(thingEClass, THING__ACTIONS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__WRITABLE);
		createEAttribute(propertyEClass, PROPERTY__OBSERVABLE);

		interactionPatternEClass = createEClass(INTERACTION_PATTERN);
		createEAttribute(interactionPatternEClass, INTERACTION_PATTERN__LABEL);
		createEAttribute(interactionPatternEClass, INTERACTION_PATTERN__SCOPES);
		createEReference(interactionPatternEClass, INTERACTION_PATTERN__SECURITY);
		createEReference(interactionPatternEClass, INTERACTION_PATTERN__FORMS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__INPUT);
		createEReference(actionEClass, ACTION__OUTPUT);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);

		eventEClass = createEClass(EVENT);

		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__PROXY_URL);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__MEDIA_TYPE);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__ANCHOR);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__HREF);
		createEAttribute(formEClass, FORM__MEDIA_TYPE);
		createEAttribute(formEClass, FORM__REL);
		createEAttribute(formEClass, FORM__SUB_PROTOCOL);
		createEAttribute(formEClass, FORM__SCOPES);
		createEReference(formEClass, FORM__SECURITY);

		dataSchemaEClass = createEClass(DATA_SCHEMA);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__TYPE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__DESCRIPTION);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__CONST);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__ENUM);

		arraySchemaEClass = createEClass(ARRAY_SCHEMA);
		createEReference(arraySchemaEClass, ARRAY_SCHEMA__ITEMS);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MIN_ITEMS);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MAX_ITEMS);

		numberSchemaEClass = createEClass(NUMBER_SCHEMA);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MINIMUM);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MAXIMUM);

		stringSchemaEClass = createEClass(STRING_SCHEMA);

		booleanSchemaEClass = createEClass(BOOLEAN_SCHEMA);

		objectSchemaEClass = createEClass(OBJECT_SCHEMA);
		createEReference(objectSchemaEClass, OBJECT_SCHEMA__PROPERTIES);
		createEAttribute(objectSchemaEClass, OBJECT_SCHEMA__REQUIRED);

		integerSchemaEClass = createEClass(INTEGER_SCHEMA);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MINIMUM);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MAXIMUM);

		noSecurityChemeEClass = createEClass(NO_SECURITY_CHEME);

		basicSecuritySchemeEClass = createEClass(BASIC_SECURITY_SCHEME);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__IN);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__NAME);

		oAuth2SecuritySchemeEClass = createEClass(OAUTH2_SECURITY_SCHEME);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__FLOW);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__SCOPES);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__TOKEN_URL);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__REFRESH_URL);

		digestSecuritySchemeEClass = createEClass(DIGEST_SECURITY_SCHEME);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__IN);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__NAME);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__QOP);

		apikeySecuritySchemeEClass = createEClass(APIKEY_SECURITY_SCHEME);
		createEAttribute(apikeySecuritySchemeEClass, APIKEY_SECURITY_SCHEME__IN);
		createEAttribute(apikeySecuritySchemeEClass, APIKEY_SECURITY_SCHEME__NAME);

		pskSecuritySchemeEClass = createEClass(PSK_SECURITY_SCHEME);
		createEAttribute(pskSecuritySchemeEClass, PSK_SECURITY_SCHEME__IDENTITY);

		certSecuritySchemeEClass = createEClass(CERT_SECURITY_SCHEME);
		createEAttribute(certSecuritySchemeEClass, CERT_SECURITY_SCHEME__IDENTITY);

		publicSecuritySchemeEClass = createEClass(PUBLIC_SECURITY_SCHEME);
		createEAttribute(publicSecuritySchemeEClass, PUBLIC_SECURITY_SCHEME__IDENTITY);

		bearerSecuritySchemeEClass = createEClass(BEARER_SECURITY_SCHEME);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__FORMAT);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__ALG);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__AUTHORIZATION_URL);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__IN);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__NAME);

		popSecuritySchemeEClass = createEClass(POP_SECURITY_SCHEME);
		createEAttribute(popSecuritySchemeEClass, POP_SECURITY_SCHEME__FORMAT);
		createEAttribute(popSecuritySchemeEClass, POP_SECURITY_SCHEME__ALG);
		createEAttribute(popSecuritySchemeEClass, POP_SECURITY_SCHEME__AUTHORIZATION_URL);
		createEAttribute(popSecuritySchemeEClass, POP_SECURITY_SCHEME__IN);
		createEAttribute(popSecuritySchemeEClass, POP_SECURITY_SCHEME__NAME);

		// Create data types
		anyURIEDataType = createEDataType(ANY_URI);
		anyTypeEDataType = createEDataType(ANY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyEClass.getESuperTypes().add(this.getInteractionPattern());
		propertyEClass.getESuperTypes().add(this.getDataSchema());
		actionEClass.getESuperTypes().add(this.getInteractionPattern());
		eventEClass.getESuperTypes().add(this.getInteractionPattern());
		eventEClass.getESuperTypes().add(this.getDataSchema());
		arraySchemaEClass.getESuperTypes().add(this.getDataSchema());
		numberSchemaEClass.getESuperTypes().add(this.getDataSchema());
		stringSchemaEClass.getESuperTypes().add(this.getDataSchema());
		booleanSchemaEClass.getESuperTypes().add(this.getDataSchema());
		objectSchemaEClass.getESuperTypes().add(this.getDataSchema());
		integerSchemaEClass.getESuperTypes().add(this.getDataSchema());
		noSecurityChemeEClass.getESuperTypes().add(this.getSecurityScheme());
		basicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		oAuth2SecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		digestSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		apikeySecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		pskSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		certSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		publicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		bearerSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		popSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());

		// Initialize classes, features, and operations; add parameters
		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Name(), ecorePackage.getEString(), "name", null, 1, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Base(), this.getAnyURI(), "base", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Id(), ecorePackage.getEString(), "id", null, 1, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Description(), ecorePackage.getEString(), "description", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Support(), ecorePackage.getEString(), "support", null, 0, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Security(), this.getSecurityScheme(), null, "security", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Properties(), this.getProperty(), null, "properties", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Links(), this.getLink(), null, "links", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getThing_Events(), this.getEvent(), null, "events", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getThing_Actions(), this.getAction(), null, "actions", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Writable(), ecorePackage.getEBoolean(), "writable", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Observable(), ecorePackage.getEBoolean(), "observable", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionPatternEClass, InteractionPattern.class, "InteractionPattern", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionPattern_Label(), ecorePackage.getEString(), "label", null, 0, 1,
				InteractionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionPattern_Scopes(), ecorePackage.getEString(), "scopes", null, 0, -1,
				InteractionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionPattern_Security(), this.getSecurityScheme(), null, "security", null, 0, -1,
				InteractionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionPattern_Forms(), this.getForm(), null, "forms", null, 0, -1,
				InteractionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Input(), this.getDataSchema(), null, "input", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAction_Output(), this.getDataSchema(), null, "output", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "description", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_Scheme(), ecorePackage.getEString(), "scheme", null, 1, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_ProxyUrl(), this.getAnyURI(), "proxyUrl", null, 0, 1, SecurityScheme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Href(), this.getAnyURI(), "href", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, Link.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Anchor(), this.getAnyURI(), "anchor", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Href(), this.getAnyURI(), "href", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, Form.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_SubProtocol(), ecorePackage.getEString(), "subProtocol", null, 0, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Scopes(), ecorePackage.getEString(), "scopes", null, 0, -1, Form.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Security(), this.getSecurityScheme(), null, "security", null, 0, -1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSchemaEClass, DataSchema.class, "DataSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSchema_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Const(), this.getAnyType(), "const", null, 0, 1, DataSchema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Enum(), this.getAnyType(), "enum", null, 0, 1, DataSchema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySchemaEClass, ArraySchema.class, "ArraySchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArraySchema_Items(), this.getDataSchema(), null, "items", null, 0, 1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArraySchema_MinItems(), ecorePackage.getEInt(), "minItems", null, 0, 1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArraySchema_MaxItems(), ecorePackage.getEInt(), "maxItems", null, 0, 1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberSchemaEClass, NumberSchema.class, "NumberSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberSchema_Minimum(), ecorePackage.getEDouble(), "minimum", null, 0, 1, NumberSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberSchema_Maximum(), ecorePackage.getEDouble(), "maximum", null, 0, 1, NumberSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSchemaEClass, StringSchema.class, "StringSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanSchemaEClass, BooleanSchema.class, "BooleanSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSchemaEClass, ObjectSchema.class, "ObjectSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSchema_Properties(), this.getDataSchema(), null, "properties", null, 0, 1,
				ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectSchema_Required(), ecorePackage.getEString(), "required", null, 0, -1,
				ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(integerSchemaEClass, IntegerSchema.class, "IntegerSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerSchema_Minimum(), ecorePackage.getEInt(), "minimum", null, 0, 1, IntegerSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerSchema_Maximum(), ecorePackage.getEInt(), "maximum", null, 0, 1, IntegerSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noSecurityChemeEClass, NoSecurityCheme.class, "NoSecurityCheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicSecuritySchemeEClass, BasicSecurityScheme.class, "BasicSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicSecurityScheme_In(), ecorePackage.getEString(), "in", null, 0, 1,
				BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuth2SecuritySchemeEClass, OAuth2SecurityScheme.class, "OAuth2SecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2SecurityScheme_Flow(), ecorePackage.getEString(), "flow", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Scopes(), ecorePackage.getEString(), "scopes", null, 0, -1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_TokenUrl(), this.getAnyURI(), "tokenUrl", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_AuthorizationUrl(), this.getAnyURI(), "authorizationUrl", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_RefreshUrl(), this.getAnyURI(), "refreshUrl", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestSecuritySchemeEClass, DigestSecurityScheme.class, "DigestSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestSecurityScheme_In(), ecorePackage.getEString(), "in", null, 0, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_Qop(), ecorePackage.getEString(), "qop", null, 0, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apikeySecuritySchemeEClass, ApikeySecurityScheme.class, "ApikeySecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApikeySecurityScheme_In(), ecorePackage.getEString(), "in", null, 0, 1,
				ApikeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApikeySecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ApikeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pskSecuritySchemeEClass, PSKSecurityScheme.class, "PSKSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSKSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				PSKSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(certSecuritySchemeEClass, CertSecurityScheme.class, "CertSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				CertSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(publicSecuritySchemeEClass, PublicSecurityScheme.class, "PublicSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				PublicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearerSecuritySchemeEClass, BearerSecurityScheme.class, "BearerSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBearerSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_AuthorizationUrl(), this.getAnyURI(), "authorizationUrl", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_In(), ecorePackage.getEString(), "in", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popSecuritySchemeEClass, PopSecurityScheme.class, "PopSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 0, 1,
				PopSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 0, 1,
				PopSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopSecurityScheme_AuthorizationUrl(), this.getAnyURI(), "authorizationUrl", null, 0, 1,
				PopSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopSecurityScheme_In(), ecorePackage.getEString(), "in", null, 0, 1, PopSecurityScheme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PopSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(anyURIEDataType, URI.class, "AnyURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anyTypeEDataType, Object.class, "AnyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TdPackageImpl
