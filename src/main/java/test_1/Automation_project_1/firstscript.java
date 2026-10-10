package test_1.Automation_project_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstscript {

	public static void main(String[] args) throws Throwable {
	//setproperty of wedrivers
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\testing_workspace\\Automation-project_1\\DriverResorces\\chromedriver.exe");
System.out.println("1.webdriver configuration done!");

// creating the object of chromedriver
ChromeDriver driver = new ChromeDriver();
System.out.println("2.intiliaze chromedriver");

driver.get("https://www.cravitaindia.com/");
 Thread.sleep(1000);
 driver.close();

	}

}
