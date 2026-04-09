package lessons;
import java.util.Scanner;


/** Дока */

// Тестовый класс

class MyClass {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            if (month < 1 || month > 12){
                System.out.print(false);
                return;
            }

            if (year <= 0) {
                System.out.print(false);
                return;
            }

            boolean isLeap;
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }

            int max_days;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                max_days = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                max_days = 30;
            } else if (isLeap) {
                max_days = 29;
            } else {
                max_days = 28;
            }

            boolean isValid = (day >= 1) && (day <= max_days);
            System.out.print(isValid);
        }
    }
}





