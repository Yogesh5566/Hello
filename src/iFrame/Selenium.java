package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(4000);
		w.switchTo().frame("classFrame");
		String text1 = w.findElement(By.xpath("(//div[@class='block'])[1]")).getText();
		System.out.println(text1);
		w.switchTo().defaultContent();
		Thread.sleep(4000);
		w.switchTo().frame("packageListFrame");
		String text2=w.findElement(By.xpath("//a[text()='org.openqa.selenium.concurrent']")).getText();
		System.out.println(text2);
		w.switchTo().defaultContent();
		Thread.sleep(4000);
		w.switchTo().frame("packageFrame");
		String text3=w.findElement(By.xpath("//a[text()='AddHasFullPageScreenshot']")).getText();
		System.out.println(text3);
		
}
}