package latihan.selenium;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CekJudulAuto {
	@Test
	public void cekGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://google.com";
		String expectedTitle = "Google";
		 driver.get(baseUrl);
		 String actualTitle = driver.getTitle();
		 assertEquals(actualTitle, expectedTitle);
		
		 driver.close();

	}
}
