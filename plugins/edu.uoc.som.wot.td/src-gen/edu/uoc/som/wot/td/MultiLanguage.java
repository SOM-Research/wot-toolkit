/**
 */
package edu.uoc.som.wot.td;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.MultiLanguage#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getMultiLanguage()
 * @model
 * @generated
 */
public interface MultiLanguage extends EObject {
	/**
	 * Returns the value of the '<em><b>Translations</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' map.
	 * @see edu.uoc.som.wot.td.TdPackage#getMultiLanguage_Translations()
	 * @model mapType="edu.uoc.som.wot.td.LanguageToContentMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getTranslations();

} // MultiLanguage
