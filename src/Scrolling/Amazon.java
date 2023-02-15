package Scrolling;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.amazon.com/");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor j=(JavascriptExecutor)w;
		j.executeScript("window.scrollBy(0,2000);");
		TakesScreenshot t=(TakesScreenshot)w;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\yoges\\Desktop\\Selenium Screenshot\\amazon11.png");
		Files.copy(src, dest);
}
}