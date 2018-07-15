import static org.junit.Assert.*;

import org.junit.Test;

import Tools.MyTools;

public class GameTest {

	@Test
	public void test() {
		assertEquals(true, MyTools.checkNum3(3));
		assertEquals(true, MyTools.checkNum5(5));
	}

}
