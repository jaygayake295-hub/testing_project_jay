package test_1.Automation_project_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo2 {
    public static void main(String[] args) throws Throwable{
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(1000);
        driver.findElement(org.openqa.selenium.By.id("username")).sendKeys("student");
        Thread.sleep(1000);
        driver.findElement(org.openqa.selenium.By.id("password")).sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(org.openqa.selenium.By.id("submit")).click();
        Thread.sleep(1000);
        
        //varify new page url contains practice test automation.com logged in succesfully
        System.out.println("URL after login:"+driver.getCurrentUrl());
       
        //varify new page contains expected text('congratulation''or''successfully logged in')
        WebElement greet_text=driver.findElement(By.tagName("strong"));
        System.out.println("Greet Text after login:"+greet_text.getText());
       // driver.quit();
    }
}