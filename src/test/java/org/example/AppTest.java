package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    private static WebDriver driver;

    @BeforeClass
    public static void startBr() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void quitBr() {
        driver.quit();
        System.out.println("tests success");
    }

    @Test
    public void navigationBr() {
        driver.get("https://www.google.com");
    }
}
