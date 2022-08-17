package Basemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			Actions act=new Actions(driver);
WebElement adminhover = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
act.moveToElement(adminhover).perform();
			 WebElement titlehover = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
			 act.moveToElement(titlehover).perform();
			 driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]")).click();
			 
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"jobTitle_jobTitle\"]")).sendKeys("SDET5");
			driver.findElement(By.xpath("//*[@id=\"jobTitle_jobDescription\"]"))
			.sendKeys("“Software Development Engineer in Test");
			driver.findElement(By.xpath("//*[@id=\"jobTitle_note\"]")).sendKeys("“ I am qualified for SDET");
			driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click(); 
		WebElement check = driver.findElement(By.xpath("//a[contains(.,'SDET5')]"));
		String verify = check.getText();
		System.out.println(verify);
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[3]/td[2]"));
		String verify1 = check1.getText();
		System.out.println(verify1);
				//*[@id="resultTable"]/tbody/tr[2]/td[3]
		}
}
