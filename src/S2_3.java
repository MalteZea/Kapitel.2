import java.util.Scanner;

public class S2_3 {
    public static void main(String[] args) {
        System.out.print("Please input the meters for conversion:");

        Scanner indput = new Scanner(System.in);

        double converter = indput.nextDouble() * 3.2786;

        System.out.println("The input in feet is: " + (int) (converter * 100 + 0.5) / 100.0);
    }
}
