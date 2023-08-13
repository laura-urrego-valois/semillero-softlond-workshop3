package onlineStore.concreteClasses;

import onlineStore.abstractClasses.ToyProduct;

public class Barbie extends ToyProduct {

    public Barbie(String name, String description, String brand, int quantity, double price, String material) {
        super(name, description, brand, quantity, price, material);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = (getPrice() * getQuantity()) * 1.15; //Applying a 15% tax
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @Override
    public void showProductDetails() {
        System.out.println("Product name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Brand: " + getBrand());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Material: " + getMaterial());
    }


}
