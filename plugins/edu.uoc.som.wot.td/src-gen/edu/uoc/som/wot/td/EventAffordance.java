/**
 */
package edu.uoc.som.wot.td;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.EventAffordance#getData <em>Data</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.EventAffordance#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.EventAffordance#getCancellation <em>Cancellation</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.wot.td.TdPackage#getEventAffordance()
 * @model
 * @generated
 */
public interface EventAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getEventAffordance_Data()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getData();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.EventAffordance#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getEventAffordance_Subscription()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getSubscription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.EventAffordance#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancellation</em>' containment reference.
	 * @see #setCancellation(DataSchema)
	 * @see edu.uoc.som.wot.td.TdPackage#getEventAffordance_Cancellation()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getCancellation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.wot.td.EventAffordance#getCancellation <em>Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation</em>' containment reference.
	 * @see #getCancellation()
	 * @generated
	 */
	void setCancellation(DataSchema value);

} // EventAffordance
