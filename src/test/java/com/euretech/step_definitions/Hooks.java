package com.euretech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class Hooks {

    @Before //JAVA
    public void setup(){
        System.out.println("\t This is coming from Before Methode");
    }
    @After // JAVA
    public void tearDown(){
        System.out.println("\t This is coming from After Methode");
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
