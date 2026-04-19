package tests_by_topic;
import java.util.Scanner;

class ConditionalConstruction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine().toLowerCase();
            String word = sc.next().toLowerCase();

            System.out.println(str.contains(word));
        }
    }
}

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
