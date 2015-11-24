package com.jdse.patterns.singleton;

public class Launcher {

    public static void main(String[] args) {
	//Get the only object available
	MegaHeavyThingy object = MegaHeavyThingy.getInstance();
	//show the message
	object.showMessage();
    }

}
