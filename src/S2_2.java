import java.util.Scanner;

public class S2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the sides: ");
        double length = input.nextDouble();

        System.out.print("The height of the triangle: ");
        double height = input.nextDouble();

        double area = (Math.sqrt(3) / 4.0) * Math.pow(length, 2);

        double volume = area * height;

        System.out.println("The area of the triangle is: " + (int) (area * 100 + 0.5) / 100.0);

        System.out.println("The volume of the triangle is: " + (int) (volume * 100 + 0.5) / 100.0);
    }
}
