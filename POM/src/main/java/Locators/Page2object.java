package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Browser.browser.driver;

public class Page2object {
    static By fullName=By.xpath("//input[@placeholder='Enter your full name']");
    static By rediffmail=By.xpath("//input[@placeholder='Enter Rediffmail ID']");
    static By availBtn=By.xpath("//input[@class='btn_checkavail button']");
    public static By existMsg=By.xpath("//div[@class=\"msgInf\"]//span");
    public static By succeedMsg=By.xpath("//div[@id=\"check_availability\"]/div/span");

    public static WebElement getFullName(){
        WebElement fullNameEle=driver.findElement(fullName);
        return  fullNameEle;
    }
    public static WebElement getRediffEmail(){
        WebElement rediffEmailEle=driver.findElement(rediffmail);
        return  rediffEmailEle;
    }
    public static WebElement getAvailBtn(){
        WebElement availBtnEle=driver.findElement(availBtn);
        return  availBtnEle;
    }
    public static WebElement getExistMsg(){
        WebElement existMsgEle=driver.findElement(existMsg);
        System.out.println("getting the exist ele-->"+existMsgEle);
        return existMsgEle;
    }
    public static WebElement getSucceedMsg(){
        WebElement succeedMsgEle=driver.findElement(succeedMsg);
        System.out.println("getting the succeed ele-->"+succeedMsgEle);
        return succeedMsgEle;
    }
}
