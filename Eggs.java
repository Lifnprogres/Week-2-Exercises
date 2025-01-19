import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        // Prices
        double pricePerDozen = 3.25;
        double pricePerEgg = 0.45;

        // Create a scanner to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of eggs
        System.out.print("Enter the number of eggs you want to order: ");
        int totalEggs = input.nextInt();

        // Calculate dozens and loose eggs
        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        // Calculate the total cost
        double totalCost = (dozens * pricePerDozen) + (looseEggs * pricePerEgg);

        // Display the result with a full explanation
        System.out.printf("You ordered %d eggs.\n", totalEggs);
        System.out.printf("That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each.\n",
                dozens, pricePerDozen, looseEggs, pricePerEgg * 100);
        System.out.printf("Your total is $%.2f.\n", totalCost);
    }
}
