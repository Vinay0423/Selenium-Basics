package Basemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement menu = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions   act=new Actions(driver);
	act.moveToElement(menu).perform();
	/*WebDriverWait exwait= new WebDriverWait(driver, 10);
	exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));*/
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	
}
}
