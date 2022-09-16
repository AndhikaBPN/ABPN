package tugas.selenium.demoqa.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox implements DriverStrategy{
	public WebDriver setStrategy() {
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
