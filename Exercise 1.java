import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a time less than 4.5 seconds: ");
        if (scanner.hasNextDouble()) {
            double time = scanner.nextDouble();
            if (time < 4.5 && time >= 0) {
                double height = 100 - 4.9 * time * time;
                System.out.printf("The height of the object is: %.2f meters%n", height);
            } else {
                System.out.println("Error: the time you input must be a non-negative value like less than 4.5 seconds.");
            }
        } else {
            System.out.println("Error: Please enter a valid number.");
        }

        scanner.close();
// Escaño & Cuenca
// on this first exercise java code problem we managed
// to transfer what we learned in c++ through java program. Thus, the module helps a lot terms on new terminology.
    }
    }
