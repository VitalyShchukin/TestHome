package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppTest {

    private static WebDriver driver;

    @BeforeClass
    public static void startBr() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public static void quitBr() {
        driver.quit();
        System.out.println("tests success");
    }

    @Test
    public void navigationBr() throws InterruptedException {
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf" +
                        " > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"))
                .sendKeys("qwerty"+Keys.ENTER);
    }
}
