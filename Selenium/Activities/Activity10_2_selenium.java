package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2_selenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		String  pressedKeyText;
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        Action actionsequence = action.sendKeys("P").build();
        actionsequence.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        Action actionsequence2 = action.keyDown(Keys.CONTROL)
        		                 .sendKeys("a")
        		                 .sendKeys("c")
        		                 .keyUp(Keys.CONTROL)
        		                 .build();
        actionsequence2.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        driver.close();
	}

}
