package Basemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Actions act=new Actions(driver);
		WebElement hover1 = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		act.moveToElement(hover1).perform();
	WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"));
	act.moveToElement(hover2).perform();
	driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"empsearch_id\"]")).sendKeys("0002");
	Select empdrop= new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_employee_status\"]"))) ;
	empdrop.selectByIndex(2);
	Select idrop=new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_termination\"]")));
	idrop.selectByIndex(1);
	Select it=new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_sub_unit\"]"))) ;
	it.selectByIndex(4);
	driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	Select listed = new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_employee_status\"]")));
	List<WebElement> op= listed.getOptions();
	int size=op.size();
	System.out.println(" the number of options in dropdown are "+size);
	for(int i=0; i<size;i++)
	{
		String options = op.get(i).getText();
		System.out.println(options);
	}
 
	}
}
