package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_selenium {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://training-support.net/selenium/simple-form");
    System.out.println(driver.getTitle());
    WebElement fname = driver.findElement(By.id("firstName"));
    fname.sendKeys("Poorna");
    WebElement lname = driver.findElement(By.id("firstName"));
    lname.sendKeys("Mohan");
    WebElement mail = driver.findElement(By.id("email"));
    mail.sendKeys("ajp@gmail.com");
    WebElement contact = driver.findElement(By.id("email"));
    contact.sendKeys("8848292331");
    WebElement subBttn = driver.findElement(By.className("green"));
    subBttn.click();
    driver.close();
	}

}
