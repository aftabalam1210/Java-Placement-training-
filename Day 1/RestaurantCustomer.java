//creae acustomer service centre where waiter will keep on taking order from customer until customweer says done.
//print the menue with aleast 6 items customwer will choose from that menu and in case of no order will give 0. aftr complition provide the customer with a bill also.

import java.util.Scanner;

public class RestaurantCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {"Burger", "Pizza", "Pasta", "Salad", "Soda", "Coffee"};
        double[] menuPrices = {5.99, 8.99, 7.49, 4.99, 1.99, 2.49};
        double total = 0.0;

        System.out.println("Welcome to the Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", (i + 1), menuItems[i], menuPrices[i]);
        }

        while (true) {
            System.out.print("Enter item number to order (or '0' to finish): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 0) {
                break;
            } else if (itemNumber >= 1 && itemNumber <= menuItems.length) {
                System.out.print("How many? ");
                int quantity = scanner.nextInt();
                total += menuPrices[itemNumber - 1] * quantity;
                System.out.println("Added " + quantity + " x " + menuItems[itemNumber - 1]);
            } else {
                System.out.println("Invalid item number. Try again.");
            }
        }

        System.out.printf("Your total bill is: $%.2f\n", total);
        scanner.close();
    }
}
