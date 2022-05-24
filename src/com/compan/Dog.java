package com.compan;

public class Dog extends Animal{
    private String  name;



    public Dog(String name, String food, String location) {
        super(food,location);
        this.name = name;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void makeNoise() {
        System.out.println(name+ " is gav gav");
    }

    void eat() {
        System.out.println(name+ " eat ");
    }


    void sleep() {
        System.out.println(name+ " sleep");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
