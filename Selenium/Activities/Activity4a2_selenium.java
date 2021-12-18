package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4a2_selenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
	    System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("poorna");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("mohan");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohan@gm.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8848234552");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8848234552");
        driver.findElement(By.xpath("//textarea")).sendKeys("message typed");
        driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();
        driver.close();
	}

}
