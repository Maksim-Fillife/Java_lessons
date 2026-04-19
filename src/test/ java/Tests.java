import java.util.Scanner;

class Tests {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        }
    }
}

//На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".
//class Tests {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n = sc.nextInt();
//
//            if (n >= 100 && n <= 999) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}

//На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.
//class Tests {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            String st = sc.nextLine().trim();
//            String word = sc.nextLine().trim();
//
//            boolean result = st.toLowerCase().contains(word.toLowerCase());
//            System.out.println(result);
//        }
//    }
//}

//На вход подаётся целое трёхзначное число, а затем цифра.
// Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет.
// Если введённое число не является трёхзначным, выведите "error".
//class Tests {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n = Math.abs(sc.nextInt()); // Вдруг отрицательное ввести нужно.
//            int n2 = sc.nextInt();
//
//            if (n < 100 || n > 999) {   //Проверяем диапазон
//                System.out.println("error");
//                return;
//            }
//
//            int middle_num = n % 100 / 10; // Вычитаем разряд десятков
//            boolean result = Math.abs(n2) == middle_num;
//            System.out.println(result);
//        }
//    }
//}

//На вход подаётся два числа - a и b.
// Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.
//class Tests {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//
//            if (a < b) {
//                System.out.println("<");
//            } else if (a > b) {
//                System.out.println(">");
//            } else {
//                System.out.println("=");
//            }
//        }
//    }
//}