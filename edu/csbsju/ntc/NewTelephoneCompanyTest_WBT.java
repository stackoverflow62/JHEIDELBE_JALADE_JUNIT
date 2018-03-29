package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;
	
	@Before
	public void setUp() throws Exception{
	ntc = new NewTelephoneCompany();
	}
	
	@Test
	public void testGetStartTime() {
		int expected = 0;
		int result = ntc.getStartTime();
		assertEquals("Hours is " +expected, expected, result);
	}

	@Test
	public void testSetStartTime() {
		int expected = 5;
		ntc.setStartTime(5);
		int results = ntc.getStartTime();
		assertEquals("Hours is " + expected, expected, results);
	}

	@Test
	public void testGetDuration() {
		int expResult = 0;
		int result = ntc.getDuration();
		assertEquals("Duration is " + expResult, expResult, result);
		
		
	}

	@Test
	public void testSetDuration() {
		int expected = 40;
		ntc.setDuration(40);
		int result = ntc.getDuration();
		assertEquals("Duration is " + expected, expected, result);
	}

	@Test
	public void testComputeCharge() {
		ntc.setStartTime(500);
		ntc.setDuration(40);
		double expected = 832;
		double result = ntc.computeCharge();
		assertTrue("Charge is " + expected, expected == result);
	}

	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidStartTime_Case8() {
	    ntc.setStartTime(2544);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	  }
	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidStartTime_Case9() {
	    ntc.setStartTime(-5);
	    ntc.setDuration(799);
	    ntc.computeCharge();
	  }
	@Test
	public void discountStartTimeDiscountedDurationCase1() {
		double expResult = 1768.0;
	    ntc.setDuration(100);
	    ntc.setStartTime(500);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeDiscountedDurationCase2() {
		double expResult = 1078.48;
	    ntc.setDuration(61);
	    ntc.setStartTime(759);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeDiscountedDurationCase3() {
		double expResult = 1078.48;
	    ntc.setDuration(61);
	    ntc.setStartTime(1959);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeDiscountedDurationCase4() {
		double expResult = 1149.2;
	    ntc.setDuration(65);
	    ntc.setStartTime(2359);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	
	@Test
	public void discountStartTimeCase1() {
		double expResult = 1248.0;
	    ntc.setDuration(60);
	    ntc.setStartTime(0);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeCase2() {
		double expResult = 1227.2;
	    ntc.setDuration(59);
	    ntc.setStartTime(400);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeCase3() {
		double expResult = 20.8;
	    ntc.setDuration(1);
	    ntc.setStartTime(759);
	    
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeCase4() {
		double expResult = 208.0;
	    ntc.setDuration(10);
	    ntc.setStartTime(1800);
	    
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeCase5() {
		double expResult = 208.0;
	    ntc.setDuration(10);
	    ntc.setStartTime(1801);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountStartTimeCase6() {
		double expResult = 208.0;
	    ntc.setDuration(10);
	    ntc.setStartTime(2359);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountDurationCase1() {
		double expResult = 2298.4;
	    ntc.setDuration(65);
	    ntc.setStartTime(800);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void discountDurationCase2() {
		double expResult = 2156.96;
	    ntc.setDuration(61);
	    ntc.setStartTime(900);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void noDiscountsCase1() {
		double expResult = 1664.0;
	    ntc.setDuration(40);
	    ntc.setStartTime(1000);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void noDiscountsCase2() {
		double expResult = 41.6;
	    ntc.setDuration(1);
	    ntc.setStartTime(800);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void noDiscountsCase3() {
		double expResult = 2454.4;
	    ntc.setDuration(59);
	    ntc.setStartTime(801);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}
	@Test
	public void noDiscountsCase4() {
		double expResult = 2496.0;
	    ntc.setDuration(60);
	    ntc.setStartTime(1759);
	    assertTrue("Result expected is " + expResult,expResult==ntc.computeCharge());
	}

}

