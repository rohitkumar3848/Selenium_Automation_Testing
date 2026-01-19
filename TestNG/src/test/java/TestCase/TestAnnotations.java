package TestCase;

import com.beust.jcommander.Parameter;
import org.testng.annotations.*;

public class TestAnnotations {


    // Order -- BSuite --> BTest --> BClass --> BMethod --> test1 --> AMethod BMethod --> test2 --> AMethod --> AClass --> ATest --> ASuite
//    Before Suite
//    Before Test
//    Before Class
//    Before Method
//    test1
//    After Method
//    Before Method
//    test2
//    After Method
//    After Class
//    After Test
//    After Suite

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Parameters("browser")
    @Test(priority = 1)
    public void test1(String browser){
        System.out.println("test1"+ browser);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("test2");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
