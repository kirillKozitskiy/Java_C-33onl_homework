package lesson20.homework.lasttask.model;

public class MyMain {
    public static void main(String[] args) {

        Store store = new Store();

        Thread producingThread = new Thread(new Producer(store));
        Thread consumingThread = new Thread(new Consumer(store));

        producingThread.start();
        consumingThread.start();



    }
}
