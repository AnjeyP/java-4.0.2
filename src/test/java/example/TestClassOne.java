package test.java.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassOne {
    @BeforeMethod(groups = "setupGroup")
    public void setupGroupMethod() {
        System.out.println("Setup for test group");
    }

    @AfterMethod(groups = "teardownGroup", enabled = false)
    public void excludedTeardownMethod() {
        System.out.println("Teardown for test group (excluded)");
    }

    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Method1 Execution");
    }

    @Test(groups = "group2")
    public void testMethod2() {
        System.out.println("Method2 Execution");
    }

    @Test(groups = "group3")
    public void testMethod3() {
        System.out.println("Method3 Execution");
    }

    @Test(groups = "group4")
    public void testMethod4() {
        System.out.println("Method4 Execution");
    }
}
