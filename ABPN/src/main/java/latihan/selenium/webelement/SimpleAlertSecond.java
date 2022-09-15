package latihan.selenium.webelement;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlertSecond {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/alerts";
		 driver.get(baseUrl);

		 WebElement tombol1 = driver.findElement(By.id("alertButton"));
		 tombol1.click();

		 Alert simpleAlert = driver.switchTo().alert();
		 String actualMessage = simpleAlert.getText();
		 String targetMessage = "You clicked a button";

		 Thread.sleep(1000);
		 simpleAlert.accept();

		 System.out.println("Actual Message : "+actualMessage);
		 System.out.println("Target Message : "+targetMessage);
	}
}