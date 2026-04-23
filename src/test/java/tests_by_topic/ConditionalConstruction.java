package tests_by_topic;
import java.util.Scanner;

//На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".
class ConditionalConstruction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next().toLowerCase();

            if (word.length() == 1) {
                System.out.println("Одна буква");
            } else if (word.length() == 2) {
                System.out.println("Две буквы");
            } else if (word.length() == 3) {
                System.out.println("Три буквы");
            } else if (word.length() == 4) {
                System.out.println("Четыре буквы");
            } else if (word.length() == 5) {
                System.out.println("Пять букв");
            } else {
                System.out.println("Длинное слово");
            }
        }
    }
}

//Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶.
// В кабинет совещаний могут войти только те, кто указан в специальном списке: Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс.
// Чтобы получить допуск, нужно сказать фразу-приветствие. Если фраза-приветствие содержит имя из списка, проход разрешается. Если же нет - проход блокируется.
//На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет, Вы ошиблись дверью" - если нет.
//class ConditionalConstruction {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            String n1 = "Джефф Безос";
//            String n2 = "Илон Маск";
//            String n3 = "Марк Цукерберг";
//            String n4 = "Билл Гейтс";
//            String wel = sc.nextLine();
//
//            if (wel.contains(n1) || wel.contains(n2) || wel.contains(n3) || wel.contains(n4)) {
//                System.out.println("Добро пожаловать!");
//            } else {
//                System.out.println("Здесь никого нет, Вы ошиблись дверью");
//            }
//        }
//    }
//}

//На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.
//Выведите "Yes", если попадает, и "No" - в противном случае.
//class ConditionalConstruction {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            double x = sc.nextDouble();
//            double y = sc.nextDouble();
//
//            // Точка должна быть ниже параболы
//            boolean underParabola = y <= 2 - x * x;
//
//            // Нижняя граница зависит от знака x
//            boolean aboveLowerBound;
//            if (x < 0) {
//                aboveLowerBound = y >= x;      // Слева граница: прямая y = x
//            } else {
//                aboveLowerBound = y >= 0;      // Справа граница: ось X (y = 0)
//            }
//
//            if (underParabola && aboveLowerBound) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }
//    }
//}

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
