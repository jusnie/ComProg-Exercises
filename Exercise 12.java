import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(Project)");
         System.out.println();
        System.out.println("Enter the number of minutes spent on each of the following project task");
        System.out.println();
        System.out.print("Designing: ");
        int designing = input.nextInt();
        System.out.print("Coding: ");
        int coding = input.nextInt();
        System.out.print("Debugging: ");
        int debugging = input.nextInt();
        System.out.print("Testing: ");
        int testing = input.nextInt();

        int total = designing + coding + debugging + testing;
        System.out.println("o------------------------o");
        System.out.println("| Task | \t | Time |");  
        System.out.println("Designing:     \t" + (designing * 100 / total) + "%");
        System.out.println("Coding:        \t" + (coding * 100 / total) + "%");
        System.out.println("Debugging:     \t"     + (debugging * 100 / total) + "%");
        System.out.println("Testing:       \t" + (testing * 100 / total) + "%");
// this code get hard of me I'm trying to figured it out on how to print like a columinized idea
    }
    }
