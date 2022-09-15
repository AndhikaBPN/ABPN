package latihan.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSana {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://formy-project.herokuapp.com/autocomplete";
		 driver.get(baseUrl);
		 WebElement formAddress = driver.findElement(By.id("autocomplete"));
		 formAddress.sendKeys("Jl. Suka-Suka");
		 WebElement formStreetAddress = driver.findElement(By.id("street_number"));
		 formStreetAddress.sendKeys("Sumbersari");
		 WebElement formStreetAddress2 = driver.findElement(By.id("route"));
		 formStreetAddress2.sendKeys("Rajajowas");
		 WebElement formCity = driver.findElement(By.id("locality"));
		 formCity.sendKeys("Malang");
		 WebElement formState = driver.findElement(By.id("administrative_area_level_1"));
		 formState.sendKeys("Indonesia");
		 WebElement formZipCode = driver.findElement(By.id("postal_code"));
		 formZipCode.sendKeys("22666");
		 WebElement formCountry = driver.findElement(By.id("country"));
		 formCountry.sendKeys("Indonesia");

	}
}
