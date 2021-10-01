/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.tests;

import junit.textui.TestRunner;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptTest.class);
	}

	/**
	 * Constructs a new Opt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Opt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Opt getFixture() {
		return (Opt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProductlineadlFactory.eINSTANCE.createOpt());
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

} //OptTest
