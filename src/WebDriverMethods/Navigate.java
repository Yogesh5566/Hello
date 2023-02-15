package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.navigate().to("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	driver.close();
	
}
}
