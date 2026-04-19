package lessons;
import java.util.Scanner;

class NestedConditions {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            //используется как «маркер» или «заглушка», означающая: «Пока мы не нашли ни одного подходящего числа».
            int maxEven = Integer.MIN_VALUE;

            if (a % 2 == 0) maxEven = a;
            if (b % 2 == 0) maxEven = Math.max(maxEven, b);
            if (c % 2 == 0) maxEven = Math.max(maxEven, c);

            if (maxEven == Integer.MIN_VALUE) {
                System.out.println("Чётных чисел нет");
            } else {
                System.out.println(maxEven);
            }
        }
    }
}


//class NestedConditions {
//    public static void main(String[] args){
//        try (Scanner sc = new Scanner(System.in)){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//
//            if (a >= b && a <= c || a >= c && a <= b){
//                System.out.print(a);
//            } else if (b >= a && b <= c || b >= c && b <= a){
//                System.out.print(b);
//            }else {
//                System.out.print(c);
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//class NestedConditions {
//    public static void main(String[] args){
//        try (Scanner sc = new Scanner(System.in)){
//            int salary1 = sc.nextInt();
//            int salary2 = sc.nextInt();
//            int salary3 = sc.nextInt();
//            int diff = sc.nextInt();
//
//            int max_salary = Math.max(salary1, Math.max(salary2, salary3));
//            int min_salary = Math.min(salary1, Math.min(salary2, salary3));
//
//            if (max_salary - min_salary > diff) {
//                System.out.println("Ура, бастуем!");
//            } else {
//                System.out.println("За работу, Солнце ещё высоко");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//class NestedConditions {
//    public static void main(String[] args){
//        try (Scanner sc = new Scanner(System.in)){
//            int a1 = sc.nextInt();
//            int b1 = sc.nextInt();
//            int a2 = sc.nextInt();
//            int b2 = sc.nextInt();
//
//            int left = Math.max(a1, a2);
//            int right = Math.min(b1, b2);
//
//            if (left > right) {
//                System.out.print("Пересечения нет");
//            } else if (left == right) {
//                System.out.print(left);
//            } else {
//                System.out.print(left + " " + right);
//            }
//        }
//    }
//}