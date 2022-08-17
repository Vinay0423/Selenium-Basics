package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		//act.contextClick(ele2);
		act.doubleClick(ele).perform();
		/*WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		driver.quit();*/
		
}
}