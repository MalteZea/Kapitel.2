import java.util.Scanner;

public class S2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int initialNumber = input.nextInt();

        int firstRes =  (initialNumber % 100) / 10;

        int secondRes = initialNumber % 10;

        int firstMultiply = (initialNumber / 100) * firstRes * secondRes;

        System.out.println(firstMultiply);

    }
}
