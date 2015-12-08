package main.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.*;


public class TestStack {
	Stack monStack;
	
	@Before
	public void setUp(){
		monStack = new Stack(5);
	} 
	
	@After
	public void tearDown(){
		monStack = null;
	}
	
	@Test(expected=IllegalStateException.class)
	public void testConstructorFail() {
		monStack = new Stack(0);
	}
	
	@Test
	public void testSize() {
		assertEquals(5, monStack.getTailleStack());
	}
	
	@Test
	public void testNbElem(){
		assertEquals(0, monStack.getNumberOfElements());
	}
	
	@Test
	public void testIsEmpty(){
		assertEquals(true, monStack.isEmpty());
	}
	
	@Test
	public void testPush() {
		monStack.push(5);
		assertEquals(1, monStack.getNumberOfElements());
	}
	
	@Test(expected=IllegalStateException.class)
	public void testOverflow(){
		monStack.push(1);
		monStack.push(2);
		monStack.push(3);
		monStack.push(4);
		monStack.push(5);
		monStack.push(6);
	}
	
	@Test
	public void testIsFull(){
		monStack.push(1);
		monStack.push(2);
		monStack.push(3);
		monStack.push(4);
		monStack.push(5);
		assertEquals(true, monStack.isFull());
	}
	
	@Test(expected=IllegalStateException.class)
	public void testNullPop(){
		monStack.pop();
	}
	
	@Test
	public void testPop(){
		monStack.push(4);
		monStack.pop();
		assertEquals(true, monStack.isEmpty());
	}
	
	@Test(expected=IllegalStateException.class)
	public void testNullHead(){
		monStack.head();
	}
	
	@Test
	public void testHead(){
		monStack.push(3);
		assertEquals(3, monStack.head());
	}
	
	@Test
	public void testLIFO(){
		monStack.push(1);
		monStack.push(2);
		monStack.pop();
		assertEquals(1, (int)monStack.getTheArray()[0]);
		assertEquals(null, monStack.getTheArray()[1]);
	}
}
