import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        // Prices for meals
        double adultMealPrice = 7.0;
        double childMealPrice = 4.0;

        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of adult meals ordered
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = input.nextInt();

        // Prompt the user for the number of child meals ordered
        System.out.print("Enter the number of children's meals ordered: ");
        int childMeals = input.nextInt();

        // Calculate total money collected
        double totalAdultMeals = adultMeals * adultMealPrice;
        double totalChildMeals = childMeals * childMealPrice;
        double totalMeals = totalAdultMeals + totalChildMeals;

        // Display the results
        System.out.printf("Total money collected for adult meals: $%.2f\n", totalAdultMeals);
        System.out.printf("Total money collected for children's meals: $%.2f\n", totalChildMeals);
        System.out.printf("Total money collected for all meals: $%.2f\n", totalMeals);
    }
}
