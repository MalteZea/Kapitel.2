import java.util.Scanner;

public class S2_1 {
    public static void main(String[] args) {
        System.out.print("Please input the miles for conversion:");

        Scanner indput = new Scanner(System.in);

        double converter = indput.nextDouble() * 1.6;

        System.out.println("The input in kilometers is: " + (int) (converter * 100 + 0.5) / 100.0);
    }

}
