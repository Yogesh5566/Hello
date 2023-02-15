package Blazedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='destination of the week! The Beach!']")).click();
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
}
}