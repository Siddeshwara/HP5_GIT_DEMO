package Selenium_Commands;

import org.testng.annotations.Test;

public class TestNG_Basic {


    @Test(priority = 1)
    public void openBrowser()
    {
        System.out.println("Open Browser");
    }

    @Test(priority = 0)
    public void login()
    {
        System.out.println("Login");
    }

    @Test(priority = 3)
    public void logout()
    {
        System.out.println("Logout");
    }
}
