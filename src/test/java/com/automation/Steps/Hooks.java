package com.automation.Steps;

import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        ConfigReader.initConfig();
        DriverManager.createDriver();
        System.out.println(System.getProperty("userdir"));
    }

    @After
    public void cleanUp() {
//        DriverManager.getDriver().quit();
    }
}
