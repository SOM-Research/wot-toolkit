/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.APIKeySecurityScheme;
import edu.uoc.som.wot.td.ActionAffordance;
import edu.uoc.som.wot.td.ArraySchema;
import edu.uoc.som.wot.td.BasicSecurityScheme;
import edu.uoc.som.wot.td.BearerSecurityScheme;
import edu.uoc.som.wot.td.BooleanSchema;
import edu.uoc.som.wot.td.CertSecurityScheme;
import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.DigestSecurityScheme;
import edu.uoc.som.wot.td.EventAffordance;
import edu.uoc.som.wot.td.ExpectedResponse;
import edu.uoc.som.wot.td.Form;
import edu.uoc.som.wot.td.IntegerSchema;
import edu.uoc.som.wot.td.InteractionAffordance;
import edu.uoc.som.wot.td.Link;
import edu.uoc.som.wot.td.MultiLanguage;
import edu.uoc.som.wot.td.NoSecurityScheme;
import edu.uoc.som.wot.td.NullSchema;
import edu.uoc.som.wot.td.NumberSchema;
import edu.uoc.som.wot.td.OAuth2SecurityScheme;
import edu.uoc.som.wot.td.ObjectSchema;
import edu.uoc.som.wot.td.PSKSecurityScheme;
import edu.uoc.som.wot.td.PoPSecurityScheme;
import edu.uoc.som.wot.td.PropertyAffordance;
import edu.uoc.som.wot.td.PublicSecurityScheme;
import edu.uoc.som.wot.td.SecurityScheme;
import edu.uoc.som.wot.td.StringSchema;
import edu.uoc.som.wot.td.TdFactory;
import edu.uoc.som.wot.td.TdPackage;
import edu.uoc.som.wot.td.Thing;
import edu.uoc.som.wot.td.VersionInfo;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedResponseEClass = null;

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
	private EClass multiLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageToContentMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventAffordanceEClass = null;

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
	private EClass objectSchemaEClass = null;

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
	private EClass integerSchemaEClass = null;

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
	private EClass nullSchemaEClass = null;

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
	private EClass noSecuritySchemeEClass = null;

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
	private EClass digestSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeySecuritySchemeEClass = null;

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
	private EClass certSecuritySchemeEClass = null;

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
	private EClass publicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poPSecuritySchemeEClass = null;

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

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
	public EAttribute getThing_Id() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Title() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Description() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Created() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Modified() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Support() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Base() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThing_Security() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Forms() {
		return (EReference) thingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Links() {
		return (EReference) thingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Titles() {
		return (EReference) thingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Descriptions() {
		return (EReference) thingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Version() {
		return (EReference) thingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Properties() {
		return (EReference) thingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Actions() {
		return (EReference) thingEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_Events() {
		return (EReference) thingEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThing_SecurityDefinitions() {
		return (EReference) thingEClass.getEStructuralFeatures().get(16);
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
	public EAttribute getForm_Op() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm__href() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_ContentType() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_ContentCoding() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_SubProtocol() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_Security() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForm_Scopes() {
		return (EAttribute) formEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForm_Response() {
		return (EReference) formEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getForm__GetHref() {
		return formEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getForm__SetHref__String() {
		return formEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectedResponse() {
		return expectedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpectedResponse_ContentType() {
		return (EAttribute) expectedResponseEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getLink__href() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Type() {
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
	public EOperation getLink__GetHref() {
		return linkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLink__SetHref__String() {
		return linkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiLanguage() {
		return multiLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiLanguage_Translations() {
		return (EReference) multiLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageToContentMap() {
		return languageToContentMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageToContentMap_Key() {
		return (EAttribute) languageToContentMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageToContentMap_Value() {
		return (EAttribute) languageToContentMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionInfo() {
		return versionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionInfo_Instance() {
		return (EAttribute) versionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractionAffordance() {
		return interactionAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionAffordance_Id() {
		return (EAttribute) interactionAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionAffordance_Ititle() {
		return (EAttribute) interactionAffordanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteractionAffordance_Idescription() {
		return (EAttribute) interactionAffordanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionAffordance_Forms() {
		return (EReference) interactionAffordanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionAffordance_UriVariable() {
		return (EReference) interactionAffordanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionAffordance_Ititles() {
		return (EReference) interactionAffordanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteractionAffordance_Idescriptions() {
		return (EReference) interactionAffordanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__GetTitle() {
		return interactionAffordanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__SetTitle__String() {
		return interactionAffordanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__GetDescription() {
		return interactionAffordanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__SetDescription__String() {
		return interactionAffordanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__GetTitles() {
		return interactionAffordanceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__SetTitles__MultiLanguage() {
		return interactionAffordanceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__GetDescriptions() {
		return interactionAffordanceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInteractionAffordance__SetDescriptions__MultiLanguage() {
		return interactionAffordanceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyAffordance() {
		return propertyAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyAffordance_Observable() {
		return (EAttribute) propertyAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionAffordance() {
		return actionAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionAffordance_Safe() {
		return (EAttribute) actionAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionAffordance_Idempotent() {
		return (EAttribute) actionAffordanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionAffordance_Input() {
		return (EReference) actionAffordanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionAffordance_Output() {
		return (EReference) actionAffordanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventAffordance() {
		return eventAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAffordance_Data() {
		return (EReference) eventAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAffordance_Subscription() {
		return (EReference) eventAffordanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAffordance_Cancellation() {
		return (EReference) eventAffordanceEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDataSchema_Dtitle() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Ddescription() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Type() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Const() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Unit() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Enum() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_ReadOnly() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_WriteOnly() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSchema_Format() {
		return (EAttribute) dataSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSchema_OneOf() {
		return (EReference) dataSchemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSchema_Dtitles() {
		return (EReference) dataSchemaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSchema_Ddescriptions() {
		return (EReference) dataSchemaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__GetTitle() {
		return dataSchemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__SetTitle__String() {
		return dataSchemaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__GetDescription() {
		return dataSchemaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__SetDescription__String() {
		return dataSchemaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__GetTitles() {
		return dataSchemaEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__SetTitles__MultiLanguage() {
		return dataSchemaEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__GetDescriptions() {
		return dataSchemaEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSchema__SetDescriptions__MultiLanguage() {
		return dataSchemaEClass.getEOperations().get(7);
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
	public EAttribute getArraySchema_MinItems() {
		return (EAttribute) arraySchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArraySchema_MaxItems() {
		return (EAttribute) arraySchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArraySchema_Items() {
		return (EReference) arraySchemaEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getObjectSchema_Required() {
		return (EAttribute) objectSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectSchema_Properties() {
		return (EReference) objectSchemaEClass.getEStructuralFeatures().get(1);
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
	public EClass getNullSchema() {
		return nullSchemaEClass;
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
	public EAttribute getSecurityScheme_Id() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Scheme() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Proxy() {
		return (EAttribute) securitySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityScheme_Descriptions() {
		return (EReference) securitySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSecurityScheme() {
		return noSecuritySchemeEClass;
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
	public EClass getDigestSecurityScheme() {
		return digestSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_Qop() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_In() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDigestSecurityScheme_Name() {
		return (EAttribute) digestSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPIKeySecurityScheme() {
		return apiKeySecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPIKeySecurityScheme_In() {
		return (EAttribute) apiKeySecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPIKeySecurityScheme_Name() {
		return (EAttribute) apiKeySecuritySchemeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getBearerSecurityScheme_Authorization() {
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
	public EAttribute getBearerSecurityScheme_Format() {
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
	public EClass getPoPSecurityScheme() {
		return poPSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoPSecurityScheme_Authorization() {
		return (EAttribute) poPSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoPSecurityScheme_Alg() {
		return (EAttribute) poPSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoPSecurityScheme_Format() {
		return (EAttribute) poPSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoPSecurityScheme_In() {
		return (EAttribute) poPSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoPSecurityScheme_Name() {
		return (EAttribute) poPSecuritySchemeEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getOAuth2SecurityScheme_Authorization() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Token() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Refresh() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Scopes() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2SecurityScheme_Flow() {
		return (EAttribute) oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(4);
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
		createEAttribute(thingEClass, THING__ID);
		createEAttribute(thingEClass, THING__TITLE);
		createEAttribute(thingEClass, THING__DESCRIPTION);
		createEAttribute(thingEClass, THING__CREATED);
		createEAttribute(thingEClass, THING__MODIFIED);
		createEAttribute(thingEClass, THING__SUPPORT);
		createEAttribute(thingEClass, THING__BASE);
		createEAttribute(thingEClass, THING__SECURITY);
		createEReference(thingEClass, THING__FORMS);
		createEReference(thingEClass, THING__LINKS);
		createEReference(thingEClass, THING__TITLES);
		createEReference(thingEClass, THING__DESCRIPTIONS);
		createEReference(thingEClass, THING__VERSION);
		createEReference(thingEClass, THING__PROPERTIES);
		createEReference(thingEClass, THING__ACTIONS);
		createEReference(thingEClass, THING__EVENTS);
		createEReference(thingEClass, THING__SECURITY_DEFINITIONS);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__OP);
		createEAttribute(formEClass, FORM__HREF);
		createEAttribute(formEClass, FORM__CONTENT_TYPE);
		createEAttribute(formEClass, FORM__CONTENT_CODING);
		createEAttribute(formEClass, FORM__SUB_PROTOCOL);
		createEAttribute(formEClass, FORM__SECURITY);
		createEAttribute(formEClass, FORM__SCOPES);
		createEReference(formEClass, FORM__RESPONSE);
		createEOperation(formEClass, FORM___GET_HREF);
		createEOperation(formEClass, FORM___SET_HREF__STRING);

		expectedResponseEClass = createEClass(EXPECTED_RESPONSE);
		createEAttribute(expectedResponseEClass, EXPECTED_RESPONSE__CONTENT_TYPE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__TYPE);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__ANCHOR);
		createEOperation(linkEClass, LINK___GET_HREF);
		createEOperation(linkEClass, LINK___SET_HREF__STRING);

		multiLanguageEClass = createEClass(MULTI_LANGUAGE);
		createEReference(multiLanguageEClass, MULTI_LANGUAGE__TRANSLATIONS);

		languageToContentMapEClass = createEClass(LANGUAGE_TO_CONTENT_MAP);
		createEAttribute(languageToContentMapEClass, LANGUAGE_TO_CONTENT_MAP__KEY);
		createEAttribute(languageToContentMapEClass, LANGUAGE_TO_CONTENT_MAP__VALUE);

		versionInfoEClass = createEClass(VERSION_INFO);
		createEAttribute(versionInfoEClass, VERSION_INFO__INSTANCE);

		interactionAffordanceEClass = createEClass(INTERACTION_AFFORDANCE);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__ID);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__ITITLE);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__IDESCRIPTION);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__FORMS);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__URI_VARIABLE);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__ITITLES);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__IDESCRIPTIONS);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___GET_TITLE);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___SET_TITLE__STRING);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___GET_DESCRIPTION);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___GET_TITLES);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___GET_DESCRIPTIONS);
		createEOperation(interactionAffordanceEClass, INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE);

		propertyAffordanceEClass = createEClass(PROPERTY_AFFORDANCE);
		createEAttribute(propertyAffordanceEClass, PROPERTY_AFFORDANCE__OBSERVABLE);

		actionAffordanceEClass = createEClass(ACTION_AFFORDANCE);
		createEAttribute(actionAffordanceEClass, ACTION_AFFORDANCE__SAFE);
		createEAttribute(actionAffordanceEClass, ACTION_AFFORDANCE__IDEMPOTENT);
		createEReference(actionAffordanceEClass, ACTION_AFFORDANCE__INPUT);
		createEReference(actionAffordanceEClass, ACTION_AFFORDANCE__OUTPUT);

		eventAffordanceEClass = createEClass(EVENT_AFFORDANCE);
		createEReference(eventAffordanceEClass, EVENT_AFFORDANCE__DATA);
		createEReference(eventAffordanceEClass, EVENT_AFFORDANCE__SUBSCRIPTION);
		createEReference(eventAffordanceEClass, EVENT_AFFORDANCE__CANCELLATION);

		dataSchemaEClass = createEClass(DATA_SCHEMA);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__DTITLE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__DDESCRIPTION);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__TYPE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__CONST);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__UNIT);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__ENUM);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__READ_ONLY);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__WRITE_ONLY);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__FORMAT);
		createEReference(dataSchemaEClass, DATA_SCHEMA__ONE_OF);
		createEReference(dataSchemaEClass, DATA_SCHEMA__DTITLES);
		createEReference(dataSchemaEClass, DATA_SCHEMA__DDESCRIPTIONS);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___GET_TITLE);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___SET_TITLE__STRING);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___GET_DESCRIPTION);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___SET_DESCRIPTION__STRING);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___GET_TITLES);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___SET_TITLES__MULTILANGUAGE);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___GET_DESCRIPTIONS);
		createEOperation(dataSchemaEClass, DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE);

		arraySchemaEClass = createEClass(ARRAY_SCHEMA);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MIN_ITEMS);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MAX_ITEMS);
		createEReference(arraySchemaEClass, ARRAY_SCHEMA__ITEMS);

		objectSchemaEClass = createEClass(OBJECT_SCHEMA);
		createEAttribute(objectSchemaEClass, OBJECT_SCHEMA__REQUIRED);
		createEReference(objectSchemaEClass, OBJECT_SCHEMA__PROPERTIES);

		numberSchemaEClass = createEClass(NUMBER_SCHEMA);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MINIMUM);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MAXIMUM);

		integerSchemaEClass = createEClass(INTEGER_SCHEMA);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MINIMUM);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MAXIMUM);

		stringSchemaEClass = createEClass(STRING_SCHEMA);

		booleanSchemaEClass = createEClass(BOOLEAN_SCHEMA);

		nullSchemaEClass = createEClass(NULL_SCHEMA);

		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__ID);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__PROXY);
		createEReference(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTIONS);

		noSecuritySchemeEClass = createEClass(NO_SECURITY_SCHEME);

		basicSecuritySchemeEClass = createEClass(BASIC_SECURITY_SCHEME);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__IN);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__NAME);

		digestSecuritySchemeEClass = createEClass(DIGEST_SECURITY_SCHEME);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__QOP);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__IN);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__NAME);

		apiKeySecuritySchemeEClass = createEClass(API_KEY_SECURITY_SCHEME);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__IN);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__NAME);

		bearerSecuritySchemeEClass = createEClass(BEARER_SECURITY_SCHEME);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__ALG);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__FORMAT);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__IN);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__NAME);

		certSecuritySchemeEClass = createEClass(CERT_SECURITY_SCHEME);
		createEAttribute(certSecuritySchemeEClass, CERT_SECURITY_SCHEME__IDENTITY);

		pskSecuritySchemeEClass = createEClass(PSK_SECURITY_SCHEME);
		createEAttribute(pskSecuritySchemeEClass, PSK_SECURITY_SCHEME__IDENTITY);

		publicSecuritySchemeEClass = createEClass(PUBLIC_SECURITY_SCHEME);
		createEAttribute(publicSecuritySchemeEClass, PUBLIC_SECURITY_SCHEME__IDENTITY);

		poPSecuritySchemeEClass = createEClass(PO_PSECURITY_SCHEME);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__ALG);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__FORMAT);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__IN);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__NAME);

		oAuth2SecuritySchemeEClass = createEClass(OAUTH2_SECURITY_SCHEME);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__TOKEN);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__REFRESH);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__SCOPES);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__FLOW);

		// Create data types
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		propertyAffordanceEClass.getESuperTypes().add(this.getDataSchema());
		actionAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		eventAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		arraySchemaEClass.getESuperTypes().add(this.getDataSchema());
		objectSchemaEClass.getESuperTypes().add(this.getDataSchema());
		numberSchemaEClass.getESuperTypes().add(this.getDataSchema());
		integerSchemaEClass.getESuperTypes().add(this.getDataSchema());
		stringSchemaEClass.getESuperTypes().add(this.getDataSchema());
		booleanSchemaEClass.getESuperTypes().add(this.getDataSchema());
		nullSchemaEClass.getESuperTypes().add(this.getDataSchema());
		noSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		basicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		digestSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		apiKeySecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		bearerSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		certSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		pskSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		publicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		poPSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		oAuth2SecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());

		// Initialize classes, features, and operations; add parameters
		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Id(), theXMLTypePackage.getAnyURI(), "id", null, 1, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Title(), ecorePackage.getEString(), "title", null, 1, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Description(), ecorePackage.getEString(), "description", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Created(), theXMLTypePackage.getDateTime(), "created", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Modified(), theXMLTypePackage.getDateTime(), "modified", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Support(), theXMLTypePackage.getAnyURI(), "support", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Base(), theXMLTypePackage.getAnyURI(), "base", null, 0, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Security(), ecorePackage.getEString(), "security", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Forms(), this.getForm(), null, "forms", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getThing_Links(), this.getLink(), null, "links", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getThing_Titles(), this.getMultiLanguage(), null, "titles", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Version(), this.getVersionInfo(), null, "version", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Properties(), this.getPropertyAffordance(), null, "properties", null, 0, -1,
				Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Actions(), this.getActionAffordance(), null, "actions", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Events(), this.getEventAffordance(), null, "events", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_SecurityDefinitions(), this.getSecurityScheme(), null, "securityDefinitions", null, 1,
				-1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Op(), ecorePackage.getEString(), "op", null, 1, -1, Form.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm__href(), theXMLTypePackage.getAnyURI(), "_href", null, 1, 1, Form.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContentType(), ecorePackage.getEString(), "contentType", null, 1, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContentCoding(), ecorePackage.getEString(), "contentCoding", null, 0, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_SubProtocol(), ecorePackage.getEString(), "subProtocol", null, 0, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Security(), ecorePackage.getEString(), "security", null, 0, -1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Scopes(), ecorePackage.getEString(), "scopes", null, 0, -1, Form.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Response(), this.getExpectedResponse(), null, "response", null, 0, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getForm__GetHref(), theXMLTypePackage.getAnyURI(), "getHref", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getForm__SetHref__String(), null, "setHref", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnyURI(), "href", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expectedResponseEClass, ExpectedResponse.class, "ExpectedResponse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpectedResponse_ContentType(), ecorePackage.getEString(), "contentType", null, 1, 1,
				ExpectedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink__href(), theXMLTypePackage.getAnyURI(), "_href", null, 1, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), ecorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Anchor(), theXMLTypePackage.getAnyURI(), "anchor", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLink__GetHref(), theXMLTypePackage.getAnyURI(), "getHref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLink__SetHref__String(), null, "setHref", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getAnyURI(), "href", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiLanguageEClass, MultiLanguage.class, "MultiLanguage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiLanguage_Translations(), this.getLanguageToContentMap(), null, "translations", null, 0,
				-1, MultiLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageToContentMapEClass, Map.Entry.class, "LanguageToContentMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageToContentMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageToContentMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionInfoEClass, VersionInfo.class, "VersionInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionInfo_Instance(), ecorePackage.getEString(), "instance", null, 1, 1, VersionInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionAffordanceEClass, InteractionAffordance.class, "InteractionAffordance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionAffordance_Id(), ecorePackage.getEString(), "id", null, 1, 1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionAffordance_Ititle(), ecorePackage.getEString(), "ititle", null, 0, 1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionAffordance_Idescription(), ecorePackage.getEString(), "idescription", null, 0, 1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_Forms(), this.getForm(), null, "forms", null, 1, -1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_UriVariable(), this.getDataSchema(), null, "uriVariable", null, 0, -1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_Ititles(), this.getMultiLanguage(), null, "ititles", null, 0, 1,
				InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_Idescriptions(), this.getMultiLanguage(), null, "idescriptions", null,
				0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInteractionAffordance__GetTitle(), ecorePackage.getEString(), "getTitle", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getInteractionAffordance__SetTitle__String(), null, "setTitle", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "title", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInteractionAffordance__GetDescription(), ecorePackage.getEString(), "getDescription", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionAffordance__SetDescription__String(), null, "setDescription", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInteractionAffordance__GetTitles(), this.getMultiLanguage(), "getTitles", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getInteractionAffordance__SetTitles__MultiLanguage(), null, "setTitles", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getMultiLanguage(), "titles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInteractionAffordance__GetDescriptions(), this.getMultiLanguage(), "getDescriptions", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionAffordance__SetDescriptions__MultiLanguage(), null, "setDescriptions", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMultiLanguage(), "descriptions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyAffordanceEClass, PropertyAffordance.class, "PropertyAffordance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyAffordance_Observable(), ecorePackage.getEBoolean(), "observable", null, 0, 1,
				PropertyAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(actionAffordanceEClass, ActionAffordance.class, "ActionAffordance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionAffordance_Safe(), ecorePackage.getEBoolean(), "safe", null, 1, 1,
				ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionAffordance_Idempotent(), ecorePackage.getEBoolean(), "idempotent", null, 1, 1,
				ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getActionAffordance_Input(), this.getDataSchema(), null, "input", null, 0, 1,
				ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionAffordance_Output(), this.getDataSchema(), null, "output", null, 0, 1,
				ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventAffordanceEClass, EventAffordance.class, "EventAffordance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventAffordance_Data(), this.getDataSchema(), null, "data", null, 0, 1, EventAffordance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventAffordance_Subscription(), this.getDataSchema(), null, "subscription", null, 0, 1,
				EventAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventAffordance_Cancellation(), this.getDataSchema(), null, "cancellation", null, 0, 1,
				EventAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSchemaEClass, DataSchema.class, "DataSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSchema_Dtitle(), ecorePackage.getEString(), "dtitle", null, 0, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Ddescription(), ecorePackage.getEString(), "ddescription", null, 0, 1,
				DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Type(), ecorePackage.getEString(), "type", null, 1, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Const(), this.getAnyType(), "const", null, 0, 1, DataSchema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Enum(), this.getAnyType(), "enum", null, 0, -1, DataSchema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_WriteOnly(), ecorePackage.getEBoolean(), "writeOnly", null, 1, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_OneOf(), this.getDataSchema(), null, "oneOf", null, 0, -1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Dtitles(), this.getMultiLanguage(), null, "dtitles", null, 0, 1, DataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Ddescriptions(), this.getMultiLanguage(), null, "ddescriptions", null, 0, 1,
				DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSchema__GetTitle(), ecorePackage.getEString(), "getTitle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSchema__SetTitle__String(), null, "setTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "title", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSchema__GetDescription(), ecorePackage.getEString(), "getDescription", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getDataSchema__SetDescription__String(), null, "setDescription", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSchema__GetTitles(), this.getMultiLanguage(), "getTitles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSchema__SetTitles__MultiLanguage(), null, "setTitles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMultiLanguage(), "titles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSchema__GetDescriptions(), this.getMultiLanguage(), "getDescriptions", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getDataSchema__SetDescriptions__MultiLanguage(), null, "setDescriptions", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getMultiLanguage(), "descriptions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arraySchemaEClass, ArraySchema.class, "ArraySchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArraySchema_MinItems(), ecorePackage.getEInt(), "minItems", null, 0, 1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArraySchema_MaxItems(), ecorePackage.getEInt(), "maxItems", null, 0, 1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArraySchema_Items(), this.getDataSchema(), null, "items", null, 0, -1, ArraySchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSchemaEClass, ObjectSchema.class, "ObjectSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectSchema_Required(), ecorePackage.getEString(), "required", null, 0, -1,
				ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSchema_Properties(), this.getDataSchema(), null, "properties", null, 0, -1,
				ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberSchemaEClass, NumberSchema.class, "NumberSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberSchema_Minimum(), ecorePackage.getEDouble(), "minimum", null, 0, 1, NumberSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberSchema_Maximum(), ecorePackage.getEDouble(), "maximum", null, 0, 1, NumberSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerSchemaEClass, IntegerSchema.class, "IntegerSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerSchema_Minimum(), ecorePackage.getEInt(), "minimum", null, 0, 1, IntegerSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerSchema_Maximum(), ecorePackage.getEInt(), "maximum", null, 0, 1, IntegerSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSchemaEClass, StringSchema.class, "StringSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanSchemaEClass, BooleanSchema.class, "BooleanSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullSchemaEClass, NullSchema.class, "NullSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_Id(), ecorePackage.getEString(), "id", null, 1, 1, SecurityScheme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Scheme(), ecorePackage.getEString(), "scheme", null, 1, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Proxy(), theXMLTypePackage.getAnyURI(), "proxy", null, 0, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityScheme_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, 1,
				SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noSecuritySchemeEClass, NoSecurityScheme.class, "NoSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicSecuritySchemeEClass, BasicSecurityScheme.class, "BasicSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1,
				BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestSecuritySchemeEClass, DigestSecurityScheme.class, "DigestSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestSecurityScheme_Qop(), ecorePackage.getEString(), "qop", null, 1, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeySecuritySchemeEClass, APIKeySecurityScheme.class, "APIKeySecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIKeySecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1,
				APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPIKeySecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearerSecuritySchemeEClass, BearerSecurityScheme.class, "BearerSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBearerSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0,
				1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_In(), theXMLTypePackage.getAnyURI(), "in", null, 1, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certSecuritySchemeEClass, CertSecurityScheme.class, "CertSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				CertSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pskSecuritySchemeEClass, PSKSecurityScheme.class, "PSKSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSKSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				PSKSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(publicSecuritySchemeEClass, PublicSecurityScheme.class, "PublicSecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1,
				PublicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poPSecuritySchemeEClass, PoPSecurityScheme.class, "PoPSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoPSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1,
				PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1,
				PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1,
				PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_In(), theXMLTypePackage.getAnyURI(), "in", null, 1, 1,
				PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(oAuth2SecuritySchemeEClass, OAuth2SecurityScheme.class, "OAuth2SecurityScheme", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2SecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0,
				1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Token(), theXMLTypePackage.getAnyURI(), "token", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Refresh(), theXMLTypePackage.getAnyURI(), "refresh", null, 0, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Scopes(), ecorePackage.getEString(), "scopes", null, 0, -1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Flow(), ecorePackage.getEString(), "flow", null, 1, 1,
				OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(anyTypeEDataType, Object.class, "AnyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TdPackageImpl
