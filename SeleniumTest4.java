import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest4 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		//search box
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("111");
		//driver.findElement(By.id("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//submit button
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

		Alert alert = driver.switchTo().alert();

		String alerMessage = driver.switchTo().alert().getText();
		Thread.sleep(4000);
		alert.accept();

		Thread.sleep(4000);
		alert.dismiss();

	}

}
