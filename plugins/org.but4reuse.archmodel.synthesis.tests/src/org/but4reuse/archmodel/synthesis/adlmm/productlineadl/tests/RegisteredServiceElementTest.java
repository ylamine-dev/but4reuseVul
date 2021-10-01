/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Registered Service Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegisteredServiceElementTest extends ProvidedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegisteredServiceElementTest.class);
	}

	/**
	 * Constructs a new Registered Service Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredServiceElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Registered Service Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegisteredServiceElement getFixture() {
		return (RegisteredServiceElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createRegisteredServiceElement());
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

} //RegisteredServiceElementTest
