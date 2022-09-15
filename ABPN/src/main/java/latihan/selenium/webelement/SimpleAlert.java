package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/alerts";
		 driver.get(baseUrl);

		 
		 driver.findElement(By.id("alertButton")).click();

//		 Alert simpleAlert = driver.switchTo().alert();
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
		}

}