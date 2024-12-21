package lesson8.homework.Animals;

import lesson8.homework.Animal;

public class Dog extends Animal {



    protected Dog(){
        super();
        voice();
        eat("Meat");
    }

    final String FOOD = "Meat";

    @Override
    protected void voice() {
        System.out.println("Bow-bow");
    }

    @Override
    protected void eat(String food) {
        if(FOOD.equals(food)) {
            System.out.println("I like Meat because I am Dog");
        }
        else {
            System.out.println("As far as I am concern, I don't like " +food);
        }
    }

    public static Dog createDog(){
        return new Dog();
    }



}
