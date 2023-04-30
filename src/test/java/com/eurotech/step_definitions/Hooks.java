package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before //JAVA
    public void setup(){

        System.out.println("\t This is coming from Before Methode");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After // JAVA
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
          final   byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    @Before("@db")
    public void setupDB(){
        System.out.println("\t connection DB");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("Disconnetion DB");
    }

}
