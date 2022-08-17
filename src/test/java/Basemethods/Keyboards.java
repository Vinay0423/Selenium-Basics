package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboards {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/Ikano%20E%20card/Demo.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vinay");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys(Keys.CONTROL+"A");
		ele.sendKeys(Keys.CONTROL+"X");
		ele.sendKeys(Keys.CONTROL+"V");
		
}
}