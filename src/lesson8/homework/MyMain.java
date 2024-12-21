package lesson8.homework;

import lesson8.homework.Animals.Dog;
import lesson8.homework.Animals.Rabbit;
import lesson8.homework.Animals.Tiger;

public class MyMain {
    public static void main(String[] args) {

      startProgram();

    }
    public static void startProgram(){

        Tiger tiger = new Tiger();
        tiger.eat("Meat");

        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");

        Dog dog = Dog.createDog();

        




    }
}
