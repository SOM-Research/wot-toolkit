/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.InteractionAffordance;
import edu.uoc.som.wot.td.MultiLanguage;
import edu.uoc.som.wot.td.PropertyAffordance;
import edu.uoc.som.wot.td.TdPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getDtitle <em>Dtitle</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getDdescription <em>Ddescription</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getConst <em>Const</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getDtitles <em>Dtitles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#getDdescriptions <em>Ddescriptions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.PropertyAffordanceImpl#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAffordanceImpl extends InteractionAffordanceImpl implements PropertyAffordance {
	/**
	 * The default value of the '{@link #getDtitle() <em>Dtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String DTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtitle() <em>Dtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtitle()
	 * @generated
	 * @ordered
	 */
	protected String dtitle = DTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdescription() <em>Ddescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdescription() <em>Ddescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdescription()
	 * @generated
	 * @ordered
	 */
	protected String ddescription = DDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected Object const_ = CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> enum_;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean writeOnly = WRITE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSchema> oneOf;

	/**
	 * The cached value of the '{@link #getDtitles() <em>Dtitles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtitles()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage dtitles;

	/**
	 * The cached value of the '{@link #getDdescriptions() <em>Ddescriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdescriptions()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage ddescriptions;

	/**
	 * The default value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected boolean observable = OBSERVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.PROPERTY_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtitle() {
		return dtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtitle(String newDtitle) {
		String oldDtitle = dtitle;
		dtitle = newDtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__DTITLE, oldDtitle,
					dtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdescription() {
		return ddescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdescription(String newDdescription) {
		String oldDdescription = ddescription;
		ddescription = newDdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION,
					oldDdescription, ddescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConst(Object newConst) {
		Object oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__CONST, oldConst,
					const_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<Object>(Object.class, this, TdPackage.PROPERTY_AFFORDANCE__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__READ_ONLY, oldReadOnly,
					readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWriteOnly() {
		return writeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteOnly(boolean newWriteOnly) {
		boolean oldWriteOnly = writeOnly;
		writeOnly = newWriteOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY,
					oldWriteOnly, writeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__FORMAT, oldFormat,
					format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSchema> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectContainmentEList<DataSchema>(DataSchema.class, this,
					TdPackage.PROPERTY_AFFORDANCE__ONE_OF);
		}
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getDtitles() {
		return dtitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDtitles(MultiLanguage newDtitles, NotificationChain msgs) {
		MultiLanguage oldDtitles = dtitles;
		dtitles = newDtitles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.PROPERTY_AFFORDANCE__DTITLES, oldDtitles, newDtitles);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtitles(MultiLanguage newDtitles) {
		if (newDtitles != dtitles) {
			NotificationChain msgs = null;
			if (dtitles != null)
				msgs = ((InternalEObject) dtitles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.PROPERTY_AFFORDANCE__DTITLES, null, msgs);
			if (newDtitles != null)
				msgs = ((InternalEObject) newDtitles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.PROPERTY_AFFORDANCE__DTITLES, null, msgs);
			msgs = basicSetDtitles(newDtitles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__DTITLES, newDtitles,
					newDtitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getDdescriptions() {
		return ddescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdescriptions(MultiLanguage newDdescriptions, NotificationChain msgs) {
		MultiLanguage oldDdescriptions = ddescriptions;
		ddescriptions = newDdescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS, oldDdescriptions, newDdescriptions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdescriptions(MultiLanguage newDdescriptions) {
		if (newDdescriptions != ddescriptions) {
			NotificationChain msgs = null;
			if (ddescriptions != null)
				msgs = ((InternalEObject) ddescriptions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS, null, msgs);
			if (newDdescriptions != null)
				msgs = ((InternalEObject) newDdescriptions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS, null, msgs);
			msgs = basicSetDdescriptions(newDdescriptions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS,
					newDdescriptions, newDdescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservable(boolean newObservable) {
		boolean oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE,
					oldObservable, observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return this.dtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String title) {
		this.dtitle = title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return this.ddescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(final String description) {
		this.ddescription = description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getTitles() {
		return this.dtitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitles(final MultiLanguage titles) {
		this.dtitles = titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLanguage getDescriptions() {
		return this.ddescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptions(final MultiLanguage descriptions) {
		this.ddescriptions = descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
			return ((InternalEList<?>) getOneOf()).basicRemove(otherEnd, msgs);
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
			return basicSetDtitles(null, msgs);
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
			return basicSetDdescriptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
			return getDtitle();
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
			return getDdescription();
		case TdPackage.PROPERTY_AFFORDANCE__TYPE:
			return getType();
		case TdPackage.PROPERTY_AFFORDANCE__CONST:
			return getConst();
		case TdPackage.PROPERTY_AFFORDANCE__UNIT:
			return getUnit();
		case TdPackage.PROPERTY_AFFORDANCE__ENUM:
			return getEnum();
		case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
			return isReadOnly();
		case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
			return isWriteOnly();
		case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
			return getFormat();
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
			return getOneOf();
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
			return getDtitles();
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
			return getDdescriptions();
		case TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
			return isObservable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
			setDtitle((String) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
			setDdescription((String) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__TYPE:
			setType((String) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__CONST:
			setConst(newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__UNIT:
			setUnit((String) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__ENUM:
			getEnum().clear();
			getEnum().addAll((Collection<? extends Object>) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
			setReadOnly((Boolean) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
			setWriteOnly((Boolean) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
			setFormat((String) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
			getOneOf().clear();
			getOneOf().addAll((Collection<? extends DataSchema>) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
			setDtitles((MultiLanguage) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
			setDdescriptions((MultiLanguage) newValue);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
			setObservable((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
			setDtitle(DTITLE_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
			setDdescription(DDESCRIPTION_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__CONST:
			setConst(CONST_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__ENUM:
			getEnum().clear();
			return;
		case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
			setReadOnly(READ_ONLY_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
			setWriteOnly(WRITE_ONLY_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
			setFormat(FORMAT_EDEFAULT);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
			getOneOf().clear();
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
			setDtitles((MultiLanguage) null);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
			setDdescriptions((MultiLanguage) null);
			return;
		case TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
			setObservable(OBSERVABLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
			return DTITLE_EDEFAULT == null ? dtitle != null : !DTITLE_EDEFAULT.equals(dtitle);
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
			return DDESCRIPTION_EDEFAULT == null ? ddescription != null : !DDESCRIPTION_EDEFAULT.equals(ddescription);
		case TdPackage.PROPERTY_AFFORDANCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case TdPackage.PROPERTY_AFFORDANCE__CONST:
			return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
		case TdPackage.PROPERTY_AFFORDANCE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case TdPackage.PROPERTY_AFFORDANCE__ENUM:
			return enum_ != null && !enum_.isEmpty();
		case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
			return readOnly != READ_ONLY_EDEFAULT;
		case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
			return writeOnly != WRITE_ONLY_EDEFAULT;
		case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
			return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
			return oneOf != null && !oneOf.isEmpty();
		case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
			return dtitles != null;
		case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
			return ddescriptions != null;
		case TdPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
			return observable != OBSERVABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataSchema.class) {
			switch (derivedFeatureID) {
			case TdPackage.PROPERTY_AFFORDANCE__DTITLE:
				return TdPackage.DATA_SCHEMA__DTITLE;
			case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION:
				return TdPackage.DATA_SCHEMA__DDESCRIPTION;
			case TdPackage.PROPERTY_AFFORDANCE__TYPE:
				return TdPackage.DATA_SCHEMA__TYPE;
			case TdPackage.PROPERTY_AFFORDANCE__CONST:
				return TdPackage.DATA_SCHEMA__CONST;
			case TdPackage.PROPERTY_AFFORDANCE__UNIT:
				return TdPackage.DATA_SCHEMA__UNIT;
			case TdPackage.PROPERTY_AFFORDANCE__ENUM:
				return TdPackage.DATA_SCHEMA__ENUM;
			case TdPackage.PROPERTY_AFFORDANCE__READ_ONLY:
				return TdPackage.DATA_SCHEMA__READ_ONLY;
			case TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
				return TdPackage.DATA_SCHEMA__WRITE_ONLY;
			case TdPackage.PROPERTY_AFFORDANCE__FORMAT:
				return TdPackage.DATA_SCHEMA__FORMAT;
			case TdPackage.PROPERTY_AFFORDANCE__ONE_OF:
				return TdPackage.DATA_SCHEMA__ONE_OF;
			case TdPackage.PROPERTY_AFFORDANCE__DTITLES:
				return TdPackage.DATA_SCHEMA__DTITLES;
			case TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS:
				return TdPackage.DATA_SCHEMA__DDESCRIPTIONS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataSchema.class) {
			switch (baseFeatureID) {
			case TdPackage.DATA_SCHEMA__DTITLE:
				return TdPackage.PROPERTY_AFFORDANCE__DTITLE;
			case TdPackage.DATA_SCHEMA__DDESCRIPTION:
				return TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTION;
			case TdPackage.DATA_SCHEMA__TYPE:
				return TdPackage.PROPERTY_AFFORDANCE__TYPE;
			case TdPackage.DATA_SCHEMA__CONST:
				return TdPackage.PROPERTY_AFFORDANCE__CONST;
			case TdPackage.DATA_SCHEMA__UNIT:
				return TdPackage.PROPERTY_AFFORDANCE__UNIT;
			case TdPackage.DATA_SCHEMA__ENUM:
				return TdPackage.PROPERTY_AFFORDANCE__ENUM;
			case TdPackage.DATA_SCHEMA__READ_ONLY:
				return TdPackage.PROPERTY_AFFORDANCE__READ_ONLY;
			case TdPackage.DATA_SCHEMA__WRITE_ONLY:
				return TdPackage.PROPERTY_AFFORDANCE__WRITE_ONLY;
			case TdPackage.DATA_SCHEMA__FORMAT:
				return TdPackage.PROPERTY_AFFORDANCE__FORMAT;
			case TdPackage.DATA_SCHEMA__ONE_OF:
				return TdPackage.PROPERTY_AFFORDANCE__ONE_OF;
			case TdPackage.DATA_SCHEMA__DTITLES:
				return TdPackage.PROPERTY_AFFORDANCE__DTITLES;
			case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
				return TdPackage.PROPERTY_AFFORDANCE__DDESCRIPTIONS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InteractionAffordance.class) {
			switch (baseOperationID) {
			case TdPackage.INTERACTION_AFFORDANCE___GET_TITLE:
				return TdPackage.PROPERTY_AFFORDANCE___GET_TITLE;
			case TdPackage.INTERACTION_AFFORDANCE___SET_TITLE__STRING:
				return TdPackage.PROPERTY_AFFORDANCE___SET_TITLE__STRING;
			case TdPackage.INTERACTION_AFFORDANCE___GET_DESCRIPTION:
				return TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTION;
			case TdPackage.INTERACTION_AFFORDANCE___SET_DESCRIPTION__STRING:
				return TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTION__STRING;
			case TdPackage.INTERACTION_AFFORDANCE___GET_TITLES:
				return TdPackage.PROPERTY_AFFORDANCE___GET_TITLES;
			case TdPackage.INTERACTION_AFFORDANCE___SET_TITLES__MULTILANGUAGE:
				return TdPackage.PROPERTY_AFFORDANCE___SET_TITLES__MULTILANGUAGE;
			case TdPackage.INTERACTION_AFFORDANCE___GET_DESCRIPTIONS:
				return TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTIONS;
			case TdPackage.INTERACTION_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE:
				return TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == DataSchema.class) {
			switch (baseOperationID) {
			case TdPackage.DATA_SCHEMA___GET_TITLE:
				return TdPackage.PROPERTY_AFFORDANCE___GET_TITLE;
			case TdPackage.DATA_SCHEMA___SET_TITLE__STRING:
				return TdPackage.PROPERTY_AFFORDANCE___SET_TITLE__STRING;
			case TdPackage.DATA_SCHEMA___GET_DESCRIPTION:
				return TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTION;
			case TdPackage.DATA_SCHEMA___SET_DESCRIPTION__STRING:
				return TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTION__STRING;
			case TdPackage.DATA_SCHEMA___GET_TITLES:
				return TdPackage.PROPERTY_AFFORDANCE___GET_TITLES;
			case TdPackage.DATA_SCHEMA___SET_TITLES__MULTILANGUAGE:
				return TdPackage.PROPERTY_AFFORDANCE___SET_TITLES__MULTILANGUAGE;
			case TdPackage.DATA_SCHEMA___GET_DESCRIPTIONS:
				return TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTIONS;
			case TdPackage.DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE:
				return TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TdPackage.PROPERTY_AFFORDANCE___GET_TITLE:
			return getTitle();
		case TdPackage.PROPERTY_AFFORDANCE___SET_TITLE__STRING:
			setTitle((String) arguments.get(0));
			return null;
		case TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTION:
			return getDescription();
		case TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTION__STRING:
			setDescription((String) arguments.get(0));
			return null;
		case TdPackage.PROPERTY_AFFORDANCE___GET_TITLES:
			return getTitles();
		case TdPackage.PROPERTY_AFFORDANCE___SET_TITLES__MULTILANGUAGE:
			setTitles((MultiLanguage) arguments.get(0));
			return null;
		case TdPackage.PROPERTY_AFFORDANCE___GET_DESCRIPTIONS:
			return getDescriptions();
		case TdPackage.PROPERTY_AFFORDANCE___SET_DESCRIPTIONS__MULTILANGUAGE:
			setDescriptions((MultiLanguage) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dtitle: ");
		result.append(dtitle);
		result.append(", ddescription: ");
		result.append(ddescription);
		result.append(", type: ");
		result.append(type);
		result.append(", const: ");
		result.append(const_);
		result.append(", unit: ");
		result.append(unit);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", writeOnly: ");
		result.append(writeOnly);
		result.append(", format: ");
		result.append(format);
		result.append(", observable: ");
		result.append(observable);
		result.append(')');
		return result.toString();
	}

} //PropertyAffordanceImpl
