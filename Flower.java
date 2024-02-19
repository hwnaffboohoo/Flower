
/**
 * Program Description: To define the attribute (instance variables) and behaviors (instance methods) of a class named Flower.
 *
 * Programmer: HANA
 * Date: 19 February 2024
 */
public class Flower {
    // Declaration of the instance variables.
    // Attributes.
    private String name;
    private String color;
    private double price;
    private int quantity;

    // Constructor w/o parameters.
    public Flower() {
        // Default constructor
    } // end of constructor.

    // Constructor with parameters.
    public Flower(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    } // end of constructor.

    // Accessor for all attributes(getFlower).
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    } // end of accessor.

    // Mutator for all attributes(setFlower).
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } // end of mutator.

    // toString method to display flower details
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    } // end of toString.
} // end of main
