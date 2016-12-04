package org.catsvsdogs.test;

import static org.junit.Assert.assertEquals;

import org.catvsdogs.main.CatsVsDogApp;
import org.junit.Test;


public class CatsVsDogsTest {

	@Test
	public void testFirstInput(){
		String[] votes = {
				"C1 D1",
				"C1 D1",
				"C1 D1",
				"D2 C1",
				"D1 C1"
		};
		
		int maxViewers = CatsVsDogApp.getMaxViewersWithArrays(votes, 2, 2);
		assertEquals(3, maxViewers);
		
	}
	
	@Test
	public void testSecondInput(){
		String[] votes = {
				"C1 D1",
				"D1 C1"
		};
		
		int maxViewers = CatsVsDogApp.getMaxViewersWithArrays(votes, 1, 1);
		assertEquals(1, maxViewers);
	}
	
	@Test
	public void testInvalidInput(){
		String[] votes = {
				"D1 D2",
				"C1 C1"
		};
		
		int maxViewers = CatsVsDogApp.getMaxViewersWithArrays(votes, 2, 2);
		assertEquals(0, maxViewers);
		
	}
	
	@Test
	public void testNoExceptionExpectedInput(){
		String[] votes = {
				"D",
				"XXX"
		};
		
		int maxViewers = CatsVsDogApp.getMaxViewersWithArrays(votes, 2, 2);
		assertEquals(0, maxViewers);
	}
	
}
