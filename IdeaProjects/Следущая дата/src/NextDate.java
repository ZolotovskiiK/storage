import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц ");
        int month = scanner.nextInt();
        System.out.println("Введите год ");
        int year = scanner.nextInt();

        int nextDay;
        int nextMonth;
        int nextYear;
        int daysInMonth;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysInMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            daysInMonth = 29;
        } else {
            daysInMonth = 28;
        }
        if (day == daysInMonth) {
            if (month == 12) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = year + 1;
                System.out.println("Сегодня " + day + "." + month + "." + year);
                System.out.println("Завтра " + nextDay + "." + nextMonth + "." + nextYear);
            } else {
                nextDay = 1;
                nextMonth = month + 1;
                System.out.println("Сегодня " + day + "." + month + "." + year);
                System.out.println("Завтра " + nextDay + "." + nextMonth + "." + year);
            }
        } else if (day < daysInMonth) {
            nextDay = day + 1;
            System.out.println("Сегодня " + day + "." + month + "." + year);
            System.out.println("Завтра " + nextDay + "." + month + "." + year);
        } else {
            System.out.println("Указанной вами даты не существует");
        }
    }
}
