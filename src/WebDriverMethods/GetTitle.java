package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		String pageTitle=w.getTitle();
		System.out.println(pageTitle);
	}
}
