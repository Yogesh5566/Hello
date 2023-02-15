package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.hdfc.com/");
}
}
