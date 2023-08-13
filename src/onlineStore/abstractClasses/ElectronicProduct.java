package onlineStore.abstractClasses;

import onlineStore.abstractClasses.BasicProduct;

public abstract class ElectronicProduct extends BasicProduct {

    private String connectionType;

    public ElectronicProduct(String name, String description, String brand, int quantity, double price, String connectionType) {
        super(name, description, brand, quantity, price);
        this.connectionType = connectionType;
    }

    public String getConnectionType() {
        return connectionType;
    }
}
