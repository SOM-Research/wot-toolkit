/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.wot.td.TdFactory
 * @model kind="package"
 * @generated
 */
public interface TdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "td";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som/wot/td/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "td";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TdPackage eINSTANCE = edu.uoc.som.wot.td.impl.TdPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ThingImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getThing()
	 * @generated
	 */
	int THING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__MODIFIED = 4;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SUPPORT = 5;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BASE = 6;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SECURITY = 7;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FORMS = 8;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LINKS = 9;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLES = 10;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTIONS = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__VERSION = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTIES = 13;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ACTIONS = 14;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EVENTS = 15;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SECURITY_DEFINITIONS = 16;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.FormImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OP = 0;

	/**
	 * The feature id for the '<em><b>href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HREF = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Content Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_CODING = 3;

	/**
	 * The feature id for the '<em><b>Sub Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUB_PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECURITY = 5;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SCOPES = 6;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Href</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_HREF = 0;

	/**
	 * The operation id for the '<em>Set Href</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___SET_HREF__STRING = 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ExpectedResponseImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getExpectedResponse()
	 * @generated
	 */
	int EXPECTED_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE__CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.LinkImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Href</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_HREF = 0;

	/**
	 * The operation id for the '<em>Set Href</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___SET_HREF__STRING = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.MultiLanguageImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getMultiLanguage()
	 * @generated
	 */
	int MULTI_LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE__TRANSLATIONS = 0;

	/**
	 * The number of structural features of the '<em>Multi Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multi Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.LanguageToContentMapImpl <em>Language To Content Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.LanguageToContentMapImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getLanguageToContentMap()
	 * @generated
	 */
	int LANGUAGE_TO_CONTENT_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_CONTENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_CONTENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Language To Content Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_CONTENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language To Content Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_CONTENT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.VersionInfoImpl <em>Version Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.VersionInfoImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getVersionInfo()
	 * @generated
	 */
	int VERSION_INFO = 6;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.InteractionAffordanceImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getInteractionAffordance()
	 * @generated
	 */
	int INTERACTION_AFFORDANCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ititle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__ITITLE = 1;

	/**
	 * The feature id for the '<em><b>Idescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__IDESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__FORMS = 3;

	/**
	 * The feature id for the '<em><b>Uri Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__URI_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Ititles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__ITITLES = 5;

	/**
	 * The feature id for the '<em><b>Idescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__IDESCRIPTIONS = 6;

	/**
	 * The number of structural features of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___GET_TITLE = 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___SET_TITLE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___GET_DESCRIPTION = 2;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING = 3;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___GET_TITLES = 4;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE = 5;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___GET_DESCRIPTIONS = 6;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE = 7;

	/**
	 * The number of operations of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PropertyAffordanceImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPropertyAffordance()
	 * @generated
	 */
	int PROPERTY_AFFORDANCE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__ID = INTERACTION_AFFORDANCE__ID;

	/**
	 * The feature id for the '<em><b>Ititle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__ITITLE = INTERACTION_AFFORDANCE__ITITLE;

	/**
	 * The feature id for the '<em><b>Idescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__IDESCRIPTION = INTERACTION_AFFORDANCE__IDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Uri Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__URI_VARIABLE = INTERACTION_AFFORDANCE__URI_VARIABLE;

	/**
	 * The feature id for the '<em><b>Ititles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__ITITLES = INTERACTION_AFFORDANCE__ITITLES;

	/**
	 * The feature id for the '<em><b>Idescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__IDESCRIPTIONS = INTERACTION_AFFORDANCE__IDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DTITLE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DDESCRIPTION = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__TYPE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__CONST = INTERACTION_AFFORDANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__UNIT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__ENUM = INTERACTION_AFFORDANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__READ_ONLY = INTERACTION_AFFORDANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__WRITE_ONLY = INTERACTION_AFFORDANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__FORMAT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__ONE_OF = INTERACTION_AFFORDANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DTITLES = INTERACTION_AFFORDANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DDESCRIPTIONS = INTERACTION_AFFORDANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__OBSERVABLE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___GET_TITLE = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___SET_TITLE__STRING = INTERACTION_AFFORDANCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___GET_DESCRIPTION = INTERACTION_AFFORDANCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___SET_DESCRIPTION__STRING = INTERACTION_AFFORDANCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___GET_TITLES = INTERACTION_AFFORDANCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___SET_TITLES__MULTILANGUAGE = INTERACTION_AFFORDANCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___GET_DESCRIPTIONS = INTERACTION_AFFORDANCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE = INTERACTION_AFFORDANCE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ActionAffordanceImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getActionAffordance()
	 * @generated
	 */
	int ACTION_AFFORDANCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__ID = INTERACTION_AFFORDANCE__ID;

	/**
	 * The feature id for the '<em><b>Ititle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__ITITLE = INTERACTION_AFFORDANCE__ITITLE;

	/**
	 * The feature id for the '<em><b>Idescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__IDESCRIPTION = INTERACTION_AFFORDANCE__IDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Uri Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__URI_VARIABLE = INTERACTION_AFFORDANCE__URI_VARIABLE;

	/**
	 * The feature id for the '<em><b>Ititles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__ITITLES = INTERACTION_AFFORDANCE__ITITLES;

	/**
	 * The feature id for the '<em><b>Idescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__IDESCRIPTIONS = INTERACTION_AFFORDANCE__IDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__SAFE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__IDEMPOTENT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__INPUT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__OUTPUT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___GET_TITLE = INTERACTION_AFFORDANCE___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___SET_TITLE__STRING = INTERACTION_AFFORDANCE___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___GET_DESCRIPTION = INTERACTION_AFFORDANCE___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___SET_DESCRIPTION__STRING = INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___GET_TITLES = INTERACTION_AFFORDANCE___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE = INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___GET_DESCRIPTIONS = INTERACTION_AFFORDANCE___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE = INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.EventAffordanceImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getEventAffordance()
	 * @generated
	 */
	int EVENT_AFFORDANCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__ID = INTERACTION_AFFORDANCE__ID;

	/**
	 * The feature id for the '<em><b>Ititle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__ITITLE = INTERACTION_AFFORDANCE__ITITLE;

	/**
	 * The feature id for the '<em><b>Idescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__IDESCRIPTION = INTERACTION_AFFORDANCE__IDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Uri Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__URI_VARIABLE = INTERACTION_AFFORDANCE__URI_VARIABLE;

	/**
	 * The feature id for the '<em><b>Ititles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__ITITLES = INTERACTION_AFFORDANCE__ITITLES;

	/**
	 * The feature id for the '<em><b>Idescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__IDESCRIPTIONS = INTERACTION_AFFORDANCE__IDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__DATA = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__SUBSCRIPTION = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__CANCELLATION = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___GET_TITLE = INTERACTION_AFFORDANCE___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___SET_TITLE__STRING = INTERACTION_AFFORDANCE___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___GET_DESCRIPTION = INTERACTION_AFFORDANCE___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___SET_DESCRIPTION__STRING = INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___GET_TITLES = INTERACTION_AFFORDANCE___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___SET_TITLES__MULTILANGUAGE = INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___GET_DESCRIPTIONS = INTERACTION_AFFORDANCE___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE = INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.DataSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DTITLE = 0;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DDESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__CONST = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ENUM = 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__READ_ONLY = 6;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__WRITE_ONLY = 7;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__FORMAT = 8;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ONE_OF = 9;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DTITLES = 10;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DDESCRIPTIONS = 11;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___GET_TITLE = 0;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___SET_TITLE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___GET_DESCRIPTION = 2;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___SET_DESCRIPTION__STRING = 3;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___GET_TITLES = 4;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___SET_TITLES__MULTILANGUAGE = 5;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___GET_DESCRIPTIONS = 6;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = 7;

	/**
	 * The number of operations of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ArraySchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getArraySchema()
	 * @generated
	 */
	int ARRAY_SCHEMA = 12;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MIN_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MAX_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ITEMS = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ObjectSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getObjectSchema()
	 * @generated
	 */
	int OBJECT_SCHEMA = 13;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__REQUIRED = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__PROPERTIES = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.NumberSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNumberSchema()
	 * @generated
	 */
	int NUMBER_SCHEMA = 14;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__MINIMUM = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__MAXIMUM = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Number Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.IntegerSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getIntegerSchema()
	 * @generated
	 */
	int INTEGER_SCHEMA = 15;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__MINIMUM = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__MAXIMUM = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Integer Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.StringSchemaImpl <em>String Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.StringSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getStringSchema()
	 * @generated
	 */
	int STRING_SCHEMA = 16;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>String Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>String Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.BooleanSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBooleanSchema()
	 * @generated
	 */
	int BOOLEAN_SCHEMA = 17;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.NullSchemaImpl <em>Null Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.NullSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNullSchema()
	 * @generated
	 */
	int NULL_SCHEMA = 18;

	/**
	 * The feature id for the '<em><b>Dtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DTITLE = DATA_SCHEMA__DTITLE;

	/**
	 * The feature id for the '<em><b>Ddescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DDESCRIPTION = DATA_SCHEMA__DDESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Dtitles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DTITLES = DATA_SCHEMA__DTITLES;

	/**
	 * The feature id for the '<em><b>Ddescriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DDESCRIPTIONS = DATA_SCHEMA__DDESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>Null Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___GET_TITLE = DATA_SCHEMA___GET_TITLE;

	/**
	 * The operation id for the '<em>Set Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___SET_TITLE__STRING = DATA_SCHEMA___SET_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___GET_DESCRIPTION = DATA_SCHEMA___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Set Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___SET_DESCRIPTION__STRING = DATA_SCHEMA___SET_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___GET_TITLES = DATA_SCHEMA___GET_TITLES;

	/**
	 * The operation id for the '<em>Set Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___SET_TITLES__MULTILANGUAGE = DATA_SCHEMA___SET_TITLES__MULTILANGUAGE;

	/**
	 * The operation id for the '<em>Get Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___GET_DESCRIPTIONS = DATA_SCHEMA___GET_DESCRIPTIONS;

	/**
	 * The operation id for the '<em>Set Descriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE;

	/**
	 * The number of operations of the '<em>Null Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.SecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__ID = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__PROXY = 3;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.NoSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNoSecurityScheme()
	 * @generated
	 */
	int NO_SECURITY_SCHEME = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBasicSecurityScheme()
	 * @generated
	 */
	int BASIC_SECURITY_SCHEME = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDigestSecurityScheme()
	 * @generated
	 */
	int DIGEST_SECURITY_SCHEME = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Qop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__QOP = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.APIKeySecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAPIKeySecurityScheme()
	 * @generated
	 */
	int API_KEY_SECURITY_SCHEME = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBearerSecurityScheme()
	 * @generated
	 */
	int BEARER_SECURITY_SCHEME = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getCertSecurityScheme()
	 * @generated
	 */
	int CERT_SECURITY_SCHEME = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPSKSecurityScheme()
	 * @generated
	 */
	int PSK_SECURITY_SCHEME = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPublicSecurityScheme()
	 * @generated
	 */
	int PUBLIC_SECURITY_SCHEME = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PoPSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPoPSecurityScheme()
	 * @generated
	 */
	int PO_PSECURITY_SCHEME = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getOAuth2SecurityScheme()
	 * @generated
	 */
	int OAUTH2_SECURITY_SCHEME = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__ID = SECURITY_SCHEME__ID;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__TOKEN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__REFRESH = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCOPES = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__FLOW = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Any Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 30;

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see edu.uoc.som.wot.td.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getId()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getTitle()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getDescription()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getCreated()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Created();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getModified()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Modified();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getSupport()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Support();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getBase()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Base();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.Thing#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getSecurity()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getForms()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getLinks()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Links();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.Thing#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Titles</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getTitles()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Titles();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.Thing#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptions</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getDescriptions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Descriptions();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.Thing#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getVersion()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getProperties()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getActions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getEvents()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Definitions</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getSecurityDefinitions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_SecurityDefinitions();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see edu.uoc.som.wot.td.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.Form#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see edu.uoc.som.wot.td.Form#getOp()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Op();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form <em>href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>href</em>'.
	 * @see edu.uoc.som.wot.td.Form
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm__href();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see edu.uoc.som.wot.td.Form#getContentType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getContentCoding <em>Content Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Coding</em>'.
	 * @see edu.uoc.som.wot.td.Form#getContentCoding()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentCoding();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getSubProtocol <em>Sub Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Protocol</em>'.
	 * @see edu.uoc.som.wot.td.Form#getSubProtocol()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_SubProtocol();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.Form#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security</em>'.
	 * @see edu.uoc.som.wot.td.Form#getSecurity()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Security();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.Form#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scopes</em>'.
	 * @see edu.uoc.som.wot.td.Form#getScopes()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Scopes();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.Form#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see edu.uoc.som.wot.td.Form#getResponse()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Response();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.Form#getHref() <em>Get Href</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Href</em>' operation.
	 * @see edu.uoc.som.wot.td.Form#getHref()
	 * @generated
	 */
	EOperation getForm__GetHref();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.Form#setHref(java.lang.String) <em>Set Href</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Href</em>' operation.
	 * @see edu.uoc.som.wot.td.Form#setHref(java.lang.String)
	 * @generated
	 */
	EOperation getForm__SetHref__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ExpectedResponse <em>Expected Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Response</em>'.
	 * @see edu.uoc.som.wot.td.ExpectedResponse
	 * @generated
	 */
	EClass getExpectedResponse();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ExpectedResponse#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see edu.uoc.som.wot.td.ExpectedResponse#getContentType()
	 * @see #getExpectedResponse()
	 * @generated
	 */
	EAttribute getExpectedResponse_ContentType();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see edu.uoc.som.wot.td.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link <em>href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>href</em>'.
	 * @see edu.uoc.som.wot.td.Link
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink__href();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.wot.td.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see edu.uoc.som.wot.td.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see edu.uoc.som.wot.td.Link#getAnchor()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Anchor();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.Link#getHref() <em>Get Href</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Href</em>' operation.
	 * @see edu.uoc.som.wot.td.Link#getHref()
	 * @generated
	 */
	EOperation getLink__GetHref();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.Link#setHref(java.lang.String) <em>Set Href</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Href</em>' operation.
	 * @see edu.uoc.som.wot.td.Link#setHref(java.lang.String)
	 * @generated
	 */
	EOperation getLink__SetHref__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.MultiLanguage <em>Multi Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Language</em>'.
	 * @see edu.uoc.som.wot.td.MultiLanguage
	 * @generated
	 */
	EClass getMultiLanguage();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.wot.td.MultiLanguage#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Translations</em>'.
	 * @see edu.uoc.som.wot.td.MultiLanguage#getTranslations()
	 * @see #getMultiLanguage()
	 * @generated
	 */
	EReference getMultiLanguage_Translations();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Language To Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language To Content Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getLanguageToContentMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToContentMap()
	 * @generated
	 */
	EAttribute getLanguageToContentMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToContentMap()
	 * @generated
	 */
	EAttribute getLanguageToContentMap_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info</em>'.
	 * @see edu.uoc.som.wot.td.VersionInfo
	 * @generated
	 */
	EClass getVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.VersionInfo#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see edu.uoc.som.wot.td.VersionInfo#getInstance()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Instance();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.InteractionAffordance <em>Interaction Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Affordance</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance
	 * @generated
	 */
	EClass getInteractionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.InteractionAffordance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getId()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.InteractionAffordance <em>Ititle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ititle</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Ititle();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.InteractionAffordance <em>Idescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idescription</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Idescription();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.InteractionAffordance#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getForms()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.InteractionAffordance#getUriVariable <em>Uri Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uri Variable</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getUriVariable()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_UriVariable();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.InteractionAffordance <em>Ititles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ititles</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Ititles();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.InteractionAffordance <em>Idescriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Idescriptions</em>'.
	 * @see edu.uoc.som.wot.td.InteractionAffordance
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Idescriptions();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getTitle()
	 * @generated
	 */
	EOperation getInteractionAffordance__GetTitle();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getInteractionAffordance__SetTitle__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getDescription()
	 * @generated
	 */
	EOperation getInteractionAffordance__GetDescription();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#setDescription(java.lang.String) <em>Set Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Description</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#setDescription(java.lang.String)
	 * @generated
	 */
	EOperation getInteractionAffordance__SetDescription__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#getTitles() <em>Get Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Titles</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getTitles()
	 * @generated
	 */
	EOperation getInteractionAffordance__GetTitles();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#setTitles(edu.uoc.som.wot.td.MultiLanguage) <em>Set Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Titles</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#setTitles(edu.uoc.som.wot.td.MultiLanguage)
	 * @generated
	 */
	EOperation getInteractionAffordance__SetTitles__MultiLanguage();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#getDescriptions() <em>Get Descriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Descriptions</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#getDescriptions()
	 * @generated
	 */
	EOperation getInteractionAffordance__GetDescriptions();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.InteractionAffordance#setDescriptions(edu.uoc.som.wot.td.MultiLanguage) <em>Set Descriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Descriptions</em>' operation.
	 * @see edu.uoc.som.wot.td.InteractionAffordance#setDescriptions(edu.uoc.som.wot.td.MultiLanguage)
	 * @generated
	 */
	EOperation getInteractionAffordance__SetDescriptions__MultiLanguage();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.PropertyAffordance <em>Property Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Affordance</em>'.
	 * @see edu.uoc.som.wot.td.PropertyAffordance
	 * @generated
	 */
	EClass getPropertyAffordance();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PropertyAffordance#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see edu.uoc.som.wot.td.PropertyAffordance#isObservable()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_Observable();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ActionAffordance <em>Action Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Affordance</em>'.
	 * @see edu.uoc.som.wot.td.ActionAffordance
	 * @generated
	 */
	EClass getActionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ActionAffordance#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see edu.uoc.som.wot.td.ActionAffordance#isSafe()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Safe();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ActionAffordance#isIdempotent <em>Idempotent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent</em>'.
	 * @see edu.uoc.som.wot.td.ActionAffordance#isIdempotent()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Idempotent();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.ActionAffordance#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see edu.uoc.som.wot.td.ActionAffordance#getInput()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EReference getActionAffordance_Input();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.ActionAffordance#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see edu.uoc.som.wot.td.ActionAffordance#getOutput()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EReference getActionAffordance_Output();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.EventAffordance <em>Event Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Affordance</em>'.
	 * @see edu.uoc.som.wot.td.EventAffordance
	 * @generated
	 */
	EClass getEventAffordance();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.EventAffordance#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see edu.uoc.som.wot.td.EventAffordance#getData()
	 * @see #getEventAffordance()
	 * @generated
	 */
	EReference getEventAffordance_Data();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.EventAffordance#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription</em>'.
	 * @see edu.uoc.som.wot.td.EventAffordance#getSubscription()
	 * @see #getEventAffordance()
	 * @generated
	 */
	EReference getEventAffordance_Subscription();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.EventAffordance#getCancellation <em>Cancellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancellation</em>'.
	 * @see edu.uoc.som.wot.td.EventAffordance#getCancellation()
	 * @see #getEventAffordance()
	 * @generated
	 */
	EReference getEventAffordance_Cancellation();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema <em>Dtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtitle</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Dtitle();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema <em>Ddescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ddescription</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Ddescription();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getConst()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Const();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getUnit()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.DataSchema#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getEnum()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Enum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#isReadOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#isWriteOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_WriteOnly();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getFormat()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.DataSchema#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getOneOf()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.DataSchema <em>Dtitles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dtitles</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Dtitles();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.DataSchema <em>Ddescriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ddescriptions</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Ddescriptions();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#getTitle()
	 * @generated
	 */
	EOperation getDataSchema__GetTitle();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#setTitle(java.lang.String) <em>Set Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Title</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#setTitle(java.lang.String)
	 * @generated
	 */
	EOperation getDataSchema__SetTitle__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#getDescription()
	 * @generated
	 */
	EOperation getDataSchema__GetDescription();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#setDescription(java.lang.String) <em>Set Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Description</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#setDescription(java.lang.String)
	 * @generated
	 */
	EOperation getDataSchema__SetDescription__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#getTitles() <em>Get Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Titles</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#getTitles()
	 * @generated
	 */
	EOperation getDataSchema__GetTitles();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#setTitles(edu.uoc.som.wot.td.MultiLanguage) <em>Set Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Titles</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#setTitles(edu.uoc.som.wot.td.MultiLanguage)
	 * @generated
	 */
	EOperation getDataSchema__SetTitles__MultiLanguage();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#getDescriptions() <em>Get Descriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Descriptions</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#getDescriptions()
	 * @generated
	 */
	EOperation getDataSchema__GetDescriptions();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.wot.td.DataSchema#setDescriptions(edu.uoc.som.wot.td.MultiLanguage) <em>Set Descriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Descriptions</em>' operation.
	 * @see edu.uoc.som.wot.td.DataSchema#setDescriptions(edu.uoc.som.wot.td.MultiLanguage)
	 * @generated
	 */
	EOperation getDataSchema__SetDescriptions__MultiLanguage();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ArraySchema <em>Array Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Schema</em>'.
	 * @see edu.uoc.som.wot.td.ArraySchema
	 * @generated
	 */
	EClass getArraySchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ArraySchema#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.uoc.som.wot.td.ArraySchema#getMinItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ArraySchema#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.uoc.som.wot.td.ArraySchema#getMaxItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MaxItems();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.ArraySchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see edu.uoc.som.wot.td.ArraySchema#getItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EReference getArraySchema_Items();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Schema</em>'.
	 * @see edu.uoc.som.wot.td.ObjectSchema
	 * @generated
	 */
	EClass getObjectSchema();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.ObjectSchema#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required</em>'.
	 * @see edu.uoc.som.wot.td.ObjectSchema#getRequired()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EAttribute getObjectSchema_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.ObjectSchema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edu.uoc.som.wot.td.ObjectSchema#getProperties()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EReference getObjectSchema_Properties();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.NumberSchema <em>Number Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Schema</em>'.
	 * @see edu.uoc.som.wot.td.NumberSchema
	 * @generated
	 */
	EClass getNumberSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.NumberSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.uoc.som.wot.td.NumberSchema#getMinimum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.NumberSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.uoc.som.wot.td.NumberSchema#getMaximum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.IntegerSchema <em>Integer Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Schema</em>'.
	 * @see edu.uoc.som.wot.td.IntegerSchema
	 * @generated
	 */
	EClass getIntegerSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.IntegerSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.uoc.som.wot.td.IntegerSchema#getMinimum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.IntegerSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.uoc.som.wot.td.IntegerSchema#getMaximum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.StringSchema <em>String Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Schema</em>'.
	 * @see edu.uoc.som.wot.td.StringSchema
	 * @generated
	 */
	EClass getStringSchema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Schema</em>'.
	 * @see edu.uoc.som.wot.td.BooleanSchema
	 * @generated
	 */
	EClass getBooleanSchema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.NullSchema <em>Null Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Schema</em>'.
	 * @see edu.uoc.som.wot.td.NullSchema
	 * @generated
	 */
	EClass getNullSchema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.SecurityScheme#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getId()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.SecurityScheme#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getScheme()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.SecurityScheme#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getProxy()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Proxy();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.wot.td.SecurityScheme#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptions</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getDescriptions()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Descriptions();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.NoSecurityScheme <em>No Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.NoSecurityScheme
	 * @generated
	 */
	EClass getNoSecurityScheme();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.BasicSecurityScheme <em>Basic Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.BasicSecurityScheme
	 * @generated
	 */
	EClass getBasicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BasicSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.BasicSecurityScheme#getIn()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BasicSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.BasicSecurityScheme#getName()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.DigestSecurityScheme <em>Digest Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.DigestSecurityScheme
	 * @generated
	 */
	EClass getDigestSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getQop <em>Qop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qop</em>'.
	 * @see edu.uoc.som.wot.td.DigestSecurityScheme#getQop()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Qop();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.DigestSecurityScheme#getIn()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DigestSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.DigestSecurityScheme#getName()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.APIKeySecurityScheme <em>API Key Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Key Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.APIKeySecurityScheme
	 * @generated
	 */
	EClass getAPIKeySecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.APIKeySecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.APIKeySecurityScheme#getIn()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.APIKeySecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.APIKeySecurityScheme#getName()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearer Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme
	 * @generated
	 */
	EClass getBearerSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorization()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getAlg()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getFormat()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getIn()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getName()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.CertSecurityScheme <em>Cert Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cert Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.CertSecurityScheme
	 * @generated
	 */
	EClass getCertSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.CertSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see edu.uoc.som.wot.td.CertSecurityScheme#getIdentity()
	 * @see #getCertSecurityScheme()
	 * @generated
	 */
	EAttribute getCertSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.PSKSecurityScheme <em>PSK Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSK Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.PSKSecurityScheme
	 * @generated
	 */
	EClass getPSKSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PSKSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see edu.uoc.som.wot.td.PSKSecurityScheme#getIdentity()
	 * @see #getPSKSecurityScheme()
	 * @generated
	 */
	EAttribute getPSKSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.PublicSecurityScheme <em>Public Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.PublicSecurityScheme
	 * @generated
	 */
	EClass getPublicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PublicSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see edu.uoc.som.wot.td.PublicSecurityScheme#getIdentity()
	 * @see #getPublicSecurityScheme()
	 * @generated
	 */
	EAttribute getPublicSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.PoPSecurityScheme <em>Po PSecurity Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po PSecurity Scheme</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme
	 * @generated
	 */
	EClass getPoPSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PoPSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme#getAuthorization()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PoPSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme#getAlg()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PoPSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme#getFormat()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PoPSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme#getIn()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PoPSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.PoPSecurityScheme#getName()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme
	 * @generated
	 */
	EClass getOAuth2SecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorization()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getToken()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Token();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefresh <em>Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefresh()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Refresh();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scopes</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getScopes()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getFlow()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Flow();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getAnyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TdFactory getTdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ThingImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__ID = eINSTANCE.getThing_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__TITLE = eINSTANCE.getThing_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__DESCRIPTION = eINSTANCE.getThing_Description();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__CREATED = eINSTANCE.getThing_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__MODIFIED = eINSTANCE.getThing_Modified();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SUPPORT = eINSTANCE.getThing_Support();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__BASE = eINSTANCE.getThing_Base();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SECURITY = eINSTANCE.getThing_Security();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__FORMS = eINSTANCE.getThing_Forms();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__LINKS = eINSTANCE.getThing_Links();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__TITLES = eINSTANCE.getThing_Titles();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__DESCRIPTIONS = eINSTANCE.getThing_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__VERSION = eINSTANCE.getThing_Version();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ACTIONS = eINSTANCE.getThing_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EVENTS = eINSTANCE.getThing_Events();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__SECURITY_DEFINITIONS = eINSTANCE.getThing_SecurityDefinitions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.FormImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__OP = eINSTANCE.getForm_Op();

		/**
		 * The meta object literal for the '<em><b>href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__HREF = eINSTANCE.getForm__href();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_TYPE = eINSTANCE.getForm_ContentType();

		/**
		 * The meta object literal for the '<em><b>Content Coding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_CODING = eINSTANCE.getForm_ContentCoding();

		/**
		 * The meta object literal for the '<em><b>Sub Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SUB_PROTOCOL = eINSTANCE.getForm_SubProtocol();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SECURITY = eINSTANCE.getForm_Security();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SCOPES = eINSTANCE.getForm_Scopes();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__RESPONSE = eINSTANCE.getForm_Response();

		/**
		 * The meta object literal for the '<em><b>Get Href</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM___GET_HREF = eINSTANCE.getForm__GetHref();

		/**
		 * The meta object literal for the '<em><b>Set Href</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM___SET_HREF__STRING = eINSTANCE.getForm__SetHref__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ExpectedResponseImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getExpectedResponse()
		 * @generated
		 */
		EClass EXPECTED_RESPONSE = eINSTANCE.getExpectedResponse();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESPONSE__CONTENT_TYPE = eINSTANCE.getExpectedResponse_ContentType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.LinkImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink__href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ANCHOR = eINSTANCE.getLink_Anchor();

		/**
		 * The meta object literal for the '<em><b>Get Href</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___GET_HREF = eINSTANCE.getLink__GetHref();

		/**
		 * The meta object literal for the '<em><b>Set Href</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___SET_HREF__STRING = eINSTANCE.getLink__SetHref__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.MultiLanguageImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getMultiLanguage()
		 * @generated
		 */
		EClass MULTI_LANGUAGE = eINSTANCE.getMultiLanguage();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LANGUAGE__TRANSLATIONS = eINSTANCE.getMultiLanguage_Translations();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.LanguageToContentMapImpl <em>Language To Content Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.LanguageToContentMapImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getLanguageToContentMap()
		 * @generated
		 */
		EClass LANGUAGE_TO_CONTENT_MAP = eINSTANCE.getLanguageToContentMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_TO_CONTENT_MAP__KEY = eINSTANCE.getLanguageToContentMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_TO_CONTENT_MAP__VALUE = eINSTANCE.getLanguageToContentMap_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.VersionInfoImpl <em>Version Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.VersionInfoImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getVersionInfo()
		 * @generated
		 */
		EClass VERSION_INFO = eINSTANCE.getVersionInfo();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO__INSTANCE = eINSTANCE.getVersionInfo_Instance();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.InteractionAffordanceImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getInteractionAffordance()
		 * @generated
		 */
		EClass INTERACTION_AFFORDANCE = eINSTANCE.getInteractionAffordance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__ID = eINSTANCE.getInteractionAffordance_Id();

		/**
		 * The meta object literal for the '<em><b>Ititle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__ITITLE = eINSTANCE.getInteractionAffordance_Ititle();

		/**
		 * The meta object literal for the '<em><b>Idescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__IDESCRIPTION = eINSTANCE.getInteractionAffordance_Idescription();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__FORMS = eINSTANCE.getInteractionAffordance_Forms();

		/**
		 * The meta object literal for the '<em><b>Uri Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__URI_VARIABLE = eINSTANCE.getInteractionAffordance_UriVariable();

		/**
		 * The meta object literal for the '<em><b>Ititles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__ITITLES = eINSTANCE.getInteractionAffordance_Ititles();

		/**
		 * The meta object literal for the '<em><b>Idescriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__IDESCRIPTIONS = eINSTANCE.getInteractionAffordance_Idescriptions();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___GET_TITLE = eINSTANCE.getInteractionAffordance__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Set Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___SET_TITLE__STRING = eINSTANCE.getInteractionAffordance__SetTitle__String();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___GET_DESCRIPTION = eINSTANCE.getInteractionAffordance__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Set Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING = eINSTANCE
				.getInteractionAffordance__SetDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___GET_TITLES = eINSTANCE.getInteractionAffordance__GetTitles();

		/**
		 * The meta object literal for the '<em><b>Set Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE = eINSTANCE
				.getInteractionAffordance__SetTitles__MultiLanguage();

		/**
		 * The meta object literal for the '<em><b>Get Descriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___GET_DESCRIPTIONS = eINSTANCE.getInteractionAffordance__GetDescriptions();

		/**
		 * The meta object literal for the '<em><b>Set Descriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE = eINSTANCE
				.getInteractionAffordance__SetDescriptions__MultiLanguage();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PropertyAffordanceImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPropertyAffordance()
		 * @generated
		 */
		EClass PROPERTY_AFFORDANCE = eINSTANCE.getPropertyAffordance();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_AFFORDANCE__OBSERVABLE = eINSTANCE.getPropertyAffordance_Observable();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ActionAffordanceImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getActionAffordance()
		 * @generated
		 */
		EClass ACTION_AFFORDANCE = eINSTANCE.getActionAffordance();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__SAFE = eINSTANCE.getActionAffordance_Safe();

		/**
		 * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__IDEMPOTENT = eINSTANCE.getActionAffordance_Idempotent();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_AFFORDANCE__INPUT = eINSTANCE.getActionAffordance_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_AFFORDANCE__OUTPUT = eINSTANCE.getActionAffordance_Output();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.EventAffordanceImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getEventAffordance()
		 * @generated
		 */
		EClass EVENT_AFFORDANCE = eINSTANCE.getEventAffordance();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_AFFORDANCE__DATA = eINSTANCE.getEventAffordance_Data();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_AFFORDANCE__SUBSCRIPTION = eINSTANCE.getEventAffordance_Subscription();

		/**
		 * The meta object literal for the '<em><b>Cancellation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_AFFORDANCE__CANCELLATION = eINSTANCE.getEventAffordance_Cancellation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.DataSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDataSchema()
		 * @generated
		 */
		EClass DATA_SCHEMA = eINSTANCE.getDataSchema();

		/**
		 * The meta object literal for the '<em><b>Dtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DTITLE = eINSTANCE.getDataSchema_Dtitle();

		/**
		 * The meta object literal for the '<em><b>Ddescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DDESCRIPTION = eINSTANCE.getDataSchema_Ddescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TYPE = eINSTANCE.getDataSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__CONST = eINSTANCE.getDataSchema_Const();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__UNIT = eINSTANCE.getDataSchema_Unit();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__ENUM = eINSTANCE.getDataSchema_Enum();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__READ_ONLY = eINSTANCE.getDataSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__WRITE_ONLY = eINSTANCE.getDataSchema_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__FORMAT = eINSTANCE.getDataSchema_Format();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__ONE_OF = eINSTANCE.getDataSchema_OneOf();

		/**
		 * The meta object literal for the '<em><b>Dtitles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__DTITLES = eINSTANCE.getDataSchema_Dtitles();

		/**
		 * The meta object literal for the '<em><b>Ddescriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__DDESCRIPTIONS = eINSTANCE.getDataSchema_Ddescriptions();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___GET_TITLE = eINSTANCE.getDataSchema__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Set Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___SET_TITLE__STRING = eINSTANCE.getDataSchema__SetTitle__String();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___GET_DESCRIPTION = eINSTANCE.getDataSchema__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Set Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___SET_DESCRIPTION__STRING = eINSTANCE.getDataSchema__SetDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___GET_TITLES = eINSTANCE.getDataSchema__GetTitles();

		/**
		 * The meta object literal for the '<em><b>Set Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___SET_TITLES__MULTILANGUAGE = eINSTANCE.getDataSchema__SetTitles__MultiLanguage();

		/**
		 * The meta object literal for the '<em><b>Get Descriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___GET_DESCRIPTIONS = eINSTANCE.getDataSchema__GetDescriptions();

		/**
		 * The meta object literal for the '<em><b>Set Descriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE = eINSTANCE
				.getDataSchema__SetDescriptions__MultiLanguage();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ArraySchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getArraySchema()
		 * @generated
		 */
		EClass ARRAY_SCHEMA = eINSTANCE.getArraySchema();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SCHEMA__MIN_ITEMS = eINSTANCE.getArraySchema_MinItems();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SCHEMA__MAX_ITEMS = eINSTANCE.getArraySchema_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SCHEMA__ITEMS = eINSTANCE.getArraySchema_Items();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ObjectSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getObjectSchema()
		 * @generated
		 */
		EClass OBJECT_SCHEMA = eINSTANCE.getObjectSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_SCHEMA__REQUIRED = eINSTANCE.getObjectSchema_Required();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SCHEMA__PROPERTIES = eINSTANCE.getObjectSchema_Properties();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.NumberSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNumberSchema()
		 * @generated
		 */
		EClass NUMBER_SCHEMA = eINSTANCE.getNumberSchema();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_SCHEMA__MINIMUM = eINSTANCE.getNumberSchema_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_SCHEMA__MAXIMUM = eINSTANCE.getNumberSchema_Maximum();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.IntegerSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getIntegerSchema()
		 * @generated
		 */
		EClass INTEGER_SCHEMA = eINSTANCE.getIntegerSchema();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SCHEMA__MINIMUM = eINSTANCE.getIntegerSchema_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SCHEMA__MAXIMUM = eINSTANCE.getIntegerSchema_Maximum();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.StringSchemaImpl <em>String Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.StringSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getStringSchema()
		 * @generated
		 */
		EClass STRING_SCHEMA = eINSTANCE.getStringSchema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.BooleanSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBooleanSchema()
		 * @generated
		 */
		EClass BOOLEAN_SCHEMA = eINSTANCE.getBooleanSchema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.NullSchemaImpl <em>Null Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.NullSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNullSchema()
		 * @generated
		 */
		EClass NULL_SCHEMA = eINSTANCE.getNullSchema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.SecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__ID = eINSTANCE.getSecurityScheme_Id();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SCHEME = eINSTANCE.getSecurityScheme_Scheme();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__PROXY = eINSTANCE.getSecurityScheme_Proxy();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME__DESCRIPTIONS = eINSTANCE.getSecurityScheme_Descriptions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.NoSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNoSecurityScheme()
		 * @generated
		 */
		EClass NO_SECURITY_SCHEME = eINSTANCE.getNoSecurityScheme();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBasicSecurityScheme()
		 * @generated
		 */
		EClass BASIC_SECURITY_SCHEME = eINSTANCE.getBasicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__IN = eINSTANCE.getBasicSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__NAME = eINSTANCE.getBasicSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDigestSecurityScheme()
		 * @generated
		 */
		EClass DIGEST_SECURITY_SCHEME = eINSTANCE.getDigestSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Qop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__QOP = eINSTANCE.getDigestSecurityScheme_Qop();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__IN = eINSTANCE.getDigestSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__NAME = eINSTANCE.getDigestSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.APIKeySecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAPIKeySecurityScheme()
		 * @generated
		 */
		EClass API_KEY_SECURITY_SCHEME = eINSTANCE.getAPIKeySecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__IN = eINSTANCE.getAPIKeySecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__NAME = eINSTANCE.getAPIKeySecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBearerSecurityScheme()
		 * @generated
		 */
		EClass BEARER_SECURITY_SCHEME = eINSTANCE.getBearerSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getBearerSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__ALG = eINSTANCE.getBearerSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__FORMAT = eINSTANCE.getBearerSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__IN = eINSTANCE.getBearerSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__NAME = eINSTANCE.getBearerSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getCertSecurityScheme()
		 * @generated
		 */
		EClass CERT_SECURITY_SCHEME = eINSTANCE.getCertSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERT_SECURITY_SCHEME__IDENTITY = eINSTANCE.getCertSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPSKSecurityScheme()
		 * @generated
		 */
		EClass PSK_SECURITY_SCHEME = eINSTANCE.getPSKSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSK_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPSKSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPublicSecurityScheme()
		 * @generated
		 */
		EClass PUBLIC_SECURITY_SCHEME = eINSTANCE.getPublicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPublicSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PoPSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPoPSecurityScheme()
		 * @generated
		 */
		EClass PO_PSECURITY_SCHEME = eINSTANCE.getPoPSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getPoPSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__ALG = eINSTANCE.getPoPSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__FORMAT = eINSTANCE.getPoPSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__IN = eINSTANCE.getPoPSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__NAME = eINSTANCE.getPoPSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getOAuth2SecurityScheme()
		 * @generated
		 */
		EClass OAUTH2_SECURITY_SCHEME = eINSTANCE.getOAuth2SecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getOAuth2SecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__TOKEN = eINSTANCE.getOAuth2SecurityScheme_Token();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__REFRESH = eINSTANCE.getOAuth2SecurityScheme_Refresh();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__SCOPES = eINSTANCE.getOAuth2SecurityScheme_Scopes();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__FLOW = eINSTANCE.getOAuth2SecurityScheme_Flow();

		/**
		 * The meta object literal for the '<em>Any Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAnyType()
		 * @generated
		 */
		EDataType ANY_TYPE = eINSTANCE.getAnyType();

	}

} //TdPackage
