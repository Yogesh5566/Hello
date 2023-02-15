package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	w.manage().window().maximize();
	w.findElement(By.xpath("//button[text()='✕']")).click();
	w.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under 15000",Keys.ENTER);
	w.findElement(By.xpath("//div[text()='vivo T1 44W (Starry Sky, 128 GB)']")).click();
	Set a=w.getWindowHandles();
	ArrayList<String> a1=new ArrayList<String>(a);
	String Id1=a1.get(0);
	System.out.println(Id1);
	String Id2=a1.get(1);
	System.out.println(Id2);
	w.switchTo().window(Id2);
	w.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	
}
}
