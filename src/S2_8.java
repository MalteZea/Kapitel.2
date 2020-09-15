import java.util.Scanner;

public class S2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT: ");
        long offset = input.nextLong();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Current local time is " + (currentHour - offset) + ":" + currentMinute + ":" + currentSecond);
    }
}
