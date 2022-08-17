package Basemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
@BeforeMethod
	public void login() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./se/geckodriver.exe");
	 driver= new FirefoxDriver();
	Thread.sleep(4000);
	driver.get("http://uems-lms.azurewebsites.net/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//body[@class='cb']")).sendKeys("ecard.admin@SpurTreeTech.onmicrosoft.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Spur2Win!");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	Thread.sleep(3000);
	}
@Test
public void manageTrainingCategory() throws InterruptedException
{
	driver.findElement(By.xpath("//a[@href='/TrainingCategory']")).click();
	driver.findElement(By.xpath("//input[@name='CategoryName']")).sendKeys(".");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).sendKeys(".");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-success mr-2']")).click();
	
}
     @Test
     public void manageCourse() throws InterruptedException
     {
    	 driver.findElement(By.xpath("//a[@href='/ManageCourse']")).click();
 		driver.findElement(By.xpath("//input[@id='CourseName']")).sendKeys(".");
       	driver.findElement(By.xpath("//input[@id='Code']")).sendKeys(".");
 		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
 		driver.findElement(By.xpath("(//input[@id='Mandatory'])[2]")).click();
 		driver.findElement(By.xpath("//button[@class='btn btn-success mr-2']")).click();
 		Thread.sleep(30000);
     }
     
     @Test
     public void manageChapter()
     {
    	
     }
     
     @Test
     public void manageDeparment() {
    	 driver.findElement(By.xpath("//a[@href='/Department']")).click();
    	 driver.findElement(By.xpath("//input[@id='DeptName']")).sendKeys(".");
    	 driver.findElement(By.xpath("//input[@id='DeptCode']")).sendKeys(".");
    	 driver.findElement(By.xpath("//button[.='Submit']")).click();
    	  }
   @Test  
    public void editDepartment() throws InterruptedException
    {
    	 driver.findElement(By.xpath("//a[@href='/Department']")).click();
    	 Thread.sleep(4000);
    	driver.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]")).click();
    	 Thread.sleep(4000);
    	 WebElement deptname= driver.findElement(By.xpath("//input[@id='DeptName']"));
    	 deptname.sendKeys(Keys.CONTROL);
    	 deptname.sendKeys("A");
    	 deptname.sendKeys(Keys.CONTROL);
    	 deptname.sendKeys("C");
    WebElement code=driver.findElement(By.xpath("//input[@id='DeptCode']"));
    code.sendKeys(Keys.CONTROL);
  code.sendKeys("V");
   	 driver.findElement(By.xpath("//button[.='Update']")).click();
    	
    }
     
   @AfterMethod
     public void close()
     {
    	 driver.close();
     }
     }
