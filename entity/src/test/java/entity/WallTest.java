package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class WallTest {
	private Wall wall;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.wall = new Wall(0, 0, true, false, true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisBreakable() {
		boolean expected = true;
		Assert.assertEquals(expected, this.wall.isBreakable());
	}

}
