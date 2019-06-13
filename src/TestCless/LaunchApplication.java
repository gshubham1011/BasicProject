package TestCless;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchApplication {
	
@Test
	  public static void Launch() throws InterruptedException {
		  

			System.setProperty("webdriver.chrome.driver", ".\\src\\Drivers\\chromedriver.exe");
       
		      WebDriver driver = new ChromeDriver();
		    
	      
	      driver.get("https://www.google.com/");
	      Thread.sleep(2000);
	      String titleName = driver.getTitle();
	      SoftAssert assertion = new SoftAssert();
	      assertion.assertEquals(titleName, "Google","Title of the page is not correct");
	      System.out.println(" Title of Page ="+titleName);
	      
	      driver.quit();

		  
		  
	  }
}
