package main.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.*;

public class TestTowersOfHanoi {
	TowersOfHanoi TOH;
	
	@Before
	public void setUp(){
		TOH = new TowersOfHanoi(4);
	}
	
	@After
	public void tearDown(){
		TOH = null;
	}
	
	@Test(expected=IllegalStateException.class)
	public void testFailConstructor(){
		TOH = new TowersOfHanoi(0);
	}
	
	@Test
	public void testResoudreHanoi(){
		TOH.resoudrehanoi(4, TOH.get_Pile_de_Gauche(), TOH.get_Pile_du_Milieu(), TOH.get_Pile_de_Droite());
		assertEquals(0, TOH.get_Pile_du_Milieu().getNumberOfElements());
		assertEquals(0, TOH.get_Pile_de_Gauche().getNumberOfElements());
		assertEquals(4, TOH.get_Pile_de_Droite().getNumberOfElements());
		assertEquals(1, TOH.get_Pile_de_Droite().head());
	}
	
	@Test 
	public void testDeplacerDisk(){
		TOH.deplacerDisk(TOH.get_Pile_de_Gauche(), TOH.get_Pile_du_Milieu());
		assertEquals(1, TOH.get_Pile_du_Milieu().getNumberOfElements());
		assertEquals(3, TOH.get_Pile_de_Gauche().getNumberOfElements());
		assertEquals(1, TOH.get_Pile_du_Milieu().head());
	}
}
