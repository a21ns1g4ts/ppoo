
public enum State {
    IN_CART, SOLD, AVAILABLE
}

public class Product {
    int id;         // Integer
    String name;    // String
    float price;    // Floating
    boolean active; // Boolean
    State state;    // Enumm
    char aisle;     // Character
    String[] aisles = {"A", "B", "O", "W"};

    public void setAisle(String aisle) {
        // convert aisles array to list
        List<String> aisles = Arrays.asList(this.aisles);

        if(aisles.contains(aisle)) {
           throw new Exception("Aisle not allowed!");
        }
    }
}