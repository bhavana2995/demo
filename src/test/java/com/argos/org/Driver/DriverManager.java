package com.argos.org.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static WebDriver driver;
    String Url="https://www.argos.co.uk/";

public void openBrowser(){
    WebDriverManager.chromedriver().setup();
}
public void maximizeBrowser(){
    driver.manage().window().maximize();
}
public void openUrl(){
    driver.get(Url);
}
public void acceptCookies(){

}
public void closeBrowser(){
   // driver.quit();
}
}
