import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Our Sleep Program)");
        System.out.println(); 
        System.out.println(" Entering Your Birth Date");
        System.out.println("o------------------------o");
        System.out.println();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();
        System.out.println();
        System.out.println("Entering Today's Year");
        System.out.println("o------------------------o");
        System.out.println();

        System.out.print("Enter today's year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter today's month: ");
        int currentMonth = scanner.nextInt();
        
        System.out.print("Enter today's day: ");
        int currentDay = scanner.nextInt();
        System.out.println();
        System.out.println("O--------------------------O");
        // Assuming 365 days/year and 30 days/month
        int totalDays = ((currentYear - birthYear) * 365) + ((currentMonth - birthMonth) * 30) + (currentDay - birthDay);
        int sleepHours = totalDays * 8;

        System.out.println("You have been alive for " + totalDays + " days.");
        System.out.println("You have slept for almost " + sleepHours + " hours.");

        scanner.close();
        //
    }
    }
