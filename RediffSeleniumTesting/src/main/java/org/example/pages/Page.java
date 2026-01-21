package org.example.pages;

import org.example.locators.Locator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.example.browser.Browser.driver;

public class Page {
    Locator locator;
    public Page(){
        this.locator= new Locator();
        PageFactory.initElements(driver,this.locator);
    }

    public void actionOnData(){
        this.locator.signBtn.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("alertText"+alertText);
        alert.accept();
        String expectedLoginAlert = "Please enter a valid user name"; // Update if different
        if (alertText.equals(expectedLoginAlert)) {
            System.out.println("Login alert verification PASSED");

        } else {
            System.out.println("Login alert verification FAILED");
        }
        driver.findElement(By.className("forgot-link")).click();
        driver.findElement(By.className("signin-btn")).click();

        // Handle forgot password alert
        Alert forgotAlert = driver.switchTo().alert();
        String forgotAlertText = forgotAlert.getText();
        forgotAlert.accept();
        System.out.println("Forgot Password Alert Text: " + forgotAlertText);

        // Verify forgot password alert text
        String expectedForgotAlert = "Please enter your email ID"; // Update if different
        if (forgotAlertText.equals(expectedForgotAlert)) {
            System.out.println("Forgot Password alert verification PASSED");
        } else {
            System.out.println("Forgot Password alert verification FAILED");
        }

    }
}
