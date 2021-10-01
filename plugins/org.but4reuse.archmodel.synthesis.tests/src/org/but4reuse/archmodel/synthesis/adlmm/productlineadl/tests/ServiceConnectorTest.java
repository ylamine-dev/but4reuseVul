/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceConnectorTest.class);
	}

	/**
	 * Constructs a new Service Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceConnector getFixture() {
		return (ServiceConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createServiceConnector());
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

} //ServiceConnectorTest
