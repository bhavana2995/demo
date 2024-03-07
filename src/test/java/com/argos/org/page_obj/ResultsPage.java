package com.argos.org.page_obj;

import com.argos.org.Driver.DriverManager;
import org.openqa.selenium.By;

public class ResultsPage extends DriverManager {

    public String ResultsName(){
       return driver.findElement(By.id("searcTerm")).getText();

    }
}
