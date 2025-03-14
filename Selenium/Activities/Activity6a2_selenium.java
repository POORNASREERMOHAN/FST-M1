package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6a2_selenium {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get(" https://training-support.net/selenium/ajax");
	    System.out.println(driver.getTitle());
	     driver.findElement(By.xpath("//button[contains(text(),'Change Content')]")).click();
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	     String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(ajaxText);
	     wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	     String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);
	        driver.close();
        
	}

}
