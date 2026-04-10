package lessons;
import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String w = sc.nextLine();

            String[] words = w.split(" ");
            Arrays.sort(words);

            for (String res :words) {
                System.out.println(res);
            }
        }
    }
}
