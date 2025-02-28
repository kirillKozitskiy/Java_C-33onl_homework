package lesson20.homework.lasttask.model;

public class Producer implements Runnable {

    private final Store store;
    private final ProductMessageFactory productMessageFactory;

    public Producer(Store store) {
        this.store = store;
        this.productMessageFactory = new ProductMessageFactory();
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try{
                Product product = this.productMessageFactory.createProductMessage();
                this.store.addProductToTheStore(product);
                Thread.sleep(2000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }

    }
}
