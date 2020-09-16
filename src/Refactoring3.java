import java.util.Scanner;

public class Refactoring3 {

    public static void main(String[] args) {

        System.out.println("Momsen er " + (int)(plusTyskMoms() * 100) / 100.0 + " euro");
    }
    public static double plusTyskMoms() {

        System.out.print("Indfør købssum: ");
        Scanner input = new Scanner(System.in);
        double købssum = input.nextDouble();
        double moms = købssum * 0.16;
        return moms;
    }

    public static double plusDanskMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indfør købssum: ");
        double købssum = input.nextDouble();
        double moms = købssum * 0.25;
        return moms;
    };
}