package lesson8.homework.Animals;

import lesson8.homework.Animal;

public class Rabbit extends Animal {

    public Rabbit() {
        super();
        voice();
    }

    final String FOOD = "Grass";

    @Override
    public void voice() {
        System.out.println("I am Rabbit. I like crunching");
    }

    @Override
    public void eat(String food) {
        if (FOOD.equals(food)) {
            System.out.println("I am Rabbit. I like "+food+"\n");
        }else{
            System.out.println("Rabbits don't like "+food+"\n");
        }

    }

}
