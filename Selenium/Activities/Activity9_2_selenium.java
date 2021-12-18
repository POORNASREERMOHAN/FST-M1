package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2_selenium {
	
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		WebElement drop = driver.findElement(By.id("multi-value"));
		Select choice = new Select(driver.findElement(By.id("multi-select")));
		if(choice.isMultiple())
		{
			choice.selectByVisibleText("Javascript");
			System.out.println(drop.getText());
			choice.selectByValue("node");
			System.out.println(drop.getText());
			
			
			for(int i=4;i<=6;i++)
			{
				choice.selectByIndex(i);
			}
			System.out.println(drop.getText());
			
			
			choice.deselectByValue("node");
			System.out.println(drop.getText());
			
			choice.deselectByIndex(7);
			System.out.println(drop.getText());
			List<WebElement> selectedOptions = choice.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            //Deselect all options
            choice.deselectAll();
            System.out.println(drop.getText());
        }        
        //Close browser
        driver.close();
		
		}
	}


