package lesson20.homework.lasttask.model;

import java.util.Objects;

public class Product {
    private final String nameOfProduct;

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameOfProduct);
    }

    @Override
    public String toString() {
        return nameOfProduct + '\'';
    }
}
