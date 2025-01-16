import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the change in cents: ");
     int cents = scanner.nextInt();
     
     System.out.println("Quarters: " +(cents / 25));
     cents %= 25;
     System.out.println("Dimes: " +(cents / 10));
     cents %= 10;
     System.out.println("Nickels: " +(cents / 5));
     System.out.print("Pennies: " +(cents / 5));
     
     scanner.close();
     // 
    }
}     
