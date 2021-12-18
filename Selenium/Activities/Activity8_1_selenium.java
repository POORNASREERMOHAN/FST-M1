package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		System.out.println("Number of columns are: " + cols.size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of rows are: " + rows.size());
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[3]/td"));
		for(WebElement cells :thirdRow) {
			System.out.println(" Value is"+cells.getText()); 
		}
		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		for(WebElement cells1 :secondRow)
		{
			System.out.println("Value of second row :"+cells1.getText());
		}
		
		
		
		driver.close();
			
	}

}
