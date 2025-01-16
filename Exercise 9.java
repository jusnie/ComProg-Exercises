import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        int minutes = scanner.nextInt();
        System.out.println();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println("The time is: " + hours + ":" + remainingMinutes);

        scanner.close();
        //
    }
    }
