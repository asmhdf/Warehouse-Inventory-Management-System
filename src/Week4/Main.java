package Week4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WarehouseInventory inventory = new WarehouseInventory();

        // Add products
        inventory.addProduct(101, "Apple", 50);
        inventory.addProduct(102, "Banana", 30);
        inventory.addProduct(103, "Orange", 20);

        // Lookup a product by ID
        inventory.lookupProduct(102);

        // Sort and print products by name
        inventory.sortAndPrintProducts();

        // Record daily shipments
        inventory.recordShipment(Arrays.asList(101, 103, 102));

        // Print daily shipments
        inventory.printDailyShipments();
    }
}