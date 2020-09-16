import java.util.Scanner;

public class Refactoring3 {

    public static void main(String[] args) {

        System.out.println("Momsen er " + plusTyskMoms() + " euro");
    }
    public static double plusTyskMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indfør købssum: ");
        double købssum = input.nextDouble();
        double moms = købssum * 0.16;
        return moms;
    };
}