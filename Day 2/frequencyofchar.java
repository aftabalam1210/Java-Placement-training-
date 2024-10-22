import java.util.*;

public class frequencyofchar {
    public static void main(String[] args) {
        String input = "hello world";
        int[] frequency = new int[256]; // Array to hold counts for ASCII characters

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        // Display the frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {

                System.out.println((char)i + ": " + frequency[i]);
            }
        }
    }
}
