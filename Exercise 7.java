import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        System.out.println();
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println();
        System.out.println("The tens-place digit is: " + tens);
        System.out.println();
        System.out.println("The ones-place digit is: " + ones);

        scanner.close();
        //
    }
    }
