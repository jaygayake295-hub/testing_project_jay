package test_1.Automation_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo1 {

	public static void main(String args[])throws Throwable {
		Chttps://www.youtube.com/
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.navigate().to("https://www.myntra.com/");
	Thread.sleep(1000);
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.close();
	}

}
