/**
 */
package edu.uoc.som.wot.td.impl;

import edu.uoc.som.wot.td.DataSchema;
import edu.uoc.som.wot.td.MultiLanguage;
import edu.uoc.som.wot.td.TdPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getDtitle <em>Dtitle</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getDdescription <em>Ddescription</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getConst <em>Const</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getDtitles <em>Dtitles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.impl.DataSchemaImpl#getDdescriptions <em>Ddescriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSchemaImpl extends MinimalEObjectImpl.Container implements DataSchema {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TdPackage.Literals.DATA_SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__DTITLE, oldDtitle, dtitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__DDESCRIPTION, oldDdescription,
					ddescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__CONST, oldConst, const_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<Object>(Object.class, this, TdPackage.DATA_SCHEMA__ENUM);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__READ_ONLY, oldReadOnly,
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__WRITE_ONLY, oldWriteOnly,
					writeOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSchema> getOneOf() {
		if (oneOf == null) {
			oneOf = new EObjectContainmentEList<DataSchema>(DataSchema.class, this, TdPackage.DATA_SCHEMA__ONE_OF);
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
					TdPackage.DATA_SCHEMA__DTITLES, oldDtitles, newDtitles);
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
						EOPPOSITE_FEATURE_BASE - TdPackage.DATA_SCHEMA__DTITLES, null, msgs);
			if (newDtitles != null)
				msgs = ((InternalEObject) newDtitles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.DATA_SCHEMA__DTITLES, null, msgs);
			msgs = basicSetDtitles(newDtitles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__DTITLES, newDtitles,
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
					TdPackage.DATA_SCHEMA__DDESCRIPTIONS, oldDdescriptions, newDdescriptions);
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
						EOPPOSITE_FEATURE_BASE - TdPackage.DATA_SCHEMA__DDESCRIPTIONS, null, msgs);
			if (newDdescriptions != null)
				msgs = ((InternalEObject) newDdescriptions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TdPackage.DATA_SCHEMA__DDESCRIPTIONS, null, msgs);
			msgs = basicSetDdescriptions(newDdescriptions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TdPackage.DATA_SCHEMA__DDESCRIPTIONS,
					newDdescriptions, newDdescriptions));
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
		case TdPackage.DATA_SCHEMA__ONE_OF:
			return ((InternalEList<?>) getOneOf()).basicRemove(otherEnd, msgs);
		case TdPackage.DATA_SCHEMA__DTITLES:
			return basicSetDtitles(null, msgs);
		case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
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
		case TdPackage.DATA_SCHEMA__DTITLE:
			return getDtitle();
		case TdPackage.DATA_SCHEMA__DDESCRIPTION:
			return getDdescription();
		case TdPackage.DATA_SCHEMA__TYPE:
			return getType();
		case TdPackage.DATA_SCHEMA__CONST:
			return getConst();
		case TdPackage.DATA_SCHEMA__UNIT:
			return getUnit();
		case TdPackage.DATA_SCHEMA__ENUM:
			return getEnum();
		case TdPackage.DATA_SCHEMA__READ_ONLY:
			return isReadOnly();
		case TdPackage.DATA_SCHEMA__WRITE_ONLY:
			return isWriteOnly();
		case TdPackage.DATA_SCHEMA__FORMAT:
			return getFormat();
		case TdPackage.DATA_SCHEMA__ONE_OF:
			return getOneOf();
		case TdPackage.DATA_SCHEMA__DTITLES:
			return getDtitles();
		case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
			return getDdescriptions();
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
		case TdPackage.DATA_SCHEMA__DTITLE:
			setDtitle((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__DDESCRIPTION:
			setDdescription((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__TYPE:
			setType((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__CONST:
			setConst(newValue);
			return;
		case TdPackage.DATA_SCHEMA__UNIT:
			setUnit((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__ENUM:
			getEnum().clear();
			getEnum().addAll((Collection<? extends Object>) newValue);
			return;
		case TdPackage.DATA_SCHEMA__READ_ONLY:
			setReadOnly((Boolean) newValue);
			return;
		case TdPackage.DATA_SCHEMA__WRITE_ONLY:
			setWriteOnly((Boolean) newValue);
			return;
		case TdPackage.DATA_SCHEMA__FORMAT:
			setFormat((String) newValue);
			return;
		case TdPackage.DATA_SCHEMA__ONE_OF:
			getOneOf().clear();
			getOneOf().addAll((Collection<? extends DataSchema>) newValue);
			return;
		case TdPackage.DATA_SCHEMA__DTITLES:
			setDtitles((MultiLanguage) newValue);
			return;
		case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
			setDdescriptions((MultiLanguage) newValue);
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
		case TdPackage.DATA_SCHEMA__DTITLE:
			setDtitle(DTITLE_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__DDESCRIPTION:
			setDdescription(DDESCRIPTION_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__CONST:
			setConst(CONST_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__ENUM:
			getEnum().clear();
			return;
		case TdPackage.DATA_SCHEMA__READ_ONLY:
			setReadOnly(READ_ONLY_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__WRITE_ONLY:
			setWriteOnly(WRITE_ONLY_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__FORMAT:
			setFormat(FORMAT_EDEFAULT);
			return;
		case TdPackage.DATA_SCHEMA__ONE_OF:
			getOneOf().clear();
			return;
		case TdPackage.DATA_SCHEMA__DTITLES:
			setDtitles((MultiLanguage) null);
			return;
		case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
			setDdescriptions((MultiLanguage) null);
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
		case TdPackage.DATA_SCHEMA__DTITLE:
			return DTITLE_EDEFAULT == null ? dtitle != null : !DTITLE_EDEFAULT.equals(dtitle);
		case TdPackage.DATA_SCHEMA__DDESCRIPTION:
			return DDESCRIPTION_EDEFAULT == null ? ddescription != null : !DDESCRIPTION_EDEFAULT.equals(ddescription);
		case TdPackage.DATA_SCHEMA__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case TdPackage.DATA_SCHEMA__CONST:
			return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
		case TdPackage.DATA_SCHEMA__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case TdPackage.DATA_SCHEMA__ENUM:
			return enum_ != null && !enum_.isEmpty();
		case TdPackage.DATA_SCHEMA__READ_ONLY:
			return readOnly != READ_ONLY_EDEFAULT;
		case TdPackage.DATA_SCHEMA__WRITE_ONLY:
			return writeOnly != WRITE_ONLY_EDEFAULT;
		case TdPackage.DATA_SCHEMA__FORMAT:
			return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
		case TdPackage.DATA_SCHEMA__ONE_OF:
			return oneOf != null && !oneOf.isEmpty();
		case TdPackage.DATA_SCHEMA__DTITLES:
			return dtitles != null;
		case TdPackage.DATA_SCHEMA__DDESCRIPTIONS:
			return ddescriptions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TdPackage.DATA_SCHEMA___GET_TITLE:
			return getTitle();
		case TdPackage.DATA_SCHEMA___SET_TITLE__STRING:
			setTitle((String) arguments.get(0));
			return null;
		case TdPackage.DATA_SCHEMA___GET_DESCRIPTION:
			return getDescription();
		case TdPackage.DATA_SCHEMA___SET_DESCRIPTION__STRING:
			setDescription((String) arguments.get(0));
			return null;
		case TdPackage.DATA_SCHEMA___GET_TITLES:
			return getTitles();
		case TdPackage.DATA_SCHEMA___SET_TITLES__MULTILANGUAGE:
			setTitles((MultiLanguage) arguments.get(0));
			return null;
		case TdPackage.DATA_SCHEMA___GET_DESCRIPTIONS:
			return getDescriptions();
		case TdPackage.DATA_SCHEMA___SET_DESCRIPTIONS__MULTILANGUAGE:
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
		result.append(')');
		return result.toString();
	}

} //DataSchemaImpl
