package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://secure.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("jaygayke@2gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("7057213872");
		Thread.sleep(1000);
		driver.close();
	}

}
