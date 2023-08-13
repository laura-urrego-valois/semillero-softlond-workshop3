package onlineStore.abstractClasses;

import onlineStore.interfaces.IProduct;

public abstract class BasicProduct implements IProduct {

    private String name;
    private String description;
    private String brand;
    private int quantity;
    private double price;

    public BasicProduct(String name, String description, String brand, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
