import java.util.Scanner;

public class Refactoring1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indfør købssum: ");
        double købssum = input.nextDouble();

        double moms = købssum * 0.25;
        System.out.println("Momsen er " + (int)(moms * 100) / 100.0 + "kr");
    }
}