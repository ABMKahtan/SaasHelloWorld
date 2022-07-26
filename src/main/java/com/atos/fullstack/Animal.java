package com.atos.fullstack;

public abstract class Animal {

    //Attributes
    String name;
    int noOfLegs;
    boolean isVenom;
    String species;
    boolean hasTail;
    int maxSpeed;
    String Diet;
    boolean isEatable;
    int age;
    float howLarge;
    boolean isWarmBlood;
    String Habitat;
    boolean isPredator;
    boolean fulfilment = false;
    boolean isFemale;
    boolean isPreg;

    //Constructor

    //Methods
    public void animalEat(float totalFood){
        this.howLarge += (totalFood*2)/3;
        maxSpeed--;
    }

    public String animalSleep(){
        return "zzzzzzzzzzzz";
    }

    public void breedWith(Animal partner){
        if (this.isFemale != partner.getIsFemale() && this.isFemale){
            this.isPreg = true;
            this.fulfilment = true;

        } else{
            partner.setIsPreg();
            partner.setFulfilment();
        }

    }

    public String breath(){
        return "Deep Breath";
    }

    public void animalShit(){
        this.howLarge /= 6;
        this.maxSpeed++;
    }

    public boolean getIsFemale(){
        return this.isFemale;
    }

    public void setIsPreg(){
        this.isPreg = true;
    }

    public void setFulfilment(){
        this.fulfilment = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}