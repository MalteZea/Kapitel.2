import java.util.Scanner;

public class S2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minutes you want converted to years: ");
        int minutes = input.nextInt();

        int days = minutes / (60 * 24);

        int resDays = days % 365;

        int years = days / 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + resDays + " days");
        }

    }
