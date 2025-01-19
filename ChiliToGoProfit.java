import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Prices for meals
        double adultMealPrice = 7.0;
        double childMealPrice = 4.0;

        // Costs to produce meals
        double adultMealCost = 4.35;
        double childMealCost = 3.10;

        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of adult meals ordered
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = input.nextInt();

        // Prompt the user for the number of child meals ordered
        System.out.print("Enter the number of children's meals ordered: ");
        int childMeals = input.nextInt();

        // Calculate total revenue for meals
        double totalAdultRevenue = adultMeals * adultMealPrice;
        double totalChildRevenue = childMeals * childMealPrice;

        // Calculate total costs for meals
        double totalAdultCost = adultMeals * adultMealCost;
        double totalChildCost = childMeals * childMealCost;

        // Calculate profits
        double totalAdultProfit = totalAdultRevenue - totalAdultCost;
        double totalChildProfit = totalChildRevenue - totalChildCost;
        double totalProfit = totalAdultProfit + totalChildProfit;

        // Display the results
        System.out.printf("Total revenue for adult meals: $%.2f\n", totalAdultRevenue);
        System.out.printf("Total profit for adult meals: $%.2f\n", totalAdultProfit);
        System.out.printf("Total revenue for children's meals: $%.2f\n", totalChildRevenue);
        System.out.printf("Total profit for children's meals: $%.2f\n", totalChildProfit);
        System.out.printf("Grand total profit: $%.2f\n", totalProfit);
    }
}
