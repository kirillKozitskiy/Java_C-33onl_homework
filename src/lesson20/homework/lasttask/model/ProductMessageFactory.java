package lesson20.homework.lasttask.model;

public class ProductMessageFactory {
    private static final int INITIAL_NEXT_PRODUCT_INDEX = 1;
    private final static String TEMPLATE_OF_PRODUCT_MESSAGE = "Product '%d'";

    private int nextProductIndex;

    public ProductMessageFactory() {
        this.nextProductIndex = INITIAL_NEXT_PRODUCT_INDEX;
    }

    public Product createProductMessage(){
        return new Product(String.format(TEMPLATE_OF_PRODUCT_MESSAGE, this.nextProductIndex++));
    }


}
