package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mousehover {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointmebtn=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		
	}
	

}
