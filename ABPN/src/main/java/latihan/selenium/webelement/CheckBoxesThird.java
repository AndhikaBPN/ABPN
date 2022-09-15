package latihan.selenium.webelement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesThird {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement ceklisan;
		 String baseUrl = "https://formy-project.herokuapp.com/checkbox";
		 driver.get(baseUrl);

		 List<WebElement> daftarCeklisan = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 for (int i = 0; i<daftarCeklisan.size();i++) {
			 ceklisan = daftarCeklisan.get(i);
			 if (!ceklisan.isSelected()) {
				 ceklisan.click();
			 }
		 }
	}
}