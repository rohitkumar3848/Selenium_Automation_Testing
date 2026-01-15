package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Practice06 {
    public static void main(String []args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/selenium/deprecated.html");
        Thread.sleep(2000);

        // we can switch to frame using frame id and name or xpath
        driver.switchTo().frame("packageListFrame");
        System.out.println("Done1");

        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
        System.out.println("Done2");
        driver.switchTo().defaultContent();
        System.out.println("Done3");


    }


}
