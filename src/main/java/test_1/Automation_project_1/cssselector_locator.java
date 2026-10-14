package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector_locator {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1 xpath://tagname[@attribute='value']
		driver.findElement(By.cssSelector("//input[placeholder='Enter Name']")).sendKeys("jui jamdar");
		
		
		driver.findElement(By.cssSelector("//input[@placeholder='Enter EMail']")).sendKeys("jui@1gmai.com");
		
		driver.findElement(By.cssSelector("//input[@placeholder='Enter Phone']")).sendKeys("7057213872");
		
		//Select sel = new Select(driver.findElement(By.id("country")));
		//sel. selectByvisibleText("india");
//		sel.selectByindex(0);
	//	Thread.sleep(1000)
	}

}
