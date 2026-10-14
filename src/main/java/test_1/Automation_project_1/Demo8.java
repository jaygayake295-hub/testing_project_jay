package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String args[] ){
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		//enter
		search.sendKeys("Mobile");
		search.sendKeys(Keys.ENTER);
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		WebElement first name=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys("gauri");
		
	}
}
