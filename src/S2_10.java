import java.util.Scanner;

public class S2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input amount of water, initial and final temperature
        System.out.print("Enter the amount of water in kilograms: ");
        double waterAmount = input.nextDouble();

        System.out.print("Enter the initial temperature of the water: ");
        double waterInitialTemp = input.nextDouble();

        System.out.print("Enter the final temperature of the water: ");
        double waterMaxTemp = input.nextDouble();

        double q = waterAmount * (waterMaxTemp - waterInitialTemp) * 4184;

        System.out.println("The energy needed is " + q);
    }
}
