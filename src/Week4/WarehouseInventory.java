package Week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WarehouseInventory {
    private Map<Integer, Product> productMap; // HashMap for product storage
    private List<Integer> dailyShipments;    // ArrayList for shipments

    public WarehouseInventory() {
        productMap = new HashMap<>();
        dailyShipments = new ArrayList<>();
    }

    // Add a new product
    public void addProduct(int id, String name, int quantity) {
        if (productMap.containsKey(id)) {
            System.out.println("Product ID " + id + " already exists.");
        } else {
            productMap.put(id, new Product(id, name, quantity));
            System.out.println("Product added: " + name);
        }
    }

    // Look up a product by ID
    public void lookupProduct(int id) {
        if (productMap.containsKey(id)) {
            System.out.println(productMap.get(id));
        } else {
            System.out.println("Product ID " + id + " not found.");
        }
    }

    // Sort products by name and print them
    public void sortAndPrintProducts() {
        List<Product> products = new ArrayList<>(productMap.values());
        products.sort(Comparator.comparing(p -> p.name)); // Sort by name
        products.forEach(System.out::println);
    }

    // Record daily shipments
    public void recordShipment(List<Integer> shipment) {
        dailyShipments.addAll(shipment);
        System.out.println("Shipment recorded: " + shipment);
    }

    // Print daily shipments
    public void printDailyShipments() {
        System.out.println("Daily Shipments: " + dailyShipments);
    }
}
