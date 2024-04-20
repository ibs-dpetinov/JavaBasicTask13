import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами");
        String exclamation = console.nextLine();
        String[] stringArray = exclamation.split(" ");
        int latinWordsCount = 0;
        System.out.println("Слова, состоящие только из латиницы:");
        for (String word: stringArray) {
            if (word.matches("^[a-zA-Z]+$")) {
                latinWordsCount += 1;
                System.out.println(word);
            }
        }
        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordsCount);
    }
}