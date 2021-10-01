/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

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
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory
 * @model kind="package"
 * @generated
 */
public interface ProductlineadlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "productlineadl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.but4reuse.archmodel.synthesis/model/productlineadl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "productlineadl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductlineadlPackage eINSTANCE = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl <em>Software Product Line Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getSoftwareProductLineArchitecture()
	 * @generated
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Graph Type Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES = 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS = 5;

	/**
	 * The number of structural features of the '<em>Software Product Line Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Software Product Line Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PRODUCT_LINE_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OUTGOING_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Incoming Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCOMING_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Owning Feature Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_FEATURE_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MODEL = 6;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SELECTED = 7;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MANDATORY = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ABSTRACT = 10;

	/**
	 * The feature id for the '<em><b>Detailed Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DETAILED_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Required Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_ELEMENTS = 12;

	/**
	 * The feature id for the '<em><b>Provided Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROVIDED_ELEMENTS = 13;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.EdgeImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConstraintImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OperatorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OWNING_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptImpl <em>Opt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOpt()
	 * @generated
	 */
	int OPT = 5;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The number of structural features of the '<em>Opt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.AndImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 6;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OrImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOr()
	 * @generated
	 */
	int OR = 7;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.XorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 8;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequireImpl <em>Require</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequireImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequire()
	 * @generated
	 */
	int REQUIRE = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__TEXT = CONSTRAINT__TEXT;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MutexImpl <em>Mutex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MutexImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getMutex()
	 * @generated
	 */
	int MUTEX = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX__TEXT = CONSTRAINT__TEXT;

	/**
	 * The number of structural features of the '<em>Mutex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mutex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositeElementImpl <em>Composite Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositeElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getCompositeElement()
	 * @generated
	 */
	int COMPOSITE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT__CONNECTORS = 2;

	/**
	 * The number of structural features of the '<em>Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Composite Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl <em>Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getComponentElement()
	 * @generated
	 */
	int COMPONENT_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Required Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__REQUIRED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Provided Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__PROVIDED_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl <em>Plugin Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getPluginElement()
	 * @generated
	 */
	int PLUGIN_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Required Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__REQUIRED_ELEMENTS = COMPONENT_ELEMENT__REQUIRED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Provided Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__PROVIDED_ELEMENTS = COMPONENT_ELEMENT__PROVIDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__NAME = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugin Symb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__PLUGIN_SYMB_NAME = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__IMPORT_PACKAGES = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Export packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__EXPORT_PACKAGES = COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__REGISTERED_SERVICES = COMPONENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumed Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__CONSUMED_SERVICES = COMPONENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__REQUIRED_INTERFACES = COMPONENT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__PROVIDED_INTERFACES = COMPONENT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__EXTENSION_POINTS = COMPONENT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__EXTENSIONS = COMPONENT_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Plugin Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT__PLUGIN_VERSION = COMPONENT_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Plugin Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Plugin Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_ELEMENT_OPERATION_COUNT = COMPONENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedElementImpl <em>Provided Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getProvidedElement()
	 * @generated
	 */
	int PROVIDED_ELEMENT = 20;

	/**
	 * The number of structural features of the '<em>Provided Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provided Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedInterfaceElementImpl <em>Provided Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedInterfaceElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getProvidedInterfaceElement()
	 * @generated
	 */
	int PROVIDED_INTERFACE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ELEMENT__INTERFACE_NAME = PROVIDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ELEMENT__OPERATIONS = PROVIDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ELEMENT_FEATURE_COUNT = PROVIDED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_ELEMENT_OPERATION_COUNT = PROVIDED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredElementImpl <em>Required Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequiredElement()
	 * @generated
	 */
	int REQUIRED_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>Required Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Required Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConsumedServiceElementImpl <em>Consumed Service Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConsumedServiceElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConsumedServiceElement()
	 * @generated
	 */
	int CONSUMED_SERVICE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Obj Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMED_SERVICE_ELEMENT__OBJ_NAME = REQUIRED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMED_SERVICE_ELEMENT__INTERFACE_NAME = REQUIRED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumed Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMED_SERVICE_ELEMENT_FEATURE_COUNT = REQUIRED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Consumed Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMED_SERVICE_ELEMENT_OPERATION_COUNT = REQUIRED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionElementImpl <em>Extension Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionElement()
	 * @generated
	 */
	int EXTENSION_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT__POINT = REQUIRED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT__CLASS_NAME = REQUIRED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT_FEATURE_COUNT = REQUIRED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT_OPERATION_COUNT = REQUIRED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionPointElementImpl <em>Extension Point Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionPointElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionPointElement()
	 * @generated
	 */
	int EXTENSION_POINT_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_ELEMENT__ID = PROVIDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_ELEMENT__NAME = PROVIDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_ELEMENT__SCHEMA = PROVIDED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_ELEMENT_FEATURE_COUNT = PROVIDED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Extension Point Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_ELEMENT_OPERATION_COUNT = PROVIDED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ImportedPackageElementImpl <em>Imported Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ImportedPackageElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getImportedPackageElement()
	 * @generated
	 */
	int IMPORTED_PACKAGE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_ELEMENT__NAME = REQUIRED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_ELEMENT_FEATURE_COUNT = REQUIRED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_ELEMENT_OPERATION_COUNT = REQUIRED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConnectorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RegisteredServiceElementImpl <em>Registered Service Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RegisteredServiceElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRegisteredServiceElement()
	 * @generated
	 */
	int REGISTERED_SERVICE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Obj Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_SERVICE_ELEMENT__OBJ_NAME = PROVIDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_SERVICE_ELEMENT__INTERFACE_NAME = PROVIDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Registered Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_SERVICE_ELEMENT_FEATURE_COUNT = PROVIDED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Registered Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_SERVICE_ELEMENT_OPERATION_COUNT = PROVIDED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredInterfaceElementImpl <em>Required Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredInterfaceElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequiredInterfaceElement()
	 * @generated
	 */
	int REQUIRED_INTERFACE_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_ELEMENT__INTERFACE_NAME = REQUIRED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_ELEMENT__OPERATIONS = REQUIRED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_ELEMENT_FEATURE_COUNT = REQUIRED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Required Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_ELEMENT_OPERATION_COUNT = REQUIRED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExportedPackageElementImpl <em>Exported Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExportedPackageElementImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExportedPackageElement()
	 * @generated
	 */
	int EXPORTED_PACKAGE_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_ELEMENT__NAME = PROVIDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exported Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_ELEMENT_FEATURE_COUNT = PROVIDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exported Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_ELEMENT_OPERATION_COUNT = PROVIDED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionConnectorImpl <em>Extension Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionConnectorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionConnector()
	 * @generated
	 */
	int EXTENSION_CONNECTOR = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONNECTOR__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.InterfaceConnectorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ServiceConnectorImpl <em>Service Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ServiceConnectorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getServiceConnector()
	 * @generated
	 */
	int SERVICE_CONNECTOR = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PackageConnectorImpl <em>Package Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PackageConnectorImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getPackageConnector()
	 * @generated
	 */
	int PACKAGE_CONNECTOR = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONNECTOR__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONNECTOR__SOURCE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONNECTOR__TARGET = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MandatoryImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__PARENT = EDGE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CHILD = EDGE__CHILD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VALUE = EDGE__VALUE;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptionalImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__PARENT = EDGE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CHILD = EDGE__CHILD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__VALUE = EDGE__VALUE;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositionImpl
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__PARENT = EDGE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CHILD = EDGE__CHILD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__VALUE = EDGE__VALUE;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 32;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getString()
	 * @generated
	 */
	int STRING = 33;


	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture <em>Software Product Line Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Product Line Architecture</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture
	 * @generated
	 */
	EClass getSoftwareProductLineArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getGraphTypeTree <em>Graph Type Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Type Tree</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getGraphTypeTree()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EAttribute getSoftwareProductLineArchitecture_GraphTypeTree();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getFeatures()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EReference getSoftwareProductLineArchitecture_Features();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getRoot()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EReference getSoftwareProductLineArchitecture_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getConstraints()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EReference getSoftwareProductLineArchitecture_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComposites()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EReference getSoftwareProductLineArchitecture_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComponents()
	 * @see #getSoftwareProductLineArchitecture()
	 * @generated
	 */
	EReference getSoftwareProductLineArchitecture_Components();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOutgoingEdge <em>Outgoing Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Edge</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOutgoingEdge()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OutgoingEdge();

	/**
	 * Returns the meta object for the reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getIncomingEdge <em>Incoming Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edge</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getIncomingEdge()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncomingEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature Diagram</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningFeatureDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getModel()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getSelected()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getAbstract()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDetailedModel <em>Detailed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detailed Model</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDetailedModel()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_DetailedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getRequiredElements <em>Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Elements</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getRequiredElements()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getProvidedElements <em>Provided Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Elements</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getProvidedElements()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ProvidedElements();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getParent()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getChild()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Child();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getValue()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Value();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getSource()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getText()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Text();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the container reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OwningFeature();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt
	 * @generated
	 */
	EClass getOpt();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require
	 * @generated
	 */
	EClass getRequire();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutex</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex
	 * @generated
	 */
	EClass getMutex();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement
	 * @generated
	 */
	EClass getCompositeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getComponents()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Components();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getName()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EAttribute getCompositeElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement#getConnectors()
	 * @see #getCompositeElement()
	 * @generated
	 */
	EReference getCompositeElement_Connectors();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement <em>Plugin Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement
	 * @generated
	 */
	EClass getPluginElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getName()
	 * @see #getPluginElement()
	 * @generated
	 */
	EAttribute getPluginElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginSymbName <em>Plugin Symb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Symb Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginSymbName()
	 * @see #getPluginElement()
	 * @generated
	 */
	EAttribute getPluginElement_PluginSymbName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getImport_packages <em>Import packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import packages</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getImport_packages()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_Import_packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExport_packages <em>Export packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export packages</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExport_packages()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_Export_packages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRegisteredServices <em>Registered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registered Services</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRegisteredServices()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_RegisteredServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getConsumedServices <em>Consumed Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumed Services</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getConsumedServices()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_ConsumedServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Interfaces</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRequiredInterfaces()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getProvidedInterfaces()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Points</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensionPoints()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_ExtensionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensions()
	 * @see #getPluginElement()
	 * @generated
	 */
	EReference getPluginElement_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginVersion <em>Plugin Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Version</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginVersion()
	 * @see #getPluginElement()
	 * @generated
	 */
	EAttribute getPluginElement_PluginVersion();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement <em>Provided Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement
	 * @generated
	 */
	EClass getProvidedInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement#getInterfaceName()
	 * @see #getProvidedInterfaceElement()
	 * @generated
	 */
	EAttribute getProvidedInterfaceElement_InterfaceName();

	/**
	 * Returns the meta object for the attribute list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operations</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement#getOperations()
	 * @see #getProvidedInterfaceElement()
	 * @generated
	 */
	EAttribute getProvidedInterfaceElement_Operations();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement <em>Consumed Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumed Service Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement
	 * @generated
	 */
	EClass getConsumedServiceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement#getObjName <em>Obj Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement#getObjName()
	 * @see #getConsumedServiceElement()
	 * @generated
	 */
	EAttribute getConsumedServiceElement_ObjName();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement#getInterfaceName()
	 * @see #getConsumedServiceElement()
	 * @generated
	 */
	EAttribute getConsumedServiceElement_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement <em>Extension Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement
	 * @generated
	 */
	EClass getExtensionElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement#getPoint()
	 * @see #getExtensionElement()
	 * @generated
	 */
	EAttribute getExtensionElement_Point();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement#getClassName()
	 * @see #getExtensionElement()
	 * @generated
	 */
	EAttribute getExtensionElement_ClassName();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement <em>Extension Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement
	 * @generated
	 */
	EClass getExtensionPointElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getId()
	 * @see #getExtensionPointElement()
	 * @generated
	 */
	EAttribute getExtensionPointElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getName()
	 * @see #getExtensionPointElement()
	 * @generated
	 */
	EAttribute getExtensionPointElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement#getSchema()
	 * @see #getExtensionPointElement()
	 * @generated
	 */
	EAttribute getExtensionPointElement_Schema();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement <em>Imported Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Package Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement
	 * @generated
	 */
	EClass getImportedPackageElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement#getName()
	 * @see #getImportedPackageElement()
	 * @generated
	 */
	EAttribute getImportedPackageElement_Name();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement <em>Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement
	 * @generated
	 */
	EClass getComponentElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getRequiredElements <em>Required Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Elements</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getRequiredElements()
	 * @see #getComponentElement()
	 * @generated
	 */
	EReference getComponentElement_RequiredElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getProvidedElements <em>Provided Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Elements</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getProvidedElements()
	 * @see #getComponentElement()
	 * @generated
	 */
	EReference getComponentElement_ProvidedElements();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector#getValue()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Value();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement <em>Provided Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement
	 * @generated
	 */
	EClass getProvidedElement();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement <em>Required Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement
	 * @generated
	 */
	EClass getRequiredElement();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement <em>Registered Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Service Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement
	 * @generated
	 */
	EClass getRegisteredServiceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement#getObjName <em>Obj Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement#getObjName()
	 * @see #getRegisteredServiceElement()
	 * @generated
	 */
	EAttribute getRegisteredServiceElement_ObjName();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement#getInterfaceName()
	 * @see #getRegisteredServiceElement()
	 * @generated
	 */
	EAttribute getRegisteredServiceElement_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement <em>Required Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement
	 * @generated
	 */
	EClass getRequiredInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement#getInterfaceName()
	 * @see #getRequiredInterfaceElement()
	 * @generated
	 */
	EAttribute getRequiredInterfaceElement_InterfaceName();

	/**
	 * Returns the meta object for the attribute list '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operations</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement#getOperations()
	 * @see #getRequiredInterfaceElement()
	 * @generated
	 */
	EAttribute getRequiredInterfaceElement_Operations();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement <em>Exported Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Package Element</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement
	 * @generated
	 */
	EClass getExportedPackageElement();

	/**
	 * Returns the meta object for the attribute '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement#getName()
	 * @see #getExportedPackageElement()
	 * @generated
	 */
	EAttribute getExportedPackageElement_Name();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector <em>Extension Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Connector</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector
	 * @generated
	 */
	EClass getExtensionConnector();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector#getSource()
	 * @see #getExtensionConnector()
	 * @generated
	 */
	EReference getExtensionConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector#getTarget()
	 * @see #getExtensionConnector()
	 * @generated
	 */
	EReference getExtensionConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connector</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector
	 * @generated
	 */
	EClass getInterfaceConnector();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector#getSource()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector#getTarget()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector <em>Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Connector</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector
	 * @generated
	 */
	EClass getServiceConnector();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector#getSource()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EReference getServiceConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector#getTarget()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EReference getServiceConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector <em>Package Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Connector</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector
	 * @generated
	 */
	EClass getPackageConnector();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector#getSource()
	 * @see #getPackageConnector()
	 * @generated
	 */
	EReference getPackageConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector#getTarget()
	 * @see #getPackageConnector()
	 * @generated
	 */
	EReference getPackageConnector_Target();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductlineadlFactory getProductlineadlFactory();

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
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl <em>Software Product Line Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.SoftwareProductLineArchitectureImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getSoftwareProductLineArchitecture()
		 * @generated
		 */
		EClass SOFTWARE_PRODUCT_LINE_ARCHITECTURE = eINSTANCE.getSoftwareProductLineArchitecture();

		/**
		 * The meta object literal for the '<em><b>Graph Type Tree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE = eINSTANCE.getSoftwareProductLineArchitecture_GraphTypeTree();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES = eINSTANCE.getSoftwareProductLineArchitecture_Features();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT = eINSTANCE.getSoftwareProductLineArchitecture_Root();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS = eINSTANCE.getSoftwareProductLineArchitecture_Constraints();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES = eINSTANCE.getSoftwareProductLineArchitecture_Composites();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS = eINSTANCE.getSoftwareProductLineArchitecture_Components();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.FeatureImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OUTGOING_EDGE = eINSTANCE.getFeature_OutgoingEdge();

		/**
		 * The meta object literal for the '<em><b>Incoming Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCOMING_EDGE = eINSTANCE.getFeature_IncomingEdge();

		/**
		 * The meta object literal for the '<em><b>Owning Feature Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNING_FEATURE_DIAGRAM = eINSTANCE.getFeature_OwningFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OPERATOR = eINSTANCE.getFeature_Operator();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__MODEL = eINSTANCE.getFeature_Model();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SELECTED = eINSTANCE.getFeature_Selected();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MANDATORY = eINSTANCE.getFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ABSTRACT = eINSTANCE.getFeature_Abstract();

		/**
		 * The meta object literal for the '<em><b>Detailed Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DETAILED_MODEL = eINSTANCE.getFeature_DetailedModel();

		/**
		 * The meta object literal for the '<em><b>Required Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRED_ELEMENTS = eINSTANCE.getFeature_RequiredElements();

		/**
		 * The meta object literal for the '<em><b>Provided Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PROVIDED_ELEMENTS = eINSTANCE.getFeature_ProvidedElements();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.EdgeImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PARENT = eINSTANCE.getEdge_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CHILD = eINSTANCE.getEdge_Child();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__VALUE = eINSTANCE.getEdge_Value();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConstraintImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SOURCE = eINSTANCE.getConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TEXT = eINSTANCE.getConstraint_Text();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OperatorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Owning Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OWNING_FEATURE = eINSTANCE.getOperator_OwningFeature();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptImpl <em>Opt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOpt()
		 * @generated
		 */
		EClass OPT = eINSTANCE.getOpt();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.AndImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OrImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.XorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequireImpl <em>Require</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequireImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequire()
		 * @generated
		 */
		EClass REQUIRE = eINSTANCE.getRequire();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MutexImpl <em>Mutex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MutexImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getMutex()
		 * @generated
		 */
		EClass MUTEX = eINSTANCE.getMutex();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositeElementImpl <em>Composite Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositeElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getCompositeElement()
		 * @generated
		 */
		EClass COMPOSITE_ELEMENT = eINSTANCE.getCompositeElement();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ELEMENT__COMPONENTS = eINSTANCE.getCompositeElement_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_ELEMENT__NAME = eINSTANCE.getCompositeElement_Name();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ELEMENT__CONNECTORS = eINSTANCE.getCompositeElement_Connectors();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl <em>Plugin Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getPluginElement()
		 * @generated
		 */
		EClass PLUGIN_ELEMENT = eINSTANCE.getPluginElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_ELEMENT__NAME = eINSTANCE.getPluginElement_Name();

		/**
		 * The meta object literal for the '<em><b>Plugin Symb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_ELEMENT__PLUGIN_SYMB_NAME = eINSTANCE.getPluginElement_PluginSymbName();

		/**
		 * The meta object literal for the '<em><b>Import packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__IMPORT_PACKAGES = eINSTANCE.getPluginElement_Import_packages();

		/**
		 * The meta object literal for the '<em><b>Export packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__EXPORT_PACKAGES = eINSTANCE.getPluginElement_Export_packages();

		/**
		 * The meta object literal for the '<em><b>Registered Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__REGISTERED_SERVICES = eINSTANCE.getPluginElement_RegisteredServices();

		/**
		 * The meta object literal for the '<em><b>Consumed Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__CONSUMED_SERVICES = eINSTANCE.getPluginElement_ConsumedServices();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__REQUIRED_INTERFACES = eINSTANCE.getPluginElement_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__PROVIDED_INTERFACES = eINSTANCE.getPluginElement_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__EXTENSION_POINTS = eINSTANCE.getPluginElement_ExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_ELEMENT__EXTENSIONS = eINSTANCE.getPluginElement_Extensions();

		/**
		 * The meta object literal for the '<em><b>Plugin Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_ELEMENT__PLUGIN_VERSION = eINSTANCE.getPluginElement_PluginVersion();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedInterfaceElementImpl <em>Provided Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedInterfaceElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getProvidedInterfaceElement()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE_ELEMENT = eINSTANCE.getProvidedInterfaceElement();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_INTERFACE_ELEMENT__INTERFACE_NAME = eINSTANCE.getProvidedInterfaceElement_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_INTERFACE_ELEMENT__OPERATIONS = eINSTANCE.getProvidedInterfaceElement_Operations();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConsumedServiceElementImpl <em>Consumed Service Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConsumedServiceElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConsumedServiceElement()
		 * @generated
		 */
		EClass CONSUMED_SERVICE_ELEMENT = eINSTANCE.getConsumedServiceElement();

		/**
		 * The meta object literal for the '<em><b>Obj Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMED_SERVICE_ELEMENT__OBJ_NAME = eINSTANCE.getConsumedServiceElement_ObjName();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMED_SERVICE_ELEMENT__INTERFACE_NAME = eINSTANCE.getConsumedServiceElement_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionElementImpl <em>Extension Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionElement()
		 * @generated
		 */
		EClass EXTENSION_ELEMENT = eINSTANCE.getExtensionElement();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ELEMENT__POINT = eINSTANCE.getExtensionElement_Point();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ELEMENT__CLASS_NAME = eINSTANCE.getExtensionElement_ClassName();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionPointElementImpl <em>Extension Point Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionPointElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionPointElement()
		 * @generated
		 */
		EClass EXTENSION_POINT_ELEMENT = eINSTANCE.getExtensionPointElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_ELEMENT__ID = eINSTANCE.getExtensionPointElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_ELEMENT__NAME = eINSTANCE.getExtensionPointElement_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_ELEMENT__SCHEMA = eINSTANCE.getExtensionPointElement_Schema();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ImportedPackageElementImpl <em>Imported Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ImportedPackageElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getImportedPackageElement()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE_ELEMENT = eINSTANCE.getImportedPackageElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE_ELEMENT__NAME = eINSTANCE.getImportedPackageElement_Name();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl <em>Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getComponentElement()
		 * @generated
		 */
		EClass COMPONENT_ELEMENT = eINSTANCE.getComponentElement();

		/**
		 * The meta object literal for the '<em><b>Required Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ELEMENT__REQUIRED_ELEMENTS = eINSTANCE.getComponentElement_RequiredElements();

		/**
		 * The meta object literal for the '<em><b>Provided Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ELEMENT__PROVIDED_ELEMENTS = eINSTANCE.getComponentElement_ProvidedElements();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ConnectorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__VALUE = eINSTANCE.getConnector_Value();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedElementImpl <em>Provided Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProvidedElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getProvidedElement()
		 * @generated
		 */
		EClass PROVIDED_ELEMENT = eINSTANCE.getProvidedElement();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredElementImpl <em>Required Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequiredElement()
		 * @generated
		 */
		EClass REQUIRED_ELEMENT = eINSTANCE.getRequiredElement();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RegisteredServiceElementImpl <em>Registered Service Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RegisteredServiceElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRegisteredServiceElement()
		 * @generated
		 */
		EClass REGISTERED_SERVICE_ELEMENT = eINSTANCE.getRegisteredServiceElement();

		/**
		 * The meta object literal for the '<em><b>Obj Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_SERVICE_ELEMENT__OBJ_NAME = eINSTANCE.getRegisteredServiceElement_ObjName();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_SERVICE_ELEMENT__INTERFACE_NAME = eINSTANCE.getRegisteredServiceElement_InterfaceName();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredInterfaceElementImpl <em>Required Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.RequiredInterfaceElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getRequiredInterfaceElement()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE_ELEMENT = eINSTANCE.getRequiredInterfaceElement();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_INTERFACE_ELEMENT__INTERFACE_NAME = eINSTANCE.getRequiredInterfaceElement_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_INTERFACE_ELEMENT__OPERATIONS = eINSTANCE.getRequiredInterfaceElement_Operations();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExportedPackageElementImpl <em>Exported Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExportedPackageElementImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExportedPackageElement()
		 * @generated
		 */
		EClass EXPORTED_PACKAGE_ELEMENT = eINSTANCE.getExportedPackageElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTED_PACKAGE_ELEMENT__NAME = eINSTANCE.getExportedPackageElement_Name();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionConnectorImpl <em>Extension Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ExtensionConnectorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getExtensionConnector()
		 * @generated
		 */
		EClass EXTENSION_CONNECTOR = eINSTANCE.getExtensionConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_CONNECTOR__SOURCE = eINSTANCE.getExtensionConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_CONNECTOR__TARGET = eINSTANCE.getExtensionConnector_Target();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.InterfaceConnectorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EClass INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__SOURCE = eINSTANCE.getInterfaceConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__TARGET = eINSTANCE.getInterfaceConnector_Target();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ServiceConnectorImpl <em>Service Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ServiceConnectorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getServiceConnector()
		 * @generated
		 */
		EClass SERVICE_CONNECTOR = eINSTANCE.getServiceConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTOR__SOURCE = eINSTANCE.getServiceConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTOR__TARGET = eINSTANCE.getServiceConnector_Target();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PackageConnectorImpl <em>Package Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PackageConnectorImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getPackageConnector()
		 * @generated
		 */
		EClass PACKAGE_CONNECTOR = eINSTANCE.getPackageConnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_CONNECTOR__SOURCE = eINSTANCE.getPackageConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_CONNECTOR__TARGET = eINSTANCE.getPackageConnector_Target();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.MandatoryImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.OptionalImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.CompositionImpl
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //ProductlineadlPackage
