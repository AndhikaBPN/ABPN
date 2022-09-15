package latihan.selenium.webelement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBoxesSecond {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/checkbox";
		 driver.get(baseUrl);

		 List<WebElement> daftarCeklisan = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 daftarCeklisan.get(1).click();
	}
}
