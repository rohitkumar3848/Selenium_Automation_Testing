package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Practice04 {
    public  static void main(String args[])throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://m.rediff.com/");



        driver.findElement(By.linkText("Create Account")).click();
        Thread.sleep(1000);
        String parent=driver.getWindowHandle();

        JavascriptExecutor js = (JavascriptExecutor) driver;


        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight);");

        Thread.sleep(1500);
        By terms = By.linkText("terms and conditions");
        driver.findElement(terms).click();


        Thread.sleep(2000);
        Set<String> windows=driver.getWindowHandles();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/input")).click();
                break;
            }
        }

        driver.switchTo().window(parent);
        System.out.println("Back to parent window");



        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");

        Thread.sleep(1500);
        By terms1 = By.linkText("Rediff Home");
        driver.findElement(terms1).click();


        System.out.println("Final step complete");

    }
}
