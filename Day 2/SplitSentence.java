public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a test sentence.";

        // Split the sentence into words using a regular expression
        String[] words = sentence.split("\\s+"); // Splits on whitespace

        // Display the words
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
