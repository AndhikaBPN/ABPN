package latihan.selenium.csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CSSLocatingParentChild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

		 driver.findElement(By.cssSelector("form > div > div > textarea[placeholder = 'Current Address']")).
		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");		 
	}
}