import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1. launching a web browser

public class SeleniumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ask webdriver manager to launch the driver
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
	}

}
