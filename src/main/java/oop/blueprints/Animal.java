package oop.blueprints;

public abstract class Animal {

    // Attributes
    private String animalName;
    private int size;
    private int age;
    private String gender;
    private String diet;
    private float topSpeed;

    // Constructor
    public Animal(String myName, String myDiet, String myGender, int mySize, float myTopSpeed){
        setAnimalName(myName);
        setDiet(myDiet);
        setGender(myGender);
        setAge(0);
        setSize(mySize);
        setTopSpeed(myTopSpeed);
    }

    // Methods
    public String animalSpeak(){
        return "The animal has spoken";
    }

    public void animalShit(){
        this.size -= 2;
        this.topSpeed += 2;
    }

    public void animalEat(){
        animalDrink();
        this.size += 2;
        this.topSpeed -=2;
    }

    public void animalDrink(){
        this.size++;
    }

    public String animalSleep(){
        return "zzzzzzzzzzzz";
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiet() {
        return this.diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getAnimalInfo(){
        String animalInfo = "Animal Name: " + this.animalName + "\nAnimal Diet: " + this.diet + "\nAnimal Gender: " + this.gender;
        return animalInfo;
    }
    public void birthday(){
        this.age++;
    }
}
