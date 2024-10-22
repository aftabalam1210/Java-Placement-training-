import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are they anagrams? " + isAnagram);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Normalize the strings
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

