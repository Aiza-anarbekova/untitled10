package com.compan;

public class Horse extends Animal{
    private String name;

    public Horse(String name,String food,String location) {
        super(food,location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void makeNoise() {
        System.out.println(name +" make noise");
    }

    @Override
    void eat() {
        System.out.println(name+" eat");
    }

    void sleep() {
        System.out.println(name+" sleep");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
