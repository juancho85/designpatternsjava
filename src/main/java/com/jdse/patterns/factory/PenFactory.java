package com.jdse.patterns.factory;

public class PenFactory {
    
    public Pen getPen(PenType penType){
	switch(penType){
	case BLUE:
	    return new BluePen();
	case RED:
	    return new RedPen();
	default:
	    return null;
	}
    }
}
