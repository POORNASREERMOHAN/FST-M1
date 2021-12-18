package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class Activity11_1_selenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions action = new Actions(driver); 
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		WebElement simple = driver.findElement(By.id("simple"));
        simple.click();
        Alert simpleAlert = driver.switchTo().alert();
        String al = simpleAlert.getText();
        simpleAlert.accept();
        driver.close();
	}

}
