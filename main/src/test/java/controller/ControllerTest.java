package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import entity.Boulder;
import entity.Entity;
import model.Model;

public class ControllerTest {

	Model model = new Model();
	Controller controller = new Controller(null, model);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDiamond() {
		model.loadMap(1);
		controller.swap(model.getTabEntity(), model.getMap(), 39);
		int expected = 1;
		assertEquals(expected, model.getCharacter().getNbDiamond());
	}

	@Test
	public void testDeplacement() {
		model.loadMap(1);
		int expectedX = 2;
		int expectedY = 1;
		controller.swap(model.getTabEntity(), model.getMap(), 39);
		assertEquals(expectedX, model.getPosY());
		assertEquals(expectedY, model.getPosX());
	}

	@Test
	public void testEboulement() {
		controller.orderPerform(ControllerOrder.map1);
		int expectedX = 3;
		int expectedY = 2;
		Entity[][] tabEntity = model.getTabEntity();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!(tabEntity[expectedY][expectedX] instanceof Boulder)) {
			fail("sa marce pas");
		}
	}
}
