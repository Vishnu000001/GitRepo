package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TngAnnTwo {

	
		@Test (groups = {"smoke"})
		public static void method1() {
			System.out.println("I am the first test method");
		}
		
		@Test (groups = {"smoke"})
		public static void method() {
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
		
		@BeforeClass
		public static void bc() {
			System.out.println("I print before every class");
		}
		

}
