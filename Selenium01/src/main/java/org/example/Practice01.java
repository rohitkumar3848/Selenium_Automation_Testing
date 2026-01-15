package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;


public class Practice01 {
    public static void main(String []args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchBox.sendKeys("java");
        Thread.sleep(2000);
        Actions action=new Actions(driver);

        List<WebElement> suggestions=driver.findElements(By.xpath("//*[@jsname='bw4e9b']//li"));

        System.out.println("suggestion length--"+suggestions.size());

        for(WebElement suggestion:suggestions){
            String text=suggestion.getText();
            if(text.equalsIgnoreCase("java compiler")){
                action.moveToElement(suggestion).click().build().perform();
                break;
            }
        }
    }


}
