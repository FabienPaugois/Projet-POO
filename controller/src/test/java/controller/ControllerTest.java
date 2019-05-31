package controller;

import java.awt.Image;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;
import entity.Character;
import entity.Diamond;
import entity.Dirt;
import entity.Entity;

public class ControllerTest {
	
	private Entity tabEntity[][];

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		IView view;
		IModel model;
		Controller controller = new Controller(view, model);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		Entity tabEntity[][] = new Entity[2][2];
		Image tabImage[][] = new Image[2][2];
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void swapTest() {
		tabEntity[0][0] = new Character(0, 0);
		tabEntity[0][1] = new Diamond(0, 1);
		tabEntity[1][0] = new Dirt(1, 0);
		tabEntity[1][1] = new Dirt(1, 1);
		controller.
	}

}
