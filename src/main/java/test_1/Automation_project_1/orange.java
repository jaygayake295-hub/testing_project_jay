package test_1.Automation_project_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orange {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");

			WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(15));
			
			WebElement loginbtn=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
			loginbtn.click();
			driver.findElement(By.linkText("Logout")).click();
	}

}

//click on manda user to logout