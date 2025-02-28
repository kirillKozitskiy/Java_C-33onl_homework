package lesson20.homework.lasttask.model;

public class Consumer implements Runnable {

    private final Store store;
    private final ProductMessageFactory productMessageFactory;

    public Consumer(Store store) {
        this.store = store;
        this.productMessageFactory = new ProductMessageFactory();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                store.removeProductFromTheStore();
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }

    }
}
