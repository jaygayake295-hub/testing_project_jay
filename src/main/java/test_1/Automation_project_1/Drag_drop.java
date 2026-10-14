package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Drag_drop {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drag = driver.findElement(By.id("draggable"));
		
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		//Action class
		Action ac = new Action(driver);
		ac.drangAndDrop

	}

}
