package test_1.Automation_project_1;

public class demo3 {
    public static void main(String[] args)throws Throwable {

        org.openqa.selenium.WebDriver driver =
                new org.openqa.selenium.edge.EdgeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(1000);

        driver.findElement(org.openqa.selenium.By.id("username"))
                .sendKeys("student");
        Thread.sleep(1000);

        driver.findElement(org.openqa.selenium.By.id("password"))
                .sendKeys("Password123");
        Thread.sleep(1000);
        driver.findElement(org.openqa.selenium.By.id("submit"))
                .click();
        Thread.sleep(1000);

       // driver.quit();
    }
}