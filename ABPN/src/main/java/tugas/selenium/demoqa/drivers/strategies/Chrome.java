package tugas.selenium.demoqa.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy{
	public WebDriver setStrategy() { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
