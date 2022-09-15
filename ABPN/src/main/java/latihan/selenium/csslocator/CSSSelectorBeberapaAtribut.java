package latihan.selenium.csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CSSSelectorBeberapaAtribut {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

		 driver.findElement(By.cssSelector("textarea[rows = '5'][cols ='20'][class = 'form-control']")).
		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		}
}