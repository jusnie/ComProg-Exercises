import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.69;
        final double SODA_PRICE = 0.69;
        final double TAX_RATE = 0.065;
        System.out.println(" o-----------------------o");
        System.out.print(" Enter the number of burgers: ");
        int burgers = scanner.nextInt();
        System.out.println();

        System.out.print(" Enter the number of fries: ");
        int fries = scanner.nextInt();
        System.out.println();

        System.out.print(" Enter the number of sodas: ");
        int sodas = scanner.nextInt();
        System.out.println();

        double subtotal = (burgers * BURGER_PRICE) + (fries * FRIES_PRICE) + (sodas * SODA_PRICE);
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        System.out.println(" o-------------------------o");
        System.out.println(" Total before tax: $" + String.format("%.2f", subtotal));
        System.out.println(" Tax: $" + String.format("%.2f", tax));
        System.out.println(" Final total: $" + String.format("%.2f", total));
        System.out.println();
        System.out.println("o------------------------o");
        System.out.print(" Enter amount tendered: ");
        double amountTendered = scanner.nextDouble();

        System.out.println(" Change: $" + String.format("%.2f", amountTendered - total));

        scanner.close();
     //
    }
    }
