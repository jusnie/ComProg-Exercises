import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("(Simple Interest Calcu)");
        System.out.println();
        System.out.println(" - Calculate the amount after the term");
        System.out.println(" -- Calculate the principal needed for a target amount");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            // PART A
            System.out.print("Enter the principal: ");
            double principal = input.nextDouble();
            System.out.print("Enter the number of years: ");
            int years = input.nextInt();
            System.out.print("Enter the interest rate: ");
            double rate = input.nextDouble();

            double amount = principal * (1 + years * rate);
            System.out.println("The value after the term: " + amount);
        } else if (choice == 2) {
            // PART B
            System.out.print("Enter the desired amount: ");
            double amount = input.nextDouble();
            System.out.print("Enter the number of years: ");
            int years = input.nextInt();
            System.out.print("Enter the interest rate: ");
            double rate = input.nextDouble();

            double principal = amount / (1 + years * rate);
            System.out.println("The principal needed: " + principal);
        } else {
            System.out.println("Invalid choice. Run the program again.");
        }

        input.close();
    }
        }
