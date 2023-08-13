package onlineStore.abstractClasses;

import onlineStore.abstractClasses.BasicProduct;

public abstract class ClothingProduct extends BasicProduct {

    private String size;

    public ClothingProduct(String name, String description, String brand, int quantity, double price, String size) {
        super(name, description, brand, quantity, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
