package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5a2_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println(driver.getTitle());
	    WebElement elem = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("whether box checked :"+elem.isSelected());
        elem.click();
        System.out.println("whether box checked :"+elem.isSelected());
        driver.close();
	}

}
