package main.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.*;

public class TestQueue {
	Queue maQueue;
	
	@Before
	public void setUp(){
		maQueue = new Queue(5);
	}
	
	@After
	public void tearDown(){
		maQueue = null;
	}
	
	@Test(expected=IllegalStateException.class)
	public void testConstructorFail() {
		maQueue = new Queue(0);
	}
	
	@Test
	public void testPush(){
		maQueue.push(1);
		assertEquals(false, maQueue.isEmpty());
		assertEquals(1, maQueue.getNumberOfElements());
		assertEquals(1, maQueue.head());
	}
	
	@Test(expected=IllegalStateException.class)
	public void testFullQueuePush(){
		maQueue.push(1);
		maQueue.push(2);
		maQueue.push(3);
		maQueue.push(4);
		maQueue.push(5);
		maQueue.push(6);
	}
	
	@Test
	public void testIsFull(){
		maQueue.push(1);
		maQueue.push(2);
		maQueue.push(3);
		maQueue.push(4);
		maQueue.push(5);
		assertEquals(true, maQueue.isFull());
	}

	@Test
	public void testGetStackTmp(){
		assertEquals(true, maQueue.getStackTmp().isEmpty());
	}
	
	@Test
	public void testPop(){
		maQueue.push(5);
		maQueue.push(3);
		maQueue.pop();
		maQueue.pop();
		
		assertEquals(true, maQueue.isEmpty());
		assertEquals(true, maQueue.getStackTmp().isEmpty());
	}
	
	@Test
	public void testFIFO(){
		maQueue.push(1);
		maQueue.push(2);
		maQueue.push(3);
		maQueue.pop();
		
		assertEquals(2, (int)maQueue.getTheArray()[0]);
		assertEquals(2, (int)maQueue.getNumberOfElements());
		assertEquals(true, maQueue.getStackTmp().isEmpty());
	}
}
