import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		Thread.sleep(6000);
		
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);
		
		//selecting items in a multiple select elements
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(6000);
		
		Select fruit = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(6000);
		
		fruit.selectByVisibleText("Banana");
		Thread.sleep(6000);
		
		fruit.selectByIndex(3);
		Thread.sleep(6000);
		
		//closes the window
		driver.close();

	}

}
