package test_1.Automation_project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.manage().window().maximize();

            // 1. Open URL
            driver.get("https://demo.automationtesting.in/Register.html");
            Thread.sleep(1000);

            // 2. Full Name
            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("jay");
            driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("gayake");
            Thread.sleep(1000);

            // 3. Address
            driver.findElement(By.cssSelector("textarea[ng-model='Adress']"))
                  .sendKeys("123 Automation Lane, Suite 400");
            Thread.sleep(1000);

            // 4. Email & Phone
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jay230@gmail.com");
            driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9876543210");
            Thread.sleep(1000);

            // 5. Gender
            driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
            Thread.sleep(1000);

            // 6. Hobbies
            driver.findElement(By.cssSelector("input#checkbox1")).click(); // Cricket
            driver.findElement(By.xpath("//input[@id='checkbox2']")).click(); // Movies
            Thread.sleep(1000);

            // 7. Languages (Fixed using JS Click to prevent overlay click interception)
            WebElement langBox = driver.findElement(By.cssSelector("div#msdd"));
            js.executeScript("arguments[0].scrollIntoView(true);", langBox);
            langBox.click();
            Thread.sleep(1000);

            WebElement langOption = driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete')]//a[text()='English']"));
            js.executeScript("arguments[0].click();", langOption);
            Thread.sleep(1000);

            // Click the label outside to close the dropdown menu
            driver.findElement(By.xpath("//label[contains(text(),'Languages')]")).click();
            Thread.sleep(1000);

            // 8. Skills
            Select skillsSelect = new Select(driver.findElement(By.cssSelector("select#Skills")));
            skillsSelect.selectByVisibleText("Java");
            Thread.sleep(1000);

            // 9. Country (Select2 Dropdown)
            WebElement countryBox = driver.findElement(By.xpath("//span[contains(@class,'select2-selection--single')]"));
            countryBox.click();
            Thread.sleep(1000);

            driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys("India");
            Thread.sleep(1000);

            driver.findElement(By.xpath("//li[contains(@class,'select2-results__option') and text()='India']")).click();
            Thread.sleep(1000);

            // 10. Date of Birth
            Select yearSelect = new Select(driver.findElement(By.cssSelector("select#yearbox")));
            yearSelect.selectByVisibleText("1996");

            Select monthSelect = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
            monthSelect.selectByVisibleText("July");

            Select daySelect = new Select(driver.findElement(By.cssSelector("select#daybox")));
            daySelect.selectByVisibleText("15");
            Thread.sleep(1000);

            // 11. Password & Confirm Password
            driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("Test@12345");
            driver.findElement(By.cssSelector("input#secondpassword")).sendKeys("Test@12345");
            Thread.sleep(1000);

            // 12. Submit
            driver.findElement(By.cssSelector("button#submitbtn")).click();
            System.out.println("Form submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace(); // Prints the exact error line in Eclipse Console if something fails
        } finally {
            Thread.sleep(3000);
           
        }
    }
}