package webdriver.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverHandleTest {
	
	@Test
	public void test()
	{
		Reporter.log("Hello" , true);
		WebDriverManager.firefoxdriver().setup();         //System.setProperty("webdriver.gecko.driver", "../MavenProject/exe/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();       
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.navigate().to("http://www.google.com");
	}

}
