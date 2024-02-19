
/**
 * Program Description: To demonstrate the implementation of the members of the Flower class.
 *
 * Programmer: HANA
 * Date: 19 February 2024
 */
import java.util.Scanner;

public class FlowerShop {
    private Flower[] inventory;

    public FlowerShop() {
        inventory = new Flower[10]; // Creating an array of Flower objects with a size of 10
    }

    public void addFlowersToInventory() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter details for flower " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            inventory[i] = new Flower(name, color, price, quantity);
        }
    }

    public void displayAllFlowerDetails() {
        System.out.println("Inventory Details:");
        for (Flower flower : inventory) {
            if (flower != null) {
                System.out.println(flower);
            }
        }
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        for (Flower flower : inventory) {
            if (flower != null) {
                totalValue += flower.getPrice() * flower.getQuantity();
            }
        }
        return totalValue;
    }

    public void searchFlowerByName(String name) {
        boolean found = false;
        for (Flower flower : inventory) {
            if (flower != null && flower.getName().equalsIgnoreCase(name)) {
                System.out.println("Flower found:");
                System.out.println(flower);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Flower with name '" + name + "' not found.");
        }
    }

    public void restockFlower(String name, int quantityToAdd) {
        for (Flower flower : inventory) {
            if (flower != null && flower.getName().equalsIgnoreCase(name)) {
                flower.setQuantity(flower.getQuantity() + quantityToAdd);
                System.out.println("Restocked " + quantityToAdd + " " + name);
                return;
            }
        }
        System.out.println("Flower with name '" + name + "' not found.");
    }

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addFlowersToInventory();
        flowerShop.displayAllFlowerDetails();

        // Calculate and display total inventory value
        double totalValue = flowerShop.calculateTotalInventoryValue();
        System.out.println("Total value of inventory: $" + totalValue);

        // Search for a flower by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the flower to search: ");
        String searchName = scanner.nextLine();
        flowerShop.searchFlowerByName(searchName);

        // Restock a flower
        System.out.print("Enter the name of the flower to restock: ");
        String restockName = scanner.nextLine();
        System.out.print("Enter the quantity to add: ");
        int quantityToAdd = scanner.nextInt();
        flowerShop.restockFlower(restockName, quantityToAdd);
        flowerShop.displayAllFlowerDetails();
    }
} // end of main.

