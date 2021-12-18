package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement usrname = driver.findElement(By.id("username"));
	  usrname.sendKeys("admin");
	  WebElement pssword = driver.findElement(By.id("password"));
	  pssword.sendKeys("password");
	  WebElement login = driver.findElement(By.xpath("//input[contains(text()='Log in')]"));
	  login.click();
	  String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals("Welcome Back, admin", loginMessage);
	  
	  
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
