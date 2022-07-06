package Selenium_Commands;

import org.testng.annotations.Test;

public class TestNG_Demo {

    @Test(priority = 1)
    public void Sum()
    {
    int x = 1;
    int y = 2;
    System.out.println("Addition:  = " + (x+y));
    }

    @Test(priority = 2)
    public void Diff()
    {
        int x = 1;
        int y = 2;
        System.out.println("Subsctract: = " + (x-y));

    }

    @Test (priority = 3)
    public void Multi()
    {
        int x = 1;
        int y = 2;
        System.out.println("Multiply: = "+ (x*y));

    }

    @Test (priority = 4)
    public void Div()
    {
        int x = 10;
        int y = 2;
        System.out.println("Division: " + (x/y));

    }

}
