package onlineStore.concreteClasses;

import onlineStore.abstractClasses.ClothingProduct;

public class Dress extends ClothingProduct {

    public Dress(String name, String description, String brand, int quantity, double price, String size) {
        super(name, description, brand, quantity, price, size);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = (getPrice() * getQuantity()) * 1.08; //Applying an 8% tax
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @Override
    public void showProductDetails() {
        System.out.println("Product name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Brand: " + getBrand());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + getSize());
    }
}
