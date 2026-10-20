package test_1.Automation_project_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");

	}

}
