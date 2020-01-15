package tests;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	
	  @Test
	  public void openMyBlog() {
		Reporter.log("HELLO" , true);
		Reporter.log("HELLO I am testing Maven" , true);
		System.out.println("I AM TESTING MAVEN PROJECT********************");
	  }
	  
	  
}
