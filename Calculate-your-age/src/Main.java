
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Birth Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your Birth Month: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your Birth Day: ");
        int birthDay = scanner.nextInt();

        Calendar today = Calendar.getInstance();
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(birthYear, birthMonth, birthDay);

        int age = today.get(Calendar.YEAR)
                - birthCalendar.get(Calendar.YEAR);
        System.out.println("your birth date is " + age);

    }

}
