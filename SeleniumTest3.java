import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest3 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//if you have same name, then it will take 1st one
		//option1
		driver.findElement(By.name("webform")).click();
		
		//checkbox1
		driver.findElement(By.id("vfb-6-0")).click();
		
		//checkbox2
		driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		
	}
}
