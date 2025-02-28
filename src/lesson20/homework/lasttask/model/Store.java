package lesson20.homework.lasttask.model;

import java.util.ArrayList;

public class Store {

    private final static String TEMPLATE_OF_PRODUCING_MESSAGE = "Product '%s' was produced\n";
    private final static String TEMPLATE_OF_CONSUMING_MESSAGE = "Product '%s' was consumed\n";

    private final static int OPACITY_OF_STORE = 5;
    private final ArrayList<Product> products = new ArrayList<>(OPACITY_OF_STORE);

    public Store() {
    }

    public synchronized void addProductToTheStore(Product product){
        try {
            while(products.size() >= OPACITY_OF_STORE-2){
                System.out.println("Store is full, producer is waiting...");
                wait();
            }
            products.add(product);
            System.out.printf(TEMPLATE_OF_PRODUCING_MESSAGE, product);
            notifyAll();

        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }

    public synchronized void removeProductFromTheStore(){
        try{
            while (products.isEmpty()){
                System.out.println("Store is empty, consumer is waiting...");
                wait();
            }
            Product product = products.remove(0);
            System.out.printf(TEMPLATE_OF_CONSUMING_MESSAGE, product);
            notifyAll();

        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }


    }



}
