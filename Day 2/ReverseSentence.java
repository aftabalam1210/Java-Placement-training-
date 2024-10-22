public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Hello from the other side";
        String reversed = reverseSentence(sentence);
        System.out.println(reversed);
    }

    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Use StringBuilder to reverse the order of words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            // Add a space if it's not the last word
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
