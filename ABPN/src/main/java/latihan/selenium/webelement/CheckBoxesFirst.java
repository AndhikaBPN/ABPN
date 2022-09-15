package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesFirst {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/checkbox";
		 driver.get(baseUrl);

		 WebElement ceklisan = driver.findElement(By.id("checkbox-3"));
		 ceklisan.click();
		}
}