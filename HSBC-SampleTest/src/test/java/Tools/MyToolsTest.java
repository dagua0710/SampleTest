package Tools;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyToolsTest {

	@BeforeClass
	public static void beforeClass(){
	 	System.out.println("before class..");
	}

	@Before
    public void Before(){
		System.out.println("before");  
    }
	
	@Test
	public void testCheckNum3(){
		assertEquals(true, MyTools.checkNum3(3));
		//assertEquals(false, MyTools.checkNum3(3));
	}
	
	@Test
	public void testCheckNum5(){
		//assertEquals(true, MyTools.checkNum5(5));
		assertEquals(false, MyTools.checkNum5(5));
	}
	
	@Test(timeout = 10)
    public void testTimeout(){
		assertEquals(true, MyTools.checkNum3(3));
    }
	
	@After    
    public void after(){     
        System.out.println("after");     
    }
	
	@AfterClass
	public static void afterClass(){
		System.out.println("after class..");
	}
}
