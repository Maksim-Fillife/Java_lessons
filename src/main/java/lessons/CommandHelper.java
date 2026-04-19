package lessons;
import java.util.Scanner;

class CommandHelper {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String command = input.nextLine().trim(); //Убирает возможные пробелы по краями

            switch (command) {
                case "System.out.println()":
                    System.out.println("Это команда вывода на печать");
                    break;
                case "if":
                    System.out.println("Это условный оператор");
                    break;
                case "else":
                    System.out.println("Это альтернативная конструкция условного оператора");
                    break;
                default:
                    System.out.println("Раздел в разработке");
            }
        }
    }
}
