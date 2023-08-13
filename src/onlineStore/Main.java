package onlineStore;

import onlineStore.abstractClasses.BasicProduct;
import onlineStore.concreteClasses.Barbie;
import onlineStore.concreteClasses.Computer;
import onlineStore.concreteClasses.Dress;
import onlineStore.concreteClasses.HarryPotterBook;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to our online store!");

        System.out.println();
        BasicProduct barbie = new Barbie("Skating Barbie", "Skating Barbie, released in 1994, captured the joy and elegance of ice skating. Dressed in a stylish ice-skating outfit, this Barbie doll brought the world of figure skating to life.", "Mattel", 2, 12.40, "Plastic");
        barbie.showProductDetails();
        double totalPrice = barbie.calculatePrice();
        System.out.println("Total price: $" + totalPrice);
        System.out.println();

        BasicProduct computer = new Computer("Macbook", "The Apple MacBook Pro 13.3 is a premium laptop designed by Apple that combines power and portability. With a 13.3-inch screen, it provides a clear and vibrant visual experience. Powered by the latest-generation processors, it delivers fast and efficient performance for demanding tasks.", "Apple", 1, 1200.00, "Bluetooth");
        computer.showProductDetails();
        double totalPrice2 = computer.calculatePrice();
        System.out.println("Total price: $" + totalPrice2);
        System.out.println();

        BasicProduct dress = new Dress("Spring Floral Dress", "The \"Spring Floral Dress\" is a charming and elegant dress perfect for the warmer months. Its vibrant floral pattern adds a touch of freshness and color, while the lightweight fabric ensures comfort and ease of movement.", "Zara", 3, 40.0, "S");
        dress.showProductDetails();
        double totalPrice3 = dress.calculatePrice();
        System.out.println("Total price: $" + totalPrice3);
        System.out.println();

        BasicProduct harry = new HarryPotterBook("Harry Potter and the Chamber of Secrets", "The story follows young wizard Harry Potter as he returns to Hogwarts School of Witchcraft and Wizardry for his second year. Mysterious events unfold as the Chamber of Secrets is opened, revealing ancient secrets and unleashing dark forces.", "Bloomsbury", 5, 8.0, "J.K. Rowling");
        harry.showProductDetails();
        double totalPrice4 = harry.calculatePrice();
        System.out.println("Total price: $" + totalPrice4);

        System.out.println("---------END----------");

    }
}
