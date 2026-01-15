package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practice07 {
    public static void main(String args[]) throws Exception{
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            driver.navigate().to("https://www.smartbazaar.co.uk/");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@class='sp-image __web-inspector-hide-shortcut__']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='brave_popup__close__button']")));
            driver.findElement(By.xpath("//div[@class='brave_popup__close__button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@class='account-icon dropdown-toggle']")).click();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Login / Register")).click();
            System.out.println("Done");


        }catch (Exception ignored){

        }
        finally {
            //driver.quit();
        }
    }
}
