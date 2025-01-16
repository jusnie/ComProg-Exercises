import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.println();

        System.out.print("Enter a second integer: ");
        int num2 = scanner.nextInt();
        System.out.println();
        System.out.println();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
        System.out.println(num2 + " % " + num1 + " = " + (num2 % num1));

        scanner.close();
        //
    }
    }
