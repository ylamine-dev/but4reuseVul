/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MandatoryTest extends EdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MandatoryTest.class);
	}

	/**
	 * Constructs a new Mandatory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mandatory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mandatory getFixture() {
		return (Mandatory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createMandatory());
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

} //MandatoryTest
