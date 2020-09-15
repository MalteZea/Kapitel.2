import java.util.Scanner;
import java.text.DecimalFormat;

public class S2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subTotal = input.nextDouble();

        System.out.print("Enter a gratuity rate: ");
        double gratuityRate = input.nextDouble();

        DecimalFormat df = new DecimalFormat("0.##");

        double gratuity = ((subTotal / 100.0) * gratuityRate);
        String formatGratuity = df.format(gratuity);

        double total = gratuity + subTotal;
        String formatTotal = df.format(total);

        System.out.println("The gratuity is $" + formatGratuity + " and the total is $"+ formatTotal);

    }
}
