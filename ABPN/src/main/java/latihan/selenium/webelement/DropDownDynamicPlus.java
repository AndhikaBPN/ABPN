package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownDynamicPlus {
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
	
			 String baseUrl = "https://demoqa.com/select-menu";
			 driver.get(baseUrl);
	
			 Actions pencetan = new Actions(driver);
			 
//			 driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']")).click();
			 int numOption = 6;
			 int percobaan = 0;
			 String target = "Group 2, option 1";
			 boolean cocok = false;
			 driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']")).click();
			 pencetan.sendKeys(Keys.DOWN).build().perform();
			 pencetan.sendKeys(Keys.ENTER).build().perform();
			 
			 System.out.println(driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).getText());
			 cocok = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).getText().equals(target);
			 percobaan ++;
			 while(!cocok && percobaan < numOption) {
			 driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).click();
			 pencetan.sendKeys(Keys.DOWN).build().perform();
			 pencetan.sendKeys(Keys.ENTER).build().perform();
			 
			 System.out.println(driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).getText());
			 cocok = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']")).getText().equals(target);
			 percobaan ++;
			 }
		}
}