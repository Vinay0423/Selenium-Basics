package Basemethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlers {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title = driver.getTitle();
		String tt = "Frames & windows";
		if(title.equals(tt))
		{
			System.out.println(" we are in correct page");
		}else {
			System.out.println("we are in wrong page , but i will continue with my automation");
		}
		String parenthandle=driver.getWindowHandle();
		System.out.println("parent windowhandle is "+parenthandle);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		String indextitle="Index";
		String currenthandle=driver.getWindowHandle();
		System.out.println("current windowhandle is "+currenthandle);
		for(String winHandle:driver.getWindowHandles())
		{
			if(driver.switchTo().window(winHandle).getTitle().equals(indextitle))
			{
				break;
			}
			else {
				driver.switchTo().window(currenthandle);
			}
		}
		
		String titl1=driver.getTitle();
		if(indextitle.equals(titl1))
		{
			System.out.println("We are in index page");
		}else {
			System.out.println("We are not in index page");
		}
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"btn1\"]"));
		boolean b1=ele1.isDisplayed();
		System.out.println("Sigin element found is "+b1);
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"btn2\"]"));
		boolean b2=ele2.isDisplayed();
		System.out.println("skip Sigin element found is "+b2);
		
if(b1==b2)
{
	System.out.println("all elements displayed");
}else {
	System.out.println("not all elements displayed");
}
String s2="Selenium";
for(String w1:driver.getWindowHandles()) {
	if(driver.switchTo().window(w1).getTitle().equals(s2))
	{
		break;
	}
}

driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a")).click();
WebElement present = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/h1"));
boolean b3=present.isDisplayed();
System.out.println(b3);

driver.switchTo().window(currenthandle);
driver.quit();

	
}
}