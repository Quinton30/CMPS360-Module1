/** A product in a store's inventory, with encapsulated product information. */
public class Product {
    private String name;
    private double price;
    private int quantity;

    // Initialize a Product with its name, unit price and number of items.
    public Product(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be blank.");
        }
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity cannot be negative.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate the dollar value of all units of this product in stock.
    public double calculateInventoryValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
