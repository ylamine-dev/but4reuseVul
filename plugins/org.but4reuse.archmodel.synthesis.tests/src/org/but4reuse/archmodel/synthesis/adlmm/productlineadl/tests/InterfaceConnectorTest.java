/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceConnectorTest.class);
	}

	/**
	 * Constructs a new Interface Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterfaceConnector getFixture() {
		return (InterfaceConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createInterfaceConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InterfaceConnectorTest
