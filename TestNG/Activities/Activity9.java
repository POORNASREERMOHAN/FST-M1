package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Activity9 {
	WebDriver driver;
	
  @Test
  public void simpleAlertTestCase() 
  {
	  
	  
  }
  
  @Test
  public void confirmAlertTestCase() 
  {
	  
	  
  }
  
  @Test
  public void promptAlertTestCase() 
  {
	  
	  
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  Reporter.log("Starting Test |");
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
