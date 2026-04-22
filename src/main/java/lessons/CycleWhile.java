package lessons;
import java.util.Scanner;

//На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
// Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
// Вывести слова необходимо в том же порядке, в котором они подаются на вход.

class CycleWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Читаем две граничные буквы
            String s1 = sc.next();
            String s2 = sc.next();

            char c1 = s1.charAt(0);
            char c2 = s2.charAt(0);

            // Определяем границы диапазона (на случай, если ввели "p j" вместо "j p")
            char min = (c1 < c2) ? c1 : c2;
            char max = (c1 > c2) ? c1 : c2;

            // Читаем все последующие слова до конца ввода
            while (sc.hasNext()) {
                String word = sc.next();
                char first = word.charAt(0);

                // Если первая буква слова попадает в диапазон [min; max]
                if (first >= min && first <= max) {
                    System.out.println(word);
                }
            }
        }
    }
}

//На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            long n = sc.nextLong();
//
//            String str = Long.toString(n);
//            String rev = new StringBuilder(str).reverse().toString();
//            System.out.println(rev);
//        }
//    }
//}

//На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями.
// Если входящее число отрицательное или больше 10, последовательность прерывается.
//Посчитайте среднюю оценку фильма.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            double rating = 0;
//            int count = 0;
//            int n;
//
//            while (true) {
//                n = sc.nextInt();
//                if (n < 0 || n > 10) {
//                    break;
//                }
//                count++;
//                rating += n;
//            }System.out.println(rating / count);
//        }
//    }
//}

//На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность).
//Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n;
//            int count = 0;
//            int sum = 0;
//
//            while (true) {
//                n = sc.nextInt();
//
//                if (n % 11 == 0) {
//                    break;
//                }
//                count++;
//                if (n % 3 == 0) {
//                    sum += n;
//                }
//            } System.out.println(count + "\n" + sum);
//        }
//    }
//}

//На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int count = 0;
//
//            // hasNext() проверяет, есть ли следующее слово
//            while (sc.hasNext()) {
//                sc.next(); // "съедаем" слово, чтобы перейти к следующему
//                count++;   // увеличиваем счётчик
//            }
//            System.out.println(count);
//        }
//    }
//}

//Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0.
//Выведите на печать сумму введённых чисел.
//import java.util.Scanner;
//
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n = 1;
//            int x = 0;
//
//            while (n != 0) {
//                n = sc.nextInt();
//                x += n;
//            }
//            System.out.println(x);
//        }
//    }
//}


//На ввод подаётся натуральное число n. Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n = sc.nextInt();
//            int x = 1;
//
//            while (x * x <= n) {
//                System.out.print(x * x + " ");
//                x++;
//            }
//        }
//    }
//}

//На вход подаётся натуральное число n. Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.
//class CycleWhile {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int n = sc.nextInt();
//            int x = 1;
//
//            while (x <= n) {
//                System.out.println(x);
//                x++;
//            }
//        }
//    }
//}