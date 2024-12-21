package lesson8.homework.Animals;

import lesson8.homework.Animal;

public class Tiger extends Animal {

    public Tiger() {
        super();
        voice();
    }


    final String FOOD = "Meat";

    @Override
    public void voice() {
        System.out.println("I am tiger and when I have a bad day I can roar");
    }

    @Override
    public void eat(String food) {
        if (FOOD.equals(food)) {
            System.out.println("I am a tiger and I like to eat "+ food+"\n");
        }
        else {
            System.out.println("Tigers don't eat "+ food+"\n");
        }

    }
}
