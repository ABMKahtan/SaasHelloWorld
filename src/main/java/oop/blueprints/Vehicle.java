package oop.blueprints;

public abstract class Vehicle {
    //Attributes
    private float topSpeed;
    boolean hasRoof;
    int totalWheels;
    int maxCapa;
    String colour;
    String fuelType;
    float price;
    float weight;
    String terrainType;
    String manufacturer;
    boolean engineOn;
    float currentSpeed;
    String model;

    //Methods
    public boolean switchEngine(){
        this.engineOn = !this.engineOn;
        return this.engineOn;
    }

    public void slowDown(){
        this.currentSpeed -= 10;
    }

    public String horn(){

        return "honk!";
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public int getTotalWheels() {
        return totalWheels;
    }

    public void setTotalWheels(int totalWheels) {
        this.totalWheels = totalWheels;
    }

    public int getMaxCapa() {
        return maxCapa;
    }

    public void setMaxCapa(int maxCapa) {
        this.maxCapa = maxCapa;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
