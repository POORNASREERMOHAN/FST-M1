package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
	    System.out.println(driver.getTitle());
	    WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        userName.sendKeys("poorna");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        password.sendKeys("password");
        WebElement conf = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input"));
        conf.sendKeys("password");
        WebElement mail = driver.findElement(By.xpath("//label[text()='Email']/following::input"));
        mail.sendKeys("ap@gmail.com");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        driver.close();
	}

}
