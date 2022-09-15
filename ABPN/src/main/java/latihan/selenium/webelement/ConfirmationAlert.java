package latihan.selenium.webelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ConfirmationAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/alerts";
		 driver.get(baseUrl);

		 

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("confirmButton")));
		 driver.findElement(By.id("confirmButton")).click();

		 Alert confirmAlert = driver.switchTo().alert();
		 Thread.sleep(1000);
		 confirmAlert.dismiss();
	}
}