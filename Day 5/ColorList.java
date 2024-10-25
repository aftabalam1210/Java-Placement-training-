import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        // Create an ArrayList to hold color strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some color strings to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the colors in the collection
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
