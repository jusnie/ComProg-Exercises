import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input votes 
        System.out.print("Enter votes for Awbrey in New York: ");
        int nyAwbrey = input.nextInt();
        System.out.print("Enter votes for Martinez in New York: ");
        int nyMartinez = input.nextInt();

        System.out.print("Enter votes for Awbrey in New Jersey: ");
        int njAwbrey = input.nextInt();
        System.out.print("Enter votes for Martinez in New Jersey: ");
        int njMartinez = input.nextInt();

        System.out.print("Enter votes for Awbrey in Connecticut: ");
        int ctAwbrey = input.nextInt();
        System.out.print("Enter votes for Martinez in Connecticut: ");
        int ctMartinez = input.nextInt();

        // Total votes
        int totalAwbrey = nyAwbrey + njAwbrey + ctAwbrey;
        int totalMartinez = nyMartinez + njMartinez + ctMartinez;
        int totalVotes = totalAwbrey + totalMartinez;

        // Percentages
        double percentAwbrey = (totalAwbrey * 100.0) / totalVotes;
        double percentMartinez = (totalMartinez * 100.0) / totalVotes;

        // Display results
        System.out.println("\nCandidate   Votes     Percentage");
        System.out.printf("Awbrey      %d       %.2f%%\n", totalAwbrey, percentAwbrey);
        System.out.printf("Martinez    %d       %.2f%%\n", totalMartinez, percentMartinez);
        System.out.print("o----------------------------o");
        System.out.println();
        System.out.println("TOTAL VOTES: " + totalVotes);

        input.close();
    }
    }
