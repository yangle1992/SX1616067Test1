package org.lionsoul.tankwar.tank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.lionsoul.tankwar.model.Tank;

public class TankTest {
	Tank tk = new Tank(1,2,3,4);
	
	int count_x=5;
	int count_y=5;
	int size=100;
	int distance=10;

	@Before
	public void setUp() throws Exception {
		System.out.println("Tank is set up!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tank is tear down!");
	}

	@Test
	public void testDraw() {
		tk.draw(null);
		System.out.println("The method draw is called");		
	}

	@Test
	public void testMove() {
		tk.move();
		System.out.println("The method move is called");
	}

	@Test
	public void testCouldShot() {
		tk.couldShot();
		System.out.println("The method couldShot is called");
	}

	@Test
	public void testGetMovingBullets() {
		tk.getMovingBullets();
		System.out.println("The method getMovingBullets is called");
	}
}
		
