package tests_by_topic;
import java.util.Scanner;

class ConditionalConstruction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("error");
            } else if (month == 12 || month == 1 || month == 2) {
                System.out.println("Зима");
            } else if (month == 3 || month == 4 || month == 5) {
                System.out.println("Весна");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.println("Лето");
            } else {
                System.out.println("Осень");
            }

        }
    }
}

//Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".
//import java.util.Scanner;  // Решение рааботает только с 14 java
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//
//        if (month < 1 || month > 12) {
//            System.out.println("error");
//        } else {
//            switch (month) {
//                case 12, 1, 2:
//                    System.out.println("Зима");
//                    break;
//                case 3, 4, 5:
//                    System.out.println("Весна");
//                    break;
//                case 6, 7, 8:
//                    System.out.println("Лето");
//                    break;
//                case 9, 10, 11:
//                    System.out.println("Осень");
//                    break;
//            }
//        }
//    }
//}

//На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.
//class ConditionalConstruction {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//
//            if (a > b) {
//                System.out.println(">");
//            } else if (a < b) {
//                System.out.println("<");
//            } else {
//                System.out.println("=");
//            }
//        }
//    }
//}

//На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет.
// Если введённое число не является трёхзначным, выведите "error".
//class Main {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n1 = sc.nextInt();
//            int n2 = sc.nextInt();
//
//            if (Math.abs(n1) < 100 || Math.abs(n1) > 999) {
//                System.out.println("error");
//            } else {
//                // Извлекаем цифру десятков
//                int middleDigit = n1 / 10 % 10;
//                System.out.println(middleDigit == n2);
//            }
//        }
//    }
//}

//На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.
//class ConditionalConstruction {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            String str = sc.nextLine().toLowerCase();
//            String word = sc.next().toLowerCase();
//
//            System.out.println(str.contains(word));
//        }
//    }
//}

//На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".
//class ConditionalConstruction {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int num = sc.nextInt();
//
//            if (num >= 100 && num < 1000) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}
