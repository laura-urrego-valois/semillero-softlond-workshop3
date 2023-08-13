package onlineStore.abstractClasses;

import onlineStore.abstractClasses.BasicProduct;

public abstract class BookProduct extends BasicProduct {

    public String author;

    public BookProduct(String name, String description, String brand, int quantity, double price, String author) {
        super(name, description, brand, quantity, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
