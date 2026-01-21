package testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void setUp(){
        System.out.println("setUp in Test1");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }

    @AfterMethod
    public void after(){
        System.out.println("After test1");
    }
}
