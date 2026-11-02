import javax.swing.JOptionPane;

/** CMPS 360 - Assignment 2: inventory report in console and graphical dialog. */
public class InventoryApp {
    public static void main(String[] args) {
        // Create two separate Product objects from the Product class.
        Product keyboard = new Product("Mechanical Keyboard", 74.50, 8);
        Product headset = new Product("Gaming Headset", 59.99, 6);

        // Calculate each product's inventory value and the total value.
        double keyboardValue = keyboard.calculateInventoryValue();
        double headsetValue = headset.calculateInventoryValue();
        double totalValue = keyboardValue + headsetValue;

        // Make one clear report for console output and the GUI dialog.
        String report = String.format(
                "Product: %s | Unit Price: $%.2f | Quantity: %d | Value: $%.2f%n" +
                "Product: %s | Unit Price: $%.2f | Quantity: %d | Value: $%.2f%n" +
                "Total Inventory Value: $%.2f",
                keyboard.getName(), keyboard.getPrice(), keyboard.getQuantity(), keyboardValue,
                headset.getName(), headset.getPrice(), headset.getQuantity(), headsetValue,
                totalValue);

        System.out.println("=== Store Inventory Report ===");
        System.out.println(report);

        // Show the same product-by-product summary in a graphical dialog.
        JOptionPane.showMessageDialog(null, report,
                "Inventory Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}
