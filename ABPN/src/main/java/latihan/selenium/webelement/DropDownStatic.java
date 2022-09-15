package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownStatic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/select-menu";
		 driver.get(baseUrl);

		 
		 Select select = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		 select.selectByIndex(3);
		 select.selectByVisibleText("Yellow");
		 select.selectByValue("3");
		}
}