package com.compan;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food=food;
        this.location=location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise(){
        System.out.println(" Animal ");
    }
    void eat(){
        System.out.println(" Animal eat...");
    }
    void sleep() {
        System.out.println("Animal sleep");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
