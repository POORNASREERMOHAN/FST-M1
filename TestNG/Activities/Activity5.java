package ActivitiesTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	
	WebDriver driver;
  @Test(groups = {"HeaderTests", "ButtonTests"})
  public void pageTitleTest() {
	  
	  String heading = driver.getTitle();
	  System.out.println("Title is :"+heading);
  }
  
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
  public void headerTest1() {
	  
	  WebElement header3 = driver.findElement(By.id("third-header"));
	  Assert.assertEquals(header3.getText(),"Third header");
  }
  
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
  public void headerTest2() {
	  
	  WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
	  Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
  }
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void buttonTest1() {
	  
	  WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
      Assert.assertEquals(button1.getText(), "Olive");
  }
  
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void ButtonTest2() {
      WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
      Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
  }
  
  
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  
  
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  
	  driver.close();
  }

}
