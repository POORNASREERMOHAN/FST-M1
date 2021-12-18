package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  String title1= driver.getTitle();
	  System.out.println("Title of page :"+title1);
	  Assert.assertEquals(title1, "Training Support");
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("New page title is: " + driver.getTitle());
      
      Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
