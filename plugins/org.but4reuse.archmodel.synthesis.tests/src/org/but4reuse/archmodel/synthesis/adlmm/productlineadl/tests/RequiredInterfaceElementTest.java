/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Interface Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredInterfaceElementTest extends RequiredElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredInterfaceElementTest.class);
	}

	/**
	 * Constructs a new Required Interface Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterfaceElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Interface Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredInterfaceElement getFixture() {
		return (RequiredInterfaceElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createRequiredInterfaceElement());
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

} //RequiredInterfaceElementTest
