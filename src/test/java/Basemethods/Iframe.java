package Basemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame(0);
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Accessing iframe");
String handle = driver.getWindowHandle();
driver.switchTo().window(handle);
driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iframe is easy");
driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[1]/a")).click();
	}
	
}
