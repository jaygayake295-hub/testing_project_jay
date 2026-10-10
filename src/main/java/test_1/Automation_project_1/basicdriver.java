package test_1.Automation_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class basicdriver {

	public static void main(String[] args) throws Throwable{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);
	}

}
