package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://demo.guru99.com/test/delete_customer.php");
		w.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		w.findElement(By.xpath("//input[@name='submit']")).click();
		Alert a=w.switchTo().alert();
		a.accept();
		a.accept();
}
}