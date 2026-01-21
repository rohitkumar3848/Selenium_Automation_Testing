package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.Utility;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    public static void openBrowser(String choice) {

        if (choice.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (choice.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (choice.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid browser name: " + choice);
        }
    }

    public  static void navigation(String title) {

        driver.get(Utility.properties("url"));
        driver.manage().window().maximize();

        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleIs(title));
    }

    public static  void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
