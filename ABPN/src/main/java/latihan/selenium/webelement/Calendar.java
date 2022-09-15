package latihan.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/datepicker";
		 driver.get(baseUrl);

		 int tahunTarget = 2082;
		 String bulanTarget = "Mar";
		 int tanggalTarget = 23;
		 WebElement kalender = driver.findElement(By.xpath("//input[@id='datepicker']"));
		 kalender.click();
		 WebElement kepalaTanggal = driver.findElement(By.xpath("//th[@class='datepicker-switch']"));
		 String bulanTahunKalender = kepalaTanggal.getText();
		 String bulanKalender = bulanTahunKalender.split(" ")[0];
		 int tahunKalender = Integer.parseInt(bulanTahunKalender.split(" ")[1]);
		 boolean bulanBenar = bulanKalender.contains(bulanTarget);
		 int selisihTahun = tahunTarget - tahunKalender;
		 if ((bulanBenar!=true)||(selisihTahun != 0)) {
		 kepalaTanggal.click();
		 if (selisihTahun<0) {
		 WebElement pencetKiri = driver.findElement(By.xpath("//div[@class='datepickermonths']//descendant::th[@class='prev']"));
		 while (tahunTarget < tahunKalender) {
		 pencetKiri.click();
		 kepalaTanggal = driver.findElement(By.xpath("//div[@class='datepickermonths']//descendant::th[@class='datepicker-switch']"));
		 tahunKalender = Integer.parseInt(kepalaTanggal.getText());
		 }
		 }
		 if (selisihTahun>0) {
		 WebElement pencetKiri = driver.findElement(By.xpath("//div[@class='datepickermonths']//descendant::th[@class='next']"));
		 while (tahunTarget > tahunKalender) {
		 pencetKiri.click();
		 kepalaTanggal = driver.findElement(By.xpath("//div[@class='datepickermonths']//descendant::th[@class='datepicker-switch']"));
		 tahunKalender = Integer.parseInt(kepalaTanggal.getText());
		 }
		 }
		 WebElement bulan = driver.findElement(By.xpath("//span[text() = '"+bulanTarget+"']"));
		 bulan.click();
		 WebElement tanggal = driver.findElement(By.xpath("//td[text() = '"+tanggalTarget+"']"));
		 tanggal.click();
		 }
		}
}
