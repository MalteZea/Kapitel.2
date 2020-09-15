import java.util.Scanner;
import java.text.DecimalFormat;

public class S2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input square meters: ");
        double squareMeters = input.nextDouble();

        double converterPing = squareMeters * 0.3025;

        DecimalFormat df = new DecimalFormat("0.###");
        String formatConverter = df.format(converterPing);

        System.out.println(squareMeters + " square meters is " + formatConverter + " pings");
    }
}
