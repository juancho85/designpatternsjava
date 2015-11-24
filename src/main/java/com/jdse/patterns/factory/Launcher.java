package com.jdse.patterns.factory;


public class Launcher {

    public static void main(String[] args) {
	PenFactory factory = new PenFactory();
	
	Pen blue = factory.getPen(PenType.BLUE);
	blue.draw();
	
	Pen red = factory.getPen(PenType.RED);
	red.draw();
    }

}
