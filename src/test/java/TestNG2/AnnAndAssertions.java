package TestNG2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnAndAssertions {
	
	@Test
	public static void M1(){
		System.out.println("1");
	}
	
	@BeforeTest
	public static void M2() {
		System.out.println("BF");
	}
	
	@Test
	public static void M3(){
		System.out.println("2");
	}
	
	@AfterTest
	public static void M4() {
		System.out.println("AF");
	}

}
