package latihan.selenium.csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatingByChildElementsSequence {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/select-menu";
		 driver.get(baseUrl);

		 System.out.println(driver.findElement(By.cssSelector("select#oldSelectMenu>option:nth-of-type(2)[value='1']")).getText());		 
		}
}