import java.util.Scanner;

public class Refactoring3 {

    public static void main(String[] args) {

        plusTyskMoms();
    }
    public static void plusTyskMoms() {

        System.out.print("Indfør købssum: ");
        Scanner input = new Scanner(System.in);
        double købssum = input.nextDouble();
        double moms = købssum * 0.16;
        System.out.println("Momsen er " + (int)(moms * 100) / 100.0 + " euro");
    }

    public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);
        System.out.print("Indfør købssum: ");
        double købssum = input.nextDouble();
        double moms = købssum * 0.25;
        System.out.println("Momsen er " + (int)(moms * 100) / 100.0 + "kr");
    };
}