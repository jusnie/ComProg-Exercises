import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the mass in kilograms: ");
      double mass = scanner.nextDouble();
      
      double energy = mass * 9e16;
      
      System.out.println("Energy(Joules) is: " + energy);
      System.out.print("100W light bulbs powered: " + (energy / 360000));
      scanner.close();
      // On this code we gather some of the idea of an ai on how are we going to compute this
    }
}
