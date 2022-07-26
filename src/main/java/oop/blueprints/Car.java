package oop.blueprints;

public class Car extends Vehicle{
    //Attributes
    int noOfDoors;
    int mileage;
    int engineSize;
    int noOfWindows;
    int noOfSeats;
    String bodyStyle;

    //Constructor
    public Car(){
//        this.mileage = 0;
        this.noOfDoors = 4;
//        this.engineSize = engineSize;
//        this.noOfWindows = noOfWindows;
//        this.noOfSeats = noOfSeats;
//        this.bodyStyle = bodyStyle;


    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    //Methods
    @Override
    public String horn(){
        return "UGHHHHHHHHHHHHHHHHHHHHH!";
    }


}
