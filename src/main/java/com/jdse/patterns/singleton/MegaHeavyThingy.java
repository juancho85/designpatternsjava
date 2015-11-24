package com.jdse.patterns.singleton;

public class MegaHeavyThingy {
    //create an object of SingleObject
    private static MegaHeavyThingy instance = new MegaHeavyThingy();

    //The constructor is private so that no new instances can be created
    private MegaHeavyThingy(){}

    //Get the object which is only created once
    public static MegaHeavyThingy getInstance(){
       return instance;
    }

    public void showMessage(){
       System.out.println("Printing some blabla!");
    }
}
