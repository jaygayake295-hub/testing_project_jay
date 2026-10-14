package test_1.Automation_project_1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class xpath2 {
public static void main(String args[]) {
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	//1 xpath://tagname[@attribute='value']
	driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("jui jamdar");
	
	
	driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("jui@1gmai.com");
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("7057213872");
	}
}
