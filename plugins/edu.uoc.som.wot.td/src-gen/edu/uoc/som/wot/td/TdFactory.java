/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.wot.td.TdPackage
 * @generated
 */
public interface TdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TdFactory eINSTANCE = edu.uoc.som.wot.td.impl.TdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Interaction Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Pattern</em>'.
	 * @generated
	 */
	InteractionPattern createInteractionPattern();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Scheme</em>'.
	 * @generated
	 */
	SecurityScheme createSecurityScheme();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Schema</em>'.
	 * @generated
	 */
	DataSchema createDataSchema();

	/**
	 * Returns a new object of class '<em>Array Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Schema</em>'.
	 * @generated
	 */
	ArraySchema createArraySchema();

	/**
	 * Returns a new object of class '<em>Number Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Schema</em>'.
	 * @generated
	 */
	NumberSchema createNumberSchema();

	/**
	 * Returns a new object of class '<em>String Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Schema</em>'.
	 * @generated
	 */
	StringSchema createStringSchema();

	/**
	 * Returns a new object of class '<em>Boolean Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Schema</em>'.
	 * @generated
	 */
	BooleanSchema createBooleanSchema();

	/**
	 * Returns a new object of class '<em>Object Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Schema</em>'.
	 * @generated
	 */
	ObjectSchema createObjectSchema();

	/**
	 * Returns a new object of class '<em>Integer Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Schema</em>'.
	 * @generated
	 */
	IntegerSchema createIntegerSchema();

	/**
	 * Returns a new object of class '<em>No Security Cheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Security Cheme</em>'.
	 * @generated
	 */
	NoSecurityCheme createNoSecurityCheme();

	/**
	 * Returns a new object of class '<em>Basic Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Security Scheme</em>'.
	 * @generated
	 */
	BasicSecurityScheme createBasicSecurityScheme();

	/**
	 * Returns a new object of class '<em>OAuth2 Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Security Scheme</em>'.
	 * @generated
	 */
	OAuth2SecurityScheme createOAuth2SecurityScheme();

	/**
	 * Returns a new object of class '<em>Digest Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digest Security Scheme</em>'.
	 * @generated
	 */
	DigestSecurityScheme createDigestSecurityScheme();

	/**
	 * Returns a new object of class '<em>Apikey Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apikey Security Scheme</em>'.
	 * @generated
	 */
	ApikeySecurityScheme createApikeySecurityScheme();

	/**
	 * Returns a new object of class '<em>PSK Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSK Security Scheme</em>'.
	 * @generated
	 */
	PSKSecurityScheme createPSKSecurityScheme();

	/**
	 * Returns a new object of class '<em>Cert Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cert Security Scheme</em>'.
	 * @generated
	 */
	CertSecurityScheme createCertSecurityScheme();

	/**
	 * Returns a new object of class '<em>Public Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Security Scheme</em>'.
	 * @generated
	 */
	PublicSecurityScheme createPublicSecurityScheme();

	/**
	 * Returns a new object of class '<em>Bearer Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bearer Security Scheme</em>'.
	 * @generated
	 */
	BearerSecurityScheme createBearerSecurityScheme();

	/**
	 * Returns a new object of class '<em>Pop Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pop Security Scheme</em>'.
	 * @generated
	 */
	PopSecurityScheme createPopSecurityScheme();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TdPackage getTdPackage();

} //TdFactory
