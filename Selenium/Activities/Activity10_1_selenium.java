package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1_selenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		Actions actions = new Actions(driver);
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		actions.click(cube);
		WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
        actions.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());
        actions.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());
        
	}

}
