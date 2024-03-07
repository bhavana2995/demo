package com.argos.org.Utils;

import com.argos.org.Driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverManager driverManager=new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.maximizeBrowser();
        driverManager.openUrl();
        driverManager.acceptCookies();
    }

    @After
     public void tearDown(){
        driverManager.closeBrowser();
     }
}
