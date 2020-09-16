import java.util.Scanner;

public class Refactoring2 {

    public static void main(String[] args) {

        System.out.println("Momsen er " + plusMoms() + "kr");
    }
    public static double plusMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indfør købssum: ");
        double købssum = input.nextDouble();
        double moms = købssum * 0.25;
        return moms;
    };
}