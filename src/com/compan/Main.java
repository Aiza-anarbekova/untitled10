package com.compan;

public class Main {

    public static void main(String[] args) {
        Animal[] animals={new Dog("Bobik","et","Bishkek"),
                          new Cat("Cat","mouse","osh"),
                          new Horse("Horse","chop","naryn")
                          };
        Veterinar veterinar=new Veterinar();
        for (Animal an:animals){
            veterinar.treatAnimal(an);
            an.eat();
            an.sleep();
            an.makeNoise();
        }
              {

        }



    }
}
