import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter thee total expenses: ");
        double expenses = scanner.nextDouble();
        
        System.out.print("Enter the total offsets ");
        double offsets = scanner.nextDouble();
        
        double totalCost = expenses - offsets;
        
        System.out.print("Your tptal cost for the school year is $" + totalCost);
        scanner.close();
    }
    }
