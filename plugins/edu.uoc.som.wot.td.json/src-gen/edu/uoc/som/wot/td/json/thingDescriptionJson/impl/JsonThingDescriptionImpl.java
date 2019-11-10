/**
 * generated by Xtext 2.17.0
 */
package edu.uoc.som.wot.td.json.thingDescriptionJson.impl;

import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonActionAffordance;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonEventAffordance;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonForm;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonLink;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonMultiLanguageEntry;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonPropertyAffordance;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonSecurityScheme;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonThingDescription;
import edu.uoc.som.wot.td.json.thingDescriptionJson.JsonVersionInfo;
import edu.uoc.som.wot.td.json.thingDescriptionJson.ThingDescriptionJsonPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Thing Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getLd_context <em>Ld context</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getLd_type <em>Ld type</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.uoc.som.wot.td.json.thingDescriptionJson.impl.JsonThingDescriptionImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonThingDescriptionImpl extends MinimalEObjectImpl.Container implements JsonThingDescription
{
  /**
   * The cached value of the '{@link #getLd_context() <em>Ld context</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLd_context()
   * @generated
   * @ordered
   */
  protected EList<String> ld_context;

  /**
   * The cached value of the '{@link #getLd_type() <em>Ld type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLd_type()
   * @generated
   * @ordered
   */
  protected EList<String> ld_type;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
  protected static final String CREATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreated()
   * @generated
   * @ordered
   */
  protected String created = CREATED_EDEFAULT;

  /**
   * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
  protected static final String MODIFIED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModified()
   * @generated
   * @ordered
   */
  protected String modified = MODIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getSupport() <em>Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupport()
   * @generated
   * @ordered
   */
  protected static final String SUPPORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSupport() <em>Support</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupport()
   * @generated
   * @ordered
   */
  protected String support = SUPPORT_EDEFAULT;

  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurity()
   * @generated
   * @ordered
   */
  protected EList<String> security;

  /**
   * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForms()
   * @generated
   * @ordered
   */
  protected EList<JsonForm> forms;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<JsonLink> links;

  /**
   * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitles()
   * @generated
   * @ordered
   */
  protected EList<JsonMultiLanguageEntry> titles;

  /**
   * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptions()
   * @generated
   * @ordered
   */
  protected EList<JsonMultiLanguageEntry> descriptions;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected JsonVersionInfo version;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<JsonPropertyAffordance> properties;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<JsonActionAffordance> actions;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<JsonEventAffordance> events;

  /**
   * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityDefinitions()
   * @generated
   * @ordered
   */
  protected EList<JsonSecurityScheme> securityDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonThingDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThingDescriptionJsonPackage.Literals.JSON_THING_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getLd_context()
  {
    if (ld_context == null)
    {
      ld_context = new EDataTypeEList<String>(String.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_CONTEXT);
    }
    return ld_context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getLd_type()
  {
    if (ld_type == null)
    {
      ld_type = new EDataTypeEList<String>(String.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_TYPE);
    }
    return ld_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreated()
  {
    return created;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreated(String newCreated)
  {
    String oldCreated = created;
    created = newCreated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__CREATED, oldCreated, created));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModified()
  {
    return modified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModified(String newModified)
  {
    String oldModified = modified;
    modified = newModified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__MODIFIED, oldModified, modified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSupport()
  {
    return support;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSupport(String newSupport)
  {
    String oldSupport = support;
    support = newSupport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SUPPORT, oldSupport, support));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBase(String newBase)
  {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getSecurity()
  {
    if (security == null)
    {
      security = new EDataTypeEList<String>(String.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY);
    }
    return security;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonForm> getForms()
  {
    if (forms == null)
    {
      forms = new EObjectContainmentEList<JsonForm>(JsonForm.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS);
    }
    return forms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<JsonLink>(JsonLink.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonMultiLanguageEntry> getTitles()
  {
    if (titles == null)
    {
      titles = new EObjectContainmentEList<JsonMultiLanguageEntry>(JsonMultiLanguageEntry.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES);
    }
    return titles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonMultiLanguageEntry> getDescriptions()
  {
    if (descriptions == null)
    {
      descriptions = new EObjectContainmentEList<JsonMultiLanguageEntry>(JsonMultiLanguageEntry.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS);
    }
    return descriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonVersionInfo getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(JsonVersionInfo newVersion, NotificationChain msgs)
  {
    JsonVersionInfo oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(JsonVersionInfo newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonPropertyAffordance> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<JsonPropertyAffordance>(JsonPropertyAffordance.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonActionAffordance> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<JsonActionAffordance>(JsonActionAffordance.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonEventAffordance> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<JsonEventAffordance>(JsonEventAffordance.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JsonSecurityScheme> getSecurityDefinitions()
  {
    if (securityDefinitions == null)
    {
      securityDefinitions = new EObjectContainmentEList<JsonSecurityScheme>(JsonSecurityScheme.class, this, ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS);
    }
    return securityDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS:
        return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES:
        return ((InternalEList<?>)getTitles()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS:
        return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION:
        return basicSetVersion(null, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS:
        return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_CONTEXT:
        return getLd_context();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_TYPE:
        return getLd_type();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ID:
        return getId();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLE:
        return getTitle();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTION:
        return getDescription();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__CREATED:
        return getCreated();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__MODIFIED:
        return getModified();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SUPPORT:
        return getSupport();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__BASE:
        return getBase();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY:
        return getSecurity();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS:
        return getForms();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS:
        return getLinks();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES:
        return getTitles();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS:
        return getDescriptions();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION:
        return getVersion();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES:
        return getProperties();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS:
        return getActions();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS:
        return getEvents();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS:
        return getSecurityDefinitions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_CONTEXT:
        getLd_context().clear();
        getLd_context().addAll((Collection<? extends String>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_TYPE:
        getLd_type().clear();
        getLd_type().addAll((Collection<? extends String>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ID:
        setId((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLE:
        setTitle((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__CREATED:
        setCreated((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__MODIFIED:
        setModified((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SUPPORT:
        setSupport((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__BASE:
        setBase((String)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY:
        getSecurity().clear();
        getSecurity().addAll((Collection<? extends String>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS:
        getForms().clear();
        getForms().addAll((Collection<? extends JsonForm>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends JsonLink>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES:
        getTitles().clear();
        getTitles().addAll((Collection<? extends JsonMultiLanguageEntry>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS:
        getDescriptions().clear();
        getDescriptions().addAll((Collection<? extends JsonMultiLanguageEntry>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION:
        setVersion((JsonVersionInfo)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends JsonPropertyAffordance>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends JsonActionAffordance>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends JsonEventAffordance>)newValue);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS:
        getSecurityDefinitions().clear();
        getSecurityDefinitions().addAll((Collection<? extends JsonSecurityScheme>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_CONTEXT:
        getLd_context().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_TYPE:
        getLd_type().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ID:
        setId(ID_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__CREATED:
        setCreated(CREATED_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__MODIFIED:
        setModified(MODIFIED_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SUPPORT:
        setSupport(SUPPORT_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY:
        getSecurity().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS:
        getForms().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS:
        getLinks().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES:
        getTitles().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS:
        getDescriptions().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION:
        setVersion((JsonVersionInfo)null);
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES:
        getProperties().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS:
        getActions().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS:
        getEvents().clear();
        return;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS:
        getSecurityDefinitions().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_CONTEXT:
        return ld_context != null && !ld_context.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LD_TYPE:
        return ld_type != null && !ld_type.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__CREATED:
        return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__MODIFIED:
        return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SUPPORT:
        return SUPPORT_EDEFAULT == null ? support != null : !SUPPORT_EDEFAULT.equals(support);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY:
        return security != null && !security.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__FORMS:
        return forms != null && !forms.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__LINKS:
        return links != null && !links.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__TITLES:
        return titles != null && !titles.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__DESCRIPTIONS:
        return descriptions != null && !descriptions.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__VERSION:
        return version != null;
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__EVENTS:
        return events != null && !events.isEmpty();
      case ThingDescriptionJsonPackage.JSON_THING_DESCRIPTION__SECURITY_DEFINITIONS:
        return securityDefinitions != null && !securityDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ld_context: ");
    result.append(ld_context);
    result.append(", ld_type: ");
    result.append(ld_type);
    result.append(", id: ");
    result.append(id);
    result.append(", title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(", created: ");
    result.append(created);
    result.append(", modified: ");
    result.append(modified);
    result.append(", support: ");
    result.append(support);
    result.append(", base: ");
    result.append(base);
    result.append(", security: ");
    result.append(security);
    result.append(')');
    return result.toString();
  }

} //JsonThingDescriptionImpl