package com.tsi.training;

public class Bat extends Mammal implements Flying{

    private String name;
    private String batType;

    public Bat(String animalType, String mammalName, String catType, String name){
        super(animalType, mammalName);

        this.name = name;
    }

    public Bat(){
        super("Mammal", "Bat");

        this.name = "Boris";
        this.batType = "Vampire";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatType() {
        return batType;
    }

    public void setBatType(String batType) {
        this.batType = batType;
    }
}
