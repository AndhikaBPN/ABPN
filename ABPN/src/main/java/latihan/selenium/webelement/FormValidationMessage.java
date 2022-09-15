package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormValidationMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://nxtgenaiacademy.com/demo-site/";
		 driver.get(baseUrl);

		 WebElement formTelepon = driver.findElement(By.xpath("//input[@id='vfb19']"));
		 formTelepon.sendKeys("(0809)899-999");

		 Actions pencetan = new Actions(driver);
		 pencetan.sendKeys(Keys.ENTER).build().perform();

		 
		 System.out.println(driver.findElement(By.xpath("//label[@for='vfb-19'and @class='vfb-error']")).getText());
		}
}