package com.compan;

public class Cat extends Animal{
    private String name;

    public Cat(String name,String food ,String location) {
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
        System.out.println(name+" meow-meow");
    }

    void eat() {
        System.out.println(name+" eat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

