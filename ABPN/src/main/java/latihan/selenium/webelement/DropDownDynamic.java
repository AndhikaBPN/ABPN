package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDynamic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/select-menu";
		 driver.get(baseUrl);

		 Actions pencetan = new Actions(driver);
		 
		 int indexOption = 4;
		 driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']")).click();
		 for (int i = 0; i<indexOption; i++) {
			 pencetan.sendKeys(Keys.DOWN).build().perform();
		 }
		 pencetan.sendKeys(Keys.ENTER).build().perform();
		 
		 System.out.println(driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).getText());
	}
}
