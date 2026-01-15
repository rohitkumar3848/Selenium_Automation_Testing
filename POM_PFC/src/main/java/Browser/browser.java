package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class browser {
    public  static WebDriver driver;
    public  static WebDriverWait wait;
    public static Actions actions;
    public static Select select;

    //Open the browser on the choice

    public static void openBrowser(String choice)throws Exception{
        try{
            if(choice.equalsIgnoreCase("Chrome")){
                driver=new ChromeDriver();
            } else if(choice.equalsIgnoreCase("Edge")){
                driver=new EdgeDriver();
            }
            else if(choice.equalsIgnoreCase("Firefox")){
                driver=new FirefoxDriver();
            }
        }catch (Exception e){
            System.out.println("--Exception while loading the browser--"+e);
        }
    }

    public static void navigation(String title)throws Exception{
        try{
            driver.get(utility.properties("url"));
            driver.manage().window().maximize();
            actions=new Actions(driver);
            wait=new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.titleIs(title));

        }catch (Exception e){
            System.out.println("--Exception while opening the browser--"+e);
        }
    }
    public static void closeBrowser()throws Exception{
        try{
            driver.close();
        }catch (Exception e){
            System.out.println("--Exception while closing the browser--"+e);
        }
    }
}
