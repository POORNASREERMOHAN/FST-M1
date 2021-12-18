package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  String title1 = driver.getTitle();
	  System.out.println("Title is :"+title1);
	  Assert.assertEquals(title1, "Target Practice");
  }
  
  @Test
  public void f2() {
	  
	  WebElement blackBtn = driver.findElement(By.xpath("//button[contains(text()='Black')]"));
	  Assert.assertTrue(blackBtn.isDisplayed());
      Assert.assertEquals(blackBtn.getText(), "black");
  }
  
  @Test(enabled = false)
  public void f3() {
	  
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  
  
  @Test
  public void f4() {
	  
	  throw new SkipException("Skipping this testcase");
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
