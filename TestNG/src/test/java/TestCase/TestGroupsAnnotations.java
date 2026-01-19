package TestCase;

import org.testng.annotations.Test;

public class TestGroupsAnnotations {

    @Test(groups = {"Smoke"})
    public void openApplication(){
        System.out.println("Smoke application opened--");
    }

    @Test(groups = {"Smoke","Regression"})
    public void loginTest(){
        System.out.println("Smoke + Regression application opened--");
    }

    @Test(groups = {"Smoke"})
    public void openApplication(){
        System.out.println("Smoke application opened--");
    }
}
