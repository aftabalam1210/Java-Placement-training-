import java.util.Scanner;
public class season {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a month (1-12): ");
            int month = scanner.nextInt();

            String season;

            if (month == 12 || month == 1 || month == 2) {
                season = "Winter";
            } else if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else if (month >= 9 && month <= 11) {
                season = "Fall";
            } else {
                season = "Invalid month. Please enter a number between 1 and 12.";
            }

            System.out.println("The season is: " + season);
            scanner.close();
        }
}


