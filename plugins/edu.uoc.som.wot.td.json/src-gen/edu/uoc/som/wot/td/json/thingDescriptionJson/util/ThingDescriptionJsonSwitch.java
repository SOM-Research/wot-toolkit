/**
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.thingDescriptionJson.util;

import edu.uoc.som.wot.td.json.thingDescriptionJson.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.wot.td.json.thingDescriptionJson.ThingDescriptionJsonPackage
 * @generated
 */
public class ThingDescriptionJsonSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ThingDescriptionJsonPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingDescriptionJsonSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ThingDescriptionJsonPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ThingDescriptionJsonPackage.JSON_THING:
      {
        JsonThing jsonThing = (JsonThing)theEObject;
        T result = caseJsonThing(jsonThing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_VERSION_INFO:
      {
        JsonVersionInfo jsonVersionInfo = (JsonVersionInfo)theEObject;
        T result = caseJsonVersionInfo(jsonVersionInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_SECURITY_SCHEME:
      {
        JsonSecurityScheme jsonSecurityScheme = (JsonSecurityScheme)theEObject;
        T result = caseJsonSecurityScheme(jsonSecurityScheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_PROPERTY_AFFORDANCE:
      {
        JsonPropertyAffordance jsonPropertyAffordance = (JsonPropertyAffordance)theEObject;
        T result = caseJsonPropertyAffordance(jsonPropertyAffordance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_ACTION_AFFORDANCE:
      {
        JsonActionAffordance jsonActionAffordance = (JsonActionAffordance)theEObject;
        T result = caseJsonActionAffordance(jsonActionAffordance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_EVENT_AFFORDANCE:
      {
        JsonEventAffordance jsonEventAffordance = (JsonEventAffordance)theEObject;
        T result = caseJsonEventAffordance(jsonEventAffordance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_DATA_SCHEMA:
      {
        JsonDataSchema jsonDataSchema = (JsonDataSchema)theEObject;
        T result = caseJsonDataSchema(jsonDataSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_LINK:
      {
        JsonLink jsonLink = (JsonLink)theEObject;
        T result = caseJsonLink(jsonLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_FORM:
      {
        JsonForm jsonForm = (JsonForm)theEObject;
        T result = caseJsonForm(jsonForm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_EXPECTED_RESPONSE:
      {
        JsonExpectedResponse jsonExpectedResponse = (JsonExpectedResponse)theEObject;
        T result = caseJsonExpectedResponse(jsonExpectedResponse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ThingDescriptionJsonPackage.JSON_MULTI_LANGUAGE_ENTRY:
      {
        JsonMultiLanguageEntry jsonMultiLanguageEntry = (JsonMultiLanguageEntry)theEObject;
        T result = caseJsonMultiLanguageEntry(jsonMultiLanguageEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Thing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Thing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonThing(JsonThing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Version Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Version Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonVersionInfo(JsonVersionInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Security Scheme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Security Scheme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonSecurityScheme(JsonSecurityScheme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Property Affordance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Property Affordance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonPropertyAffordance(JsonPropertyAffordance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Action Affordance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Action Affordance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonActionAffordance(JsonActionAffordance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Event Affordance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Event Affordance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonEventAffordance(JsonEventAffordance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Data Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Data Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonDataSchema(JsonDataSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonLink(JsonLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonForm(JsonForm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Expected Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Expected Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonExpectedResponse(JsonExpectedResponse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Multi Language Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Multi Language Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonMultiLanguageEntry(JsonMultiLanguageEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ThingDescriptionJsonSwitch
