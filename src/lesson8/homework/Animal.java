package lesson8.homework;

public abstract class Animal {

    public Animal(){
        System.out.println("\t---Parent method---\nI am an animal");
    }

    protected abstract void voice();

    protected abstract void eat(String food);

}
