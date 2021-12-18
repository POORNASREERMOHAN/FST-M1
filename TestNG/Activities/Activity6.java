package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
  WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void loginTestcase(String username, String password)
  {
	  
	  WebElement log = driver.findElement(By.id("username"));
	  WebElement passwordField = driver.findElement(By.id("password"));
	  log.sendKeys(username);
	  passwordField.sendKeys(password);
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
  }
  
  
 
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
