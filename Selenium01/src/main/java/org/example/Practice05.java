package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Practice05 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.manage().window().maximize();
            driver.get("https://m.rediff.com/");

            // Click Create Account
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account"))).click();
            String parentWindow = driver.getWindowHandle();
            System.out.println("aaa--->");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000);
            System.out.println("After before tnc");
            // Click terms and conditions
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("terms and conditions"))).click();
            System.out.println("Check after tnc");
            // Switch to new window
            Set<String> windows = driver.getWindowHandles();
            for (String window : windows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

            // Click Accept button (example locator – should be improved)
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class='floatR']/input")
            )).click();

            // Switch back to parent window
            driver.switchTo().window(parentWindow);
            System.out.println("Switched back to parent window");

            js.executeScript("window.scrollTo(0, 0);");

            // Click Rediff Home
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Rediff Home"))).click();
            System.out.println("Final step complete");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
