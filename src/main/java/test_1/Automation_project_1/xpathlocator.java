package test_1.Automation_project_1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathlocator {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/register");
	
	//1 xpath://tagname[@attribute='value']
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("jay");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("gayake");
	//2.xpath :parentname /childname
//	driver.findElement(By.xpath("//div/input")).sendKeys("jay1235");
	//3.xpath;//tagname[@attribute='value'and @attribute='value']
	driver.findElement(By.xpath("//input[@type='text'and @id='userName']")).sendKeys("patil1234");
	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("jui1234");
	}

}
