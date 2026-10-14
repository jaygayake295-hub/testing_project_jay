package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	
	public static void main (String args []) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver. manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		Thread.sleep(10000);
		
		driver.close();
		
		
	}
	
}
