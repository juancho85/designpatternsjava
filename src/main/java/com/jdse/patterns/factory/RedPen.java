package com.jdse.patterns.factory;

public class RedPen implements Pen {

    @Override
    public void draw() {
	System.out.println("Drawing red");
    }

}
