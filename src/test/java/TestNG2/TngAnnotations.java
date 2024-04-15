package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TngAnnotations {

	@Test
	public static void method1() {
		System.out.println("I am the first test method");
	}
	
	@Test 
	public static void method2() {
		System.out.println("I am the second method");
	}
	
	@BeforeMethod
	public static void bm() {
		System.out.println("I print before method");
	}
	
	@AfterMethod
	public static void am() {
		System.out.println("I print after method");
	}

}
