package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		/*WebElement e1 = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"box103\"]"));*/
		Actions act=new Actions(driver);
		//act.dragAndDrop(e1, e2).perform();
		Thread.sleep(3000);
		WebElement b1 = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement b2 = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		act.dragAndDrop(b1, b2).perform();
		Thread.sleep(3000);
		act.doubleClick(b2).perform();
		driver.close();
}
}