package Builder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Builder.MealImpl.MealBuilder;

public class MealImplTest {

	private Meal m;

	public MealImplTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 m = new MealImpl.MealBuilder(3).location("ISTIC").build();
	}

	@Test
	public void testGetLocation() {
		assertEquals("ISTIC",m.getLocation());
	}

}
