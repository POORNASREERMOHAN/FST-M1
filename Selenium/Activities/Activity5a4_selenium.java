package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5a4_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
	    System.out.println(driver.getTitle());
	    WebElement elem3 = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("whether box checked :"+elem3.isEnabled());
        
        WebElement elem4 = driver.findElement(By.xpath("//button[contains(text(),'Enable Input')]"));
        System.out.println("whether box checked :"+elem4.isEnabled());
        driver.close();
	}

}
