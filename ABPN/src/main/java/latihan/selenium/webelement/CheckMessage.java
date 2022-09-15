package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckMessage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://nxtgenaiacademy.com/demo-site/";
		 driver.get(baseUrl);

		 
		 driver.findElement(By.xpath("//input[@id='vfb19']")).sendKeys("(0809)899-999");

		 Actions pencetan = new Actions(driver);
		 pencetan.sendKeys(Keys.ENTER).build().perform();

		 
		 String actualMessage = driver.findElement(By.xpath("//label[@for='vfb-19'and @class='vfb-error']")).getText();
		 String targetMessage = "Please enter only digits.";
		 System.out.println("Actual Message : "+actualMessage);
		 System.out.println("Target Message : "+targetMessage);
	}	 
}