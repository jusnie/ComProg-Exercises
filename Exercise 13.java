import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("    (Spending) ");
        System.out.println("o-----------------o");
         System.out.print(" Food: ");
         int food = input.nextInt();
         System.out.print(" Clothing: ");
         int clothing = input.nextInt();
         System.out.print(" Entertainment: ");
         int entertainment = input.nextInt(); 
         System.out.print(" Rent: ");
         int rent = input.nextInt();
         int total = food + clothing + entertainment + rent;
         System.out.print("o----------------------------o");
         System.out.println();
         System.out.print(" Category\t   Budget");
         System.out.print("\n Food:      \t"+(food * 100/total)+"%");
         System.out.print("\n Clothing:     \t"+(clothing * 100/total)+"%");
         System.out.print("\n Entertainment: "+(entertainment * 100/total)+"%");
         System.out.print("\n Rent:        \t"+(rent * 100/total)+"%");
        //
    }
}    
