package Basemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/Ikano%20E%20card/multiplecheckbox.html");
		List<WebElement> links = driver.findElements(By.xpath("//input"));
		int count=links.size();
		for(WebElement w:links)
		{
			w.click();
			Thread.sleep(2000);
		}
}
}