package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;


public class Practice02 {
    public static void main(String []args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.goibibo.com/");

        // Task 1-->
        Thread.sleep(2000);
       WebElement closeBtn1=driver.findElement(By.xpath("//span[@role='presentation']"));
       closeBtn1.click();
       Thread.sleep(1000);
        WebElement closeBtn2 =driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/p"));
        closeBtn2.click();
        try{
            WebElement closeBtn3=driver.findElement(By.xpath("//div[@class='tooltipInfo']"));
            if(closeBtn3.isDisplayed()){
                driver.findElement(By.xpath("//span[@class='coachmark']")).click();
            }
            System.out.println("ele found");
        } catch (Exception e) {
            System.out.println("Exception occur in ele");
        }
        Thread.sleep(1000);
        //Task 2-->
        //input[@id='fromCity']
        WebElement fromInput =driver.findElement(By.xpath(" //input[@id='fromCity']  "));
        fromInput.click();

        Thread.sleep(1000);
        WebElement fromPlaceholder =driver.findElement(By.xpath(" //input[@placeholder='From']  "));
        fromPlaceholder.sendKeys("India");

        Thread.sleep(2000);
        List<WebElement> listBox= driver.findElements(By.xpath("//span[@class='revampedIataText']"));

        Thread.sleep(2000);
        Actions action=new Actions(driver);




        for(WebElement code:listBox){
            String text=code.getText();
//            System.out.println("code-->"+code);
            if(text.equalsIgnoreCase("CCU")){
                action.moveToElement(code).click().build().perform();
                break;
            }
        }

        Thread.sleep(1000);
        WebElement fromInput2 =driver.findElement(By.xpath("//input[@id='toCity']"));
        fromInput2.click();
        System.out.println("fromInput2-->"+fromInput2.getText());
        Thread.sleep(1000);
        WebElement fromPlaceholder2 =driver.findElement(By.xpath("//input[@placeholder='To']"));
        fromPlaceholder2.sendKeys("India");

        System.out.println("fromInput2-->"+fromPlaceholder2);

        Thread.sleep(2000);
        List<WebElement> listBox2= driver.findElements(By.xpath("//ul[@role='listbox']/li"));

        Thread.sleep(2000);




        for(WebElement list:listBox2){
            WebElement span=list.findElement(By.tagName("span"));
            String text=span.getText();
//            System.out.println("code-->"+code);
            if(text.equalsIgnoreCase("DEL")){
                action.moveToElement(list).click().build().perform();
                break;
            }
        }

        ////div[@tabindex='0']

       //driver.quit();
    }


}
