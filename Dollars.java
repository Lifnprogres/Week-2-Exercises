import java.util.Scanner;

public class Dollars {

    public static void main(String[] args) {
        int amount = getAmountFromUser(); // Get user input
        calculateAndDisplayCurrencyBreakdown(amount); // Calculate and display breakdown
    }

    private static int getAmountFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars: ");
        return input.nextInt();
    }

    private static void calculateAndDisplayCurrencyBreakdown(int amount) {
        int twenties = amount / 20;
        amount %= 20; // Remaining amount after 20s
        int tens = amount / 10;
        amount %= 10; // Remaining amount after 10s
        int fives = amount / 5;
        amount %= 5; // Remaining amount after 5s
        int ones = amount; // Remaining amount after 1s

        System.out.println("Currency breakdown:");
        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);
    }
}
