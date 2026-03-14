import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add some initial elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Element to append
        String elementToAppend = "Grapes";

        // Append the specified element
        set.add(elementToAppend);

        // Display the HashSet
        System.out.println("HashSet after appending: " + set);
    }
}