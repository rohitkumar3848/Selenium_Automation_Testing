package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;


public class Practice03 {
    public static void main(String []args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        // Task 1-->
        Thread.sleep(1000);
        WebElement alert1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alert1.click();
        Thread.sleep(1000);

        Alert alerta=driver.switchTo().alert();
        System.out.println("Alert1 text-->"+alerta.getText());
        alerta.accept();
        Thread.sleep(1000);

        //Task2-->
        Thread.sleep(1000);
        WebElement alert2=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        alert2.click();
        Thread.sleep(1000);

        Alert alertb=driver.switchTo().alert();
        System.out.println("Alert1 text-->"+alertb.getText());
        alertb.dismiss();
        Thread.sleep(1000);

        WebElement alert3=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        alert3.click();
        Thread.sleep(1000);

        Alert alertc=driver.switchTo().alert();
        System.out.println("Alert1 text-->"+alertc.getText());
        alertc.sendKeys("Rohit Kumar");
        alertc.accept();
        Thread.sleep(1000);

        //driver.quit();
    }


}
