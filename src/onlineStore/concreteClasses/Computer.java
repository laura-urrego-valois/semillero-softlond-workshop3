package onlineStore.concreteClasses;

import onlineStore.abstractClasses.ElectronicProduct;

public class Computer extends ElectronicProduct {

    public Computer(String name, String description, String brand, int quantity, double price, String connectionType) {
        super(name, description, brand, quantity, price, connectionType);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = (getPrice() * getQuantity()) * 1.12; //Applying a 12% tax
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @Override
    public void showProductDetails() {
        System.out.println("Product name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Brand: " + getBrand());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: $" + getPrice());
        System.out.println("Connection type: " + getConnectionType());
    }
}
