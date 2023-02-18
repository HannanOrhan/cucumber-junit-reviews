package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class BrowserUtils {
    public static void sleep(int second){
        second = second*1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
