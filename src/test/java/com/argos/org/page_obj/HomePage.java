package com.argos.org.page_obj;

import com.argos.org.Driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage extends DriverManager {

    public String Itemname="nikee";
    public String searchProduct(){
        driver.findElement(By.id("")).sendKeys(Itemname);
        driver.findElement(By.id("")).click();
        return null;
    }
}
