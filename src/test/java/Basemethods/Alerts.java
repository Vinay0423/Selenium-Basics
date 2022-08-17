package Basemethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
WebElement ele1=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
	Actions act=new Actions(driver);
act.moveToElement(ele1).perform();
/*driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Alert alert= driver.switchTo().alert();
alert.accept();
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
Alert alert1=driver.switchTo().alert();
alert1.dismiss();*/
driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
Alert alert2=driver.switchTo().alert();
alert2.sendKeys(Keys.CONTROL+"A");
alert2.sendKeys(Keys.CONTROL+"C");
alert2.sendKeys("hii");


//driver.findElement(By.xpath(null))

}
	

}
