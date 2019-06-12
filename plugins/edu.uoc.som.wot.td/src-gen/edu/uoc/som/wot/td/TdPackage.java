/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BASE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SUPPORT = 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SECURITY = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LINKS = 7;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EVENTS = 8;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ACTIONS = 9;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl <em>Interaction Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.InteractionPatternImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getInteractionPattern()
	 * @generated
	 */
	int INTERACTION_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN__SCOPES = 1;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN__SECURITY = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN__FORMS = 3;

	/**
	 * The number of structural features of the '<em>Interaction Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interaction Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PropertyImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LABEL = INTERACTION_PATTERN__LABEL;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCOPES = INTERACTION_PATTERN__SCOPES;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SECURITY = INTERACTION_PATTERN__SECURITY;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FORMS = INTERACTION_PATTERN__FORMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = INTERACTION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = INTERACTION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONST = INTERACTION_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ENUM = INTERACTION_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__WRITABLE = INTERACTION_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OBSERVABLE = INTERACTION_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = INTERACTION_PATTERN_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = INTERACTION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ActionImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = INTERACTION_PATTERN__LABEL;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCOPES = INTERACTION_PATTERN__SCOPES;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SECURITY = INTERACTION_PATTERN__SECURITY;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FORMS = INTERACTION_PATTERN__FORMS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUT = INTERACTION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUT = INTERACTION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = INTERACTION_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = INTERACTION_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = INTERACTION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.EventImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LABEL = INTERACTION_PATTERN__LABEL;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SCOPES = INTERACTION_PATTERN__SCOPES;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SECURITY = INTERACTION_PATTERN__SECURITY;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FORMS = INTERACTION_PATTERN__FORMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = INTERACTION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = INTERACTION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONST = INTERACTION_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ENUM = INTERACTION_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INTERACTION_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INTERACTION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.SecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 5;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__PROXY_URL = 2;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.LinkImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEDIA_TYPE = 1;

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
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.FormImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 7;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HREF = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__MEDIA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__REL = 2;

	/**
	 * The feature id for the '<em><b>Sub Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUB_PROTOCOL = 3;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SCOPES = 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECURITY = 5;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.DataSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__CONST = 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ENUM = 3;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ArraySchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getArraySchema()
	 * @generated
	 */
	int ARRAY_SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ITEMS = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MIN_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MAX_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.NumberSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNumberSchema()
	 * @generated
	 */
	int NUMBER_SCHEMA = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

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
	 * The number of operations of the '<em>Number Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.StringSchemaImpl <em>String Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.StringSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getStringSchema()
	 * @generated
	 */
	int STRING_SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The number of structural features of the '<em>String Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

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
	int BOOLEAN_SCHEMA = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The number of structural features of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__PROPERTIES = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__REQUIRED = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.IntegerSchemaImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getIntegerSchema()
	 * @generated
	 */
	int INTEGER_SCHEMA = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

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
	 * The number of operations of the '<em>Integer Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.NoSecurityChemeImpl <em>No Security Cheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.NoSecurityChemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNoSecurityCheme()
	 * @generated
	 */
	int NO_SECURITY_CHEME = 15;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_CHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_CHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_CHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The number of structural features of the '<em>No Security Cheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_CHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Security Cheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_CHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.BasicSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBasicSecurityScheme()
	 * @generated
	 */
	int BASIC_SECURITY_SCHEME = 16;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getOAuth2SecurityScheme()
	 * @generated
	 */
	int OAUTH2_SECURITY_SCHEME = 17;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__FLOW = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCOPES = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__TOKEN_URL = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refresh Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__REFRESH_URL = SECURITY_SCHEME_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.DigestSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getDigestSecurityScheme()
	 * @generated
	 */
	int DIGEST_SECURITY_SCHEME = 18;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__QOP = SECURITY_SCHEME_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.ApikeySecuritySchemeImpl <em>Apikey Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.ApikeySecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getApikeySecurityScheme()
	 * @generated
	 */
	int APIKEY_SECURITY_SCHEME = 19;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Apikey Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Apikey Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APIKEY_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PSKSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPSKSecurityScheme()
	 * @generated
	 */
	int PSK_SECURITY_SCHEME = 20;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.CertSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getCertSecurityScheme()
	 * @generated
	 */
	int CERT_SECURITY_SCHEME = 21;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PublicSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPublicSecurityScheme()
	 * @generated
	 */
	int PUBLIC_SECURITY_SCHEME = 22;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBearerSecurityScheme()
	 * @generated
	 */
	int BEARER_SECURITY_SCHEME = 23;

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
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__AUTHORIZATION_URL = SECURITY_SCHEME_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl <em>Pop Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPopSecurityScheme()
	 * @generated
	 */
	int POP_SECURITY_SCHEME = 24;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__PROXY_URL = SECURITY_SCHEME__PROXY_URL;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__AUTHORIZATION_URL = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pop Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pop Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Any URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAnyURI()
	 * @generated
	 */
	int ANY_URI = 25;

	/**
	 * The meta object id for the '<em>Any Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 26;

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Thing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getName()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Name();

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
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.Thing#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see edu.uoc.som.wot.td.Thing#getSecurity()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Security();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.uoc.som.wot.td.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Property#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see edu.uoc.som.wot.td.Property#isWritable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Writable();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Property#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see edu.uoc.som.wot.td.Property#isObservable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Observable();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.InteractionPattern <em>Interaction Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Pattern</em>'.
	 * @see edu.uoc.som.wot.td.InteractionPattern
	 * @generated
	 */
	EClass getInteractionPattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.InteractionPattern#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.uoc.som.wot.td.InteractionPattern#getLabel()
	 * @see #getInteractionPattern()
	 * @generated
	 */
	EAttribute getInteractionPattern_Label();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.wot.td.InteractionPattern#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scopes</em>'.
	 * @see edu.uoc.som.wot.td.InteractionPattern#getScopes()
	 * @see #getInteractionPattern()
	 * @generated
	 */
	EAttribute getInteractionPattern_Scopes();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.wot.td.InteractionPattern#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security</em>'.
	 * @see edu.uoc.som.wot.td.InteractionPattern#getSecurity()
	 * @see #getInteractionPattern()
	 * @generated
	 */
	EReference getInteractionPattern_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.wot.td.InteractionPattern#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see edu.uoc.som.wot.td.InteractionPattern#getForms()
	 * @see #getInteractionPattern()
	 * @generated
	 */
	EReference getInteractionPattern_Forms();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see edu.uoc.som.wot.td.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.wot.td.Action#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see edu.uoc.som.wot.td.Action#getInput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Input();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.wot.td.Action#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see edu.uoc.som.wot.td.Action#getOutput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Output();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.wot.td.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see edu.uoc.som.wot.td.Event
	 * @generated
	 */
	EClass getEvent();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.SecurityScheme#getProxyUrl <em>Proxy Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Url</em>'.
	 * @see edu.uoc.som.wot.td.SecurityScheme#getProxyUrl()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_ProxyUrl();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see edu.uoc.som.wot.td.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Link#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see edu.uoc.som.wot.td.Link#getMediaType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_MediaType();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see edu.uoc.som.wot.td.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see edu.uoc.som.wot.td.Form#getHref()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Href();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see edu.uoc.som.wot.td.Form#getMediaType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.Form#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see edu.uoc.som.wot.td.Form#getRel()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Rel();

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
	 * Returns the meta object for the reference list '{@link edu.uoc.som.wot.td.Form#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security</em>'.
	 * @see edu.uoc.som.wot.td.Form#getSecurity()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Security();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getDescription()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Description();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.DataSchema#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see edu.uoc.som.wot.td.DataSchema#getEnum()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Enum();

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
	 * Returns the meta object for the reference '{@link edu.uoc.som.wot.td.ArraySchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Items</em>'.
	 * @see edu.uoc.som.wot.td.ArraySchema#getItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EReference getArraySchema_Items();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Schema</em>'.
	 * @see edu.uoc.som.wot.td.ObjectSchema
	 * @generated
	 */
	EClass getObjectSchema();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.wot.td.ObjectSchema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see edu.uoc.som.wot.td.ObjectSchema#getProperties()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EReference getObjectSchema_Properties();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.NoSecurityCheme <em>No Security Cheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Security Cheme</em>'.
	 * @see edu.uoc.som.wot.td.NoSecurityCheme
	 * @generated
	 */
	EClass getNoSecurityCheme();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme
	 * @generated
	 */
	EClass getOAuth2SecurityScheme();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getTokenUrl()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_TokenUrl();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getAuthorizationUrl()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefreshUrl <em>Refresh Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Url</em>'.
	 * @see edu.uoc.som.wot.td.OAuth2SecurityScheme#getRefreshUrl()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_RefreshUrl();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.ApikeySecurityScheme <em>Apikey Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apikey Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.ApikeySecurityScheme
	 * @generated
	 */
	EClass getApikeySecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ApikeySecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.ApikeySecurityScheme#getIn()
	 * @see #getApikeySecurityScheme()
	 * @generated
	 */
	EAttribute getApikeySecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.ApikeySecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.ApikeySecurityScheme#getName()
	 * @see #getApikeySecurityScheme()
	 * @generated
	 */
	EAttribute getApikeySecurityScheme_Name();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearer Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme
	 * @generated
	 */
	EClass getBearerSecurityScheme();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see edu.uoc.som.wot.td.BearerSecurityScheme#getAuthorizationUrl()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_AuthorizationUrl();

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
	 * Returns the meta object for class '{@link edu.uoc.som.wot.td.PopSecurityScheme <em>Pop Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop Security Scheme</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme
	 * @generated
	 */
	EClass getPopSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PopSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme#getFormat()
	 * @see #getPopSecurityScheme()
	 * @generated
	 */
	EAttribute getPopSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PopSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme#getAlg()
	 * @see #getPopSecurityScheme()
	 * @generated
	 */
	EAttribute getPopSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PopSecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme#getAuthorizationUrl()
	 * @see #getPopSecurityScheme()
	 * @generated
	 */
	EAttribute getPopSecurityScheme_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PopSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme#getIn()
	 * @see #getPopSecurityScheme()
	 * @generated
	 */
	EAttribute getPopSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.wot.td.PopSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.wot.td.PopSecurityScheme#getName()
	 * @see #getPopSecurityScheme()
	 * @generated
	 */
	EAttribute getPopSecurityScheme_Name();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getAnyURI();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__NAME = eINSTANCE.getThing_Name();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__BASE = eINSTANCE.getThing_Base();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__ID = eINSTANCE.getThing_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__DESCRIPTION = eINSTANCE.getThing_Description();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SUPPORT = eINSTANCE.getThing_Support();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__SECURITY = eINSTANCE.getThing_Security();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__LINKS = eINSTANCE.getThing_Links();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EVENTS = eINSTANCE.getThing_Events();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ACTIONS = eINSTANCE.getThing_Actions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PropertyImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__WRITABLE = eINSTANCE.getProperty_Writable();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__OBSERVABLE = eINSTANCE.getProperty_Observable();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.InteractionPatternImpl <em>Interaction Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.InteractionPatternImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getInteractionPattern()
		 * @generated
		 */
		EClass INTERACTION_PATTERN = eINSTANCE.getInteractionPattern();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_PATTERN__LABEL = eINSTANCE.getInteractionPattern_Label();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_PATTERN__SCOPES = eINSTANCE.getInteractionPattern_Scopes();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_PATTERN__SECURITY = eINSTANCE.getInteractionPattern_Security();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_PATTERN__FORMS = eINSTANCE.getInteractionPattern_Forms();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ActionImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INPUT = eINSTANCE.getAction_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTPUT = eINSTANCE.getAction_Output();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.EventImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

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
		 * The meta object literal for the '<em><b>Proxy Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__PROXY_URL = eINSTANCE.getSecurityScheme_ProxyUrl();

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
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__MEDIA_TYPE = eINSTANCE.getLink_MediaType();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.FormImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__HREF = eINSTANCE.getForm_Href();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__MEDIA_TYPE = eINSTANCE.getForm_MediaType();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__REL = eINSTANCE.getForm_Rel();

		/**
		 * The meta object literal for the '<em><b>Sub Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SUB_PROTOCOL = eINSTANCE.getForm_SubProtocol();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SCOPES = eINSTANCE.getForm_Scopes();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__SECURITY = eINSTANCE.getForm_Security();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TYPE = eINSTANCE.getDataSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DESCRIPTION = eINSTANCE.getDataSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__CONST = eINSTANCE.getDataSchema_Const();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__ENUM = eINSTANCE.getDataSchema_Enum();

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
		 * The meta object literal for the '<em><b>Items</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SCHEMA__ITEMS = eINSTANCE.getArraySchema_Items();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ObjectSchemaImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getObjectSchema()
		 * @generated
		 */
		EClass OBJECT_SCHEMA = eINSTANCE.getObjectSchema();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SCHEMA__PROPERTIES = eINSTANCE.getObjectSchema_Properties();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_SCHEMA__REQUIRED = eINSTANCE.getObjectSchema_Required();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.NoSecurityChemeImpl <em>No Security Cheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.NoSecurityChemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getNoSecurityCheme()
		 * @generated
		 */
		EClass NO_SECURITY_CHEME = eINSTANCE.getNoSecurityCheme();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.OAuth2SecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getOAuth2SecurityScheme()
		 * @generated
		 */
		EClass OAUTH2_SECURITY_SCHEME = eINSTANCE.getOAuth2SecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__FLOW = eINSTANCE.getOAuth2SecurityScheme_Flow();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__SCOPES = eINSTANCE.getOAuth2SecurityScheme_Scopes();

		/**
		 * The meta object literal for the '<em><b>Token Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__TOKEN_URL = eINSTANCE.getOAuth2SecurityScheme_TokenUrl();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__AUTHORIZATION_URL = eINSTANCE.getOAuth2SecurityScheme_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>Refresh Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__REFRESH_URL = eINSTANCE.getOAuth2SecurityScheme_RefreshUrl();

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
		 * The meta object literal for the '<em><b>Qop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__QOP = eINSTANCE.getDigestSecurityScheme_Qop();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.ApikeySecuritySchemeImpl <em>Apikey Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.ApikeySecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getApikeySecurityScheme()
		 * @generated
		 */
		EClass APIKEY_SECURITY_SCHEME = eINSTANCE.getApikeySecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APIKEY_SECURITY_SCHEME__IN = eINSTANCE.getApikeySecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APIKEY_SECURITY_SCHEME__NAME = eINSTANCE.getApikeySecurityScheme_Name();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.BearerSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getBearerSecurityScheme()
		 * @generated
		 */
		EClass BEARER_SECURITY_SCHEME = eINSTANCE.getBearerSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__FORMAT = eINSTANCE.getBearerSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__ALG = eINSTANCE.getBearerSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__AUTHORIZATION_URL = eINSTANCE.getBearerSecurityScheme_AuthorizationUrl();

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
		 * The meta object literal for the '{@link edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl <em>Pop Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.wot.td.impl.PopSecuritySchemeImpl
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getPopSecurityScheme()
		 * @generated
		 */
		EClass POP_SECURITY_SCHEME = eINSTANCE.getPopSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_SECURITY_SCHEME__FORMAT = eINSTANCE.getPopSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_SECURITY_SCHEME__ALG = eINSTANCE.getPopSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_SECURITY_SCHEME__AUTHORIZATION_URL = eINSTANCE.getPopSecurityScheme_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_SECURITY_SCHEME__IN = eINSTANCE.getPopSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_SECURITY_SCHEME__NAME = eINSTANCE.getPopSecurityScheme_Name();

		/**
		 * The meta object literal for the '<em>Any URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see edu.uoc.som.wot.td.impl.TdPackageImpl#getAnyURI()
		 * @generated
		 */
		EDataType ANY_URI = eINSTANCE.getAnyURI();

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
