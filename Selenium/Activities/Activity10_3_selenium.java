package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions action = new Actions(driver); 
		driver.get("https://training-support.net/selenium/drag-drop");
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dest1 =driver.findElement(By.id("droppable"));
        WebElement dest2 = driver.findElement(By.id("dropzone2"));
        action.dragAndDrop(ball, dest1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dest1,"background-color"));
        System.out.println("ENTERED DROPZONE 1");
        action.dragAndDrop(ball, dest2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dest2,"background-color"));
        System.out.println("ENTERED DROPZONE 2");
        driver.close();
	}

}
