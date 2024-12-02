package test.java.example;

import org.testng.annotations.Test;

public class TestClassThree {
    @Test(priority = 3)
    public void testC() {
        System.out.println("C executed");
    }

    @Test(priority = 2)
    public void testB() {
        System.out.println("B executed");
    }

    @Test(priority = 6)
    public void testF() {
        System.out.println("F executed");
    }

    @Test(priority = 1)
    public void testA() {
        System.out.println("A executed");
    }

    @Test(priority = 4)
    public void testD() {
        System.out.println("D executed");
    }
}
