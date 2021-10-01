/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import java.util.Collection;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Product Line Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getGraphTypeTree <em>Graph Type Tree</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareProductLineArchitectureImpl extends MinimalEObjectImpl.Container implements SoftwareProductLineArchitecture {
	/**
	 * The default value of the '{@link #getGraphTypeTree() <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphTypeTree()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GRAPH_TYPE_TREE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getGraphTypeTree() <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphTypeTree()
	 * @generated
	 * @ordered
	 */
	protected Boolean graphTypeTree = GRAPH_TYPE_TREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Feature root;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeElement> composites;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentElement> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareProductLineArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGraphTypeTree() {
		return graphTypeTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphTypeTree(Boolean newGraphTypeTree) {
		Boolean oldGraphTypeTree = graphTypeTree;
		graphTypeTree = newGraphTypeTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE, oldGraphTypeTree, graphTypeTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES, ProductlineadlPackage.FEATURE__OWNING_FEATURE_DIAGRAM);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Feature)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Feature newRoot) {
		Feature oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeElement> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<CompositeElement>(CompositeElement.class, this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentElement> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentElement>(ComponentElement.class, this, ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS);
		}
		return components;
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE:
				return getGraphTypeTree();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				return getFeatures();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
				return getConstraints();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
				return getComposites();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
				return getComponents();
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE:
				setGraphTypeTree((Boolean)newValue);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT:
				setRoot((Feature)newValue);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends CompositeElement>)newValue);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ComponentElement>)newValue);
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE:
				setGraphTypeTree(GRAPH_TYPE_TREE_EDEFAULT);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				getFeatures().clear();
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT:
				setRoot((Feature)null);
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
				getComposites().clear();
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
				getComponents().clear();
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
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE:
				return GRAPH_TYPE_TREE_EDEFAULT == null ? graphTypeTree != null : !GRAPH_TYPE_TREE_EDEFAULT.equals(graphTypeTree);
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
				return features != null && !features.isEmpty();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT:
				return root != null;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
				return components != null && !components.isEmpty();
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
		result.append(" (graphTypeTree: ");
		result.append(graphTypeTree);
		result.append(')');
		return result.toString();
	}

} //SoftwareProductLineArchitectureImpl
