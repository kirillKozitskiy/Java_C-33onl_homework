package lesson15.homework.realizations;

import java.util.*;

public class SecondTaskRealization {

    private Deque<String> dequeOfUniqueAnimals = new LinkedList<>();

    public SecondTaskRealization() {
        addAnimalName("Eagle");
        addAnimalName("Mammal");
        addAnimalName("Rabbit");

        System.out.println(dequeOfUniqueAnimals);

        removeAnimalNameFromTheEnd();

        System.out.println(dequeOfUniqueAnimals);
    }

    private void addAnimalName(String animalName) {
        dequeOfUniqueAnimals.addFirst(animalName);
    }

    private void removeAnimalNameFromTheEnd() {
        dequeOfUniqueAnimals.removeLast();
    }

    private Scanner inputNameOfAnimal(){
        return new Scanner(System.in);
    }
}
