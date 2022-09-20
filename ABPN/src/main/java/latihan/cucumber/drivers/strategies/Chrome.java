package latihan.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy{
	public WebDriver setStrategy() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEXSOFT\\Downloads\\ChromeDriver\\chromedriver.exe"); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("--no-sandbox");
		
//		return new ChromeDriver(options);
		return driver;
	}
}
