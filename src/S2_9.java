import java.text.DecimalFormat;
import java.util.Scanner;

public class S2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0:");
        double v0 = input.nextDouble();

        System.out.print("v1:      ");
        double v1 = input.nextDouble();

        System.out.print("t:       ");
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        DecimalFormat df = new DecimalFormat("0.##");
        String formatA = df.format(a);

        System.out.println("The average acceleration is " + formatA);
    }
}
