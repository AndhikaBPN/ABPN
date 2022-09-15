package latihan.selenium.webelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/alerts";
		 driver.get(baseUrl);
		 

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("promtButton")));

		 driver.findElement(By.id("promtButton")).click();
		 Alert promptAlert = driver.switchTo().alert();
		 Thread.sleep(1000);

		 promptAlert.sendKeys("Bambang Gentolet");
		 Thread.sleep(1000);
		 promptAlert.accept();
	}
}