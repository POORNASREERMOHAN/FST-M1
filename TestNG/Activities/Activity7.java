package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity7 {
	WebDriver driver;
	WebDriverWait wait;
	
  @DataProvider(name="Authentication")
  public static Object[][] credentials() 
  {
	  return new Object[][] { { "admin", "password" }}; 
  }
  
  @Test (dataProvider = "Authentication")
  public void loginTestCase(String username, String password) {
	  WebElement usernameField = driver.findElement(By.id("username"));
      WebElement passwordField = driver.findElement(By.id("password"));  
      usernameField.sendKeys(username);
      passwordField.sendKeys(password);
      driver.findElement(By.cssSelector("button[type='submit']")).click();
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
  }
 
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  wait = new WebDriverWait(driver, 10);
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
