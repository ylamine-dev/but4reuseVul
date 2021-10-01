/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import java.util.Collection;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getOutgoingEdge <em>Outgoing Edge</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getDetailedModel <em>Detailed Model</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl#getProvidedElements <em>Provided Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingEdge() <em>Outgoing Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoingEdge;

	/**
	 * The cached value of the '{@link #getIncomingEdge() <em>Incoming Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incomingEdge;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeElement> model;

	/**
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELECTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected Boolean selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANDATORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected Boolean mandatory = MANDATORY_EDEFAULT;

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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetailedModel() <em>Detailed Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedModel()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeElement> detailedModel;

	/**
	 * The cached value of the '{@link #getRequiredElements() <em>Required Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredElement> requiredElements;

	/**
	 * The cached value of the '{@link #getProvidedElements() <em>Provided Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedElement> providedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductlineadlPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutgoingEdge() {
		if (outgoingEdge == null) {
			outgoingEdge = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, ProductlineadlPackage.FEATURE__OUTGOING_EDGE, ProductlineadlPackage.EDGE__PARENT);
		}
		return outgoingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getIncomingEdge() {
		if (incomingEdge == null) {
			incomingEdge = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, ProductlineadlPackage.FEATURE__INCOMING_EDGE, ProductlineadlPackage.EDGE__CHILD);
		}
		return incomingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareProductLineArchitecture getOwningFeatureDiagram() {
		if (eContainerFeatureID() != ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM) return null;
		return (SoftwareProductLineArchitecture)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureDiagram(SoftwareProductLineArchitecture newOwningFeatureDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureDiagram, ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeatureDiagram(SoftwareProductLineArchitecture newOwningFeatureDiagram) {
		if (newOwningFeatureDiagram != eInternalContainer() || (eContainerFeatureID() != ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM && newOwningFeatureDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFeatureDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFeatureDiagram != null)
				msgs = ((InternalEObject)newOwningFeatureDiagram).eInverseAdd(this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES, SoftwareProductLineArchitecture.class, msgs);
			msgs = basicSetOwningFeatureDiagram(newOwningFeatureDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM, newOwningFeatureDiagram, newOwningFeatureDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, ProductlineadlPackage.OPERATOR__OWNING_FEATURE, Operator.class, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, ProductlineadlPackage.OPERATOR__OWNING_FEATURE, Operator.class, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeElement> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<CompositeElement>(CompositeElement.class, this, ProductlineadlPackage.FEATURE__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(Boolean newSelected) {
		Boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(Boolean newMandatory) {
		Boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.FEATURE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeElement> getDetailedModel() {
		if (detailedModel == null) {
			detailedModel = new EObjectContainmentEList<CompositeElement>(CompositeElement.class, this, ProductlineadlPackage.FEATURE__DETAILED_MODEL);
		}
		return detailedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredElement> getRequiredElements() {
		if (requiredElements == null) {
			requiredElements = new EObjectContainmentEList<RequiredElement>(RequiredElement.class, this, ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS);
		}
		return requiredElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedElement> getProvidedElements() {
		if (providedElements == null) {
			providedElements = new EObjectContainmentEList<ProvidedElement>(ProvidedElement.class, this, ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS);
		}
		return providedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdge()).basicAdd(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdge()).basicAdd(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureDiagram((SoftwareProductLineArchitecture)otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__OPERATOR:
				if (operator != null)
					msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductlineadlPackage.FEATURE__OPERATOR, null, msgs);
				return basicSetOperator((Operator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				return ((InternalEList<?>)getOutgoingEdge()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				return ((InternalEList<?>)getIncomingEdge()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return basicSetOwningFeatureDiagram(null, msgs);
			case ProductlineadlPackage.FEATURE__OPERATOR:
				return basicSetOperator(null, msgs);
			case ProductlineadlPackage.FEATURE__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
				return ((InternalEList<?>)getDetailedModel()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
				return ((InternalEList<?>)getRequiredElements()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
				return ((InternalEList<?>)getProvidedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES, SoftwareProductLineArchitecture.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductlineadlPackage.FEATURE__ID:
				return getId();
			case ProductlineadlPackage.FEATURE__NAME:
				return getName();
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				return getOutgoingEdge();
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				return getIncomingEdge();
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return getOwningFeatureDiagram();
			case ProductlineadlPackage.FEATURE__OPERATOR:
				return getOperator();
			case ProductlineadlPackage.FEATURE__MODEL:
				return getModel();
			case ProductlineadlPackage.FEATURE__SELECTED:
				return getSelected();
			case ProductlineadlPackage.FEATURE__MANDATORY:
				return getMandatory();
			case ProductlineadlPackage.FEATURE__DESCRIPTION:
				return getDescription();
			case ProductlineadlPackage.FEATURE__ABSTRACT:
				return getAbstract();
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
				return getDetailedModel();
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
				return getRequiredElements();
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
				return getProvidedElements();
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
			case ProductlineadlPackage.FEATURE__ID:
				setId((String)newValue);
				return;
			case ProductlineadlPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				getOutgoingEdge().clear();
				getOutgoingEdge().addAll((Collection<? extends Edge>)newValue);
				return;
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				getIncomingEdge().clear();
				getIncomingEdge().addAll((Collection<? extends Edge>)newValue);
				return;
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				setOwningFeatureDiagram((SoftwareProductLineArchitecture)newValue);
				return;
			case ProductlineadlPackage.FEATURE__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case ProductlineadlPackage.FEATURE__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends CompositeElement>)newValue);
				return;
			case ProductlineadlPackage.FEATURE__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case ProductlineadlPackage.FEATURE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case ProductlineadlPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductlineadlPackage.FEATURE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
				getDetailedModel().clear();
				getDetailedModel().addAll((Collection<? extends CompositeElement>)newValue);
				return;
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
				getRequiredElements().clear();
				getRequiredElements().addAll((Collection<? extends RequiredElement>)newValue);
				return;
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
				getProvidedElements().clear();
				getProvidedElements().addAll((Collection<? extends ProvidedElement>)newValue);
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
			case ProductlineadlPackage.FEATURE__ID:
				setId(ID_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				getOutgoingEdge().clear();
				return;
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				getIncomingEdge().clear();
				return;
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				setOwningFeatureDiagram((SoftwareProductLineArchitecture)null);
				return;
			case ProductlineadlPackage.FEATURE__OPERATOR:
				setOperator((Operator)null);
				return;
			case ProductlineadlPackage.FEATURE__MODEL:
				getModel().clear();
				return;
			case ProductlineadlPackage.FEATURE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
				getDetailedModel().clear();
				return;
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
				getRequiredElements().clear();
				return;
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
				getProvidedElements().clear();
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
			case ProductlineadlPackage.FEATURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProductlineadlPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
				return outgoingEdge != null && !outgoingEdge.isEmpty();
			case ProductlineadlPackage.FEATURE__INCOMING_EDGE:
				return incomingEdge != null && !incomingEdge.isEmpty();
			case ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return getOwningFeatureDiagram() != null;
			case ProductlineadlPackage.FEATURE__OPERATOR:
				return operator != null;
			case ProductlineadlPackage.FEATURE__MODEL:
				return model != null && !model.isEmpty();
			case ProductlineadlPackage.FEATURE__SELECTED:
				return SELECTED_EDEFAULT == null ? selected != null : !SELECTED_EDEFAULT.equals(selected);
			case ProductlineadlPackage.FEATURE__MANDATORY:
				return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
			case ProductlineadlPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductlineadlPackage.FEATURE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
				return detailedModel != null && !detailedModel.isEmpty();
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
				return requiredElements != null && !requiredElements.isEmpty();
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
				return providedElements != null && !providedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", selected: ");
		result.append(selected);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", description: ");
		result.append(description);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
