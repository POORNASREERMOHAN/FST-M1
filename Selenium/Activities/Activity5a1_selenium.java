package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5a1_selenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println(driver.getTitle());
	    WebElement elem = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    System.out.println("checkbox displayed"+elem.isDisplayed());
	    WebElement elem2 = driver.findElement(By.id("toggleCheckbox"));
	    elem2.click();
	    System.out.println("checkbox displayed :"+elem.isDisplayed());
	    driver.close();
	}

}
