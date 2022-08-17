package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Talentcom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.talent.com/view?id=b4a088684f96&context=whitepage");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[.='Apply on company website']")).click();
		driver.findElement(By.xpath("//button[@onclick='skipAlertRouter();']")).click();
		
}
}
