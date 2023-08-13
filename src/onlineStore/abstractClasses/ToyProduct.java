package onlineStore.abstractClasses;

import onlineStore.abstractClasses.BasicProduct;

public abstract class ToyProduct extends BasicProduct {

    private String material;

    public ToyProduct(String name, String description, String brand, int quantity, double price, String material) {
        super(name, description, brand, quantity, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
