package com.datadiveTest;

import com.datadive.base.BaseTest;
import org.testng.annotations.Test;


public class TestRun extends BaseTest {



    @Test
    public void firstTryTestRunChrome(){



        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.quit();

    }
    @Test
    public void firstTryTestRunFirefox(){




        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.quit();

    }

    @Test
    public void firstTryTestRunChromeHeadless(){


        log.info("Test 1 2 3");
        log.info("Message");

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.quit();
    }
    @Test
    public void firstTryTestRunFirefoxHeadless(){

        log.info("Test 1 2 3");

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.quit();

    }
}
