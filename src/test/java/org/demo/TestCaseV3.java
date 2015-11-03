package org.demo;
import junit.framework.TestCase;

/**
 * JUnit V3
 */
public class TestCaseV3 extends TestCase {

	static {
		System.out.println("\nstatic { ... } \n");
	}

	public static void setUpBeforeClass() { // Not supported in JUnit 3
	}
	public static void tearDownAfterClass() { // Not supported in JUnit 3
	}
	
	/**
	 * Constructor
	 * @param name
	 */
	public TestCaseV3(String name) {
		super(name);
		System.out.println("Constructor ( name = '" + name + "' )");
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("\nsetUp");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown");
	}

	public void testMyCase3() {
		System.out.println("testMyCase3");
	}

	public void testMyCase1() {
		System.out.println("testMyCase1");
	}

	public void testMyCase2() {
		System.out.println("testMyCase2");
	}

}
