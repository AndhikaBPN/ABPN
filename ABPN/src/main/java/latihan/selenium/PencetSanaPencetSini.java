package latihan.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PencetSanaPencetSini {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 formFirstName.sendKeys("Sutarno");
		 String getFName = formFirstName.getAttribute("value");
		 System.out.println("First Name: " + getFName);
		 
		 WebElement formLastName = driver.findElement(By.id("last-name"));
		 formLastName.sendKeys("Agung");
		 String getLName = formLastName.getAttribute("value");
		 System.out.println("Last Name: " + getLName);
		 
		 WebElement formJobTitle = driver.findElement(By.id("job-title"));
		 formJobTitle.sendKeys("Game Dev");
		 String getJTitle = formJobTitle.getAttribute("value");
		 System.out.println("Job Title: " + getJTitle);
		 
		 WebElement buttonEdu = driver.findElement(By.id("radio-button-1"));
		 buttonEdu.click();
		 String getEdu = buttonEdu.getAttribute("value"); //belum sesuai
		 System.out.println("Last Education: " + getEdu);
		 
		 WebElement checkSex = driver.findElement(By.id("checkbox-1"));
		 checkSex.click();
		 String getSex = checkSex.getText(); //kosong
		 System.out.println("Sex: " + getSex);
		 
		 WebElement checkSex2 = driver.findElement(By.id("checkbox-2"));
		 checkSex2.click();
		 
		 Select selectExp = new Select(driver.findElement(By.id("select-menu")));
		 selectExp.selectByValue("3");
		 
		 WebElement selectDate = driver.findElement(By.id("datepicker"));
		 selectDate.sendKeys("07/25/2003");
		 String getDate = selectDate.getAttribute("value");
		 System.out.println("Date: " + getDate);
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 WebElement submitButton = driver.findElement(By.partialLinkText("Submit"));
		 submitButton.click();

	}

}
