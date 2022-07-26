package oop.blueprints;

import com.sun.jdi.connect.Connector;

public class Boat extends Vehicle{
    //Attributes
    float rudder;
    int noOfSales;
    boolean isFloat;
    String boatType;
    float boatSpeed;

    //Constructor
    public Boat(float rudder, int noOfSales, boolean isFloat, String boatType, float boatSpeed){
        this.rudder = rudder;
        this.noOfSales = noOfSales;
        this.isFloat = true;
        this.boatType = boatType;
        this.boatSpeed = boatSpeed;
    }

    //Methods


}
