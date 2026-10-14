package test_1.Automation_project_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class slider {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://testautomationpractice.blogspot.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 1. Locate the left handle using the exact jQuery UI slider-range container
            WebElement leftSlider = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@id='slider-range']//span[1]")
                )
            );

            // 2. Scroll the slider into view so mouse events reach it
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", leftSlider);
            Thread.sleep(1000);

            // 3. Perform manual drag sequence (more reliable than single dragAndDropBy)
            Actions actions = new Actions(driver);
            actions.moveToElement(leftSlider)
                   .clickAndHold()
                   .moveByOffset(100, 0)
                   .release()
                   .perform();

            // Verify
            System.out.println("Slider position style after drag: " + leftSlider.getAttribute("style"));

        } finally {
            // driver.quit();
        }
    }
}