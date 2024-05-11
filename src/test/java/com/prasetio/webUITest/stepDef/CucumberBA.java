package com.prasetio.webUITest.stepDef;

import Test.baseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberBA extends baseTest {
    @Before
    public void beforeTest(){
        getDriver();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
