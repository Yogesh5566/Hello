package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement day = w.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("26");
		WebElement month= w.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("3");
		WebElement year = w.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByValue("2000");
		w.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		
	}
}
