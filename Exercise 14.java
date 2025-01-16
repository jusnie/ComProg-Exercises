import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entering the users expenses
        System.out.println("Enter your expenses:");
        System.out.print("Tuition: ");
        double tuition = input.nextDouble();
        System.out.print("Books: ");
        double books = input.nextDouble();
        System.out.print("Rent: ");
        double rent = input.nextDouble();
        System.out.print("Other expenses: ");
        double otherExpenses = input.nextDouble();

        // User offset costs
        System.out.println("Enter your offset costs:");
        System.out.print("Scholarships: ");
        double scholarships = input.nextDouble();
        System.out.print("Other discounts: ");
        double otherDiscounts = input.nextDouble();

        // Calculating total expenses and total offsets
        double totalExpenses = tuition + books + rent + otherExpenses;
        double totalOffsets = scholarships + otherDiscounts;
        double totalCost = totalExpense
