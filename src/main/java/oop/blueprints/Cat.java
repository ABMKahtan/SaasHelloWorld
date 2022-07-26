package oop.blueprints;

public final class Cat extends Animal{
    //Attributes
    int legs;
    boolean hasTail;
    String furCol;

    //Constructor
    public Cat(String myName, String myDiet, String myGender, int mySize, float myTopSpeed, String myFurCol) {
        super(myName, myDiet, myGender, mySize, myTopSpeed);
        this.legs = 4;
        this.hasTail = true;
        this.furCol = myFurCol;
    }

    //Methods
    @Override
    public String animalSpeak(){
        return "Meow";

    }
}
