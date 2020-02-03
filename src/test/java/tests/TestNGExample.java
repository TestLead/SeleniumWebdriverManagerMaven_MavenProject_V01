package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Writing TestNG example
//To automate Flip cart

public class TestNGExample {
	
	@Test
	public void test() throws InterruptedException
	{
		Reporter.log("Start Flip cart home page" , true);
		//WebDriverManager.firefoxdriver().setup();         //System.setProperty("webdriver.gecko.driver", "../MavenProject/exe/geckodriver.exe");
	    //WebDriver driver = new FirefoxDriver();       
	    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //driver.navigate().to("https://www.flipkart.com/");
	    //Thread.sleep(2000);
	    //driver.close();
	}
}