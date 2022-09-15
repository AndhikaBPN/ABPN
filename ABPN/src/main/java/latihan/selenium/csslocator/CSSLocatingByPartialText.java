package latihan.selenium.csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatingByPartialText {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);

//		 driver.findElement(By.cssSelector("input[id ^= 'fi']")).sendKeys("Supono");
//		 driver.findElement(By.cssSelector("input[id $= 'e']")).sendKeys("Supono");
		 driver.findElement(By.cssSelector("input[placeholder *= 'ter']")).sendKeys("Supono");

		}
}
