import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = scanner.nextDouble();

        double cost = 0.75 + 1.00 + 0.05 * diameter * diameter;

        System.out.printf("The cost of making the pizza is: $%.2f%n", cost);

        scanner.close();
// by the part of exercise one we discover on how we compute properly by the help of the youtube pilipino programmers
    }
    }
