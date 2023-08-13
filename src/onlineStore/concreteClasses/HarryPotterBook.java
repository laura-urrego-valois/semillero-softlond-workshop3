package onlineStore.concreteClasses;

import onlineStore.abstractClasses.BookProduct;

public class HarryPotterBook extends BookProduct {

    public HarryPotterBook(String name, String description, String brand, int quantity, double price, String author) {
        super(name, description, brand, quantity, price, author);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = (getPrice() * getQuantity()) * 1.04; //Applying a 4% tax
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @Override
    public void showProductDetails() {
        System.out.println("Product name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Brand: " + getBrand());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Author: " + getAuthor());
    }
}
