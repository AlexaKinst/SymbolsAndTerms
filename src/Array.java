import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


        String ComputerWord = words[random.nextInt(words.length)];
        System.out.println(ComputerWord);
        System.out.println("Вгадай слово");
        String word = scanner.next().toLowerCase();

        int hint = 0;
        while (!ComputerWord.equals(word)){
            StringBuilder stringBuilder = new StringBuilder (ComputerWord.substring(0, hint));
            System.out.println(stringBuilder.append("###############"));
            System.out.println("Спробуйте ще раз");
            word = scanner.next().toLowerCase();
            if (word.charAt(0) == ComputerWord.charAt(0)) {
                hint += 1;
            }
            if (word.charAt(1) == ComputerWord.charAt(1)) {
                hint += 1;
            }
        }
        if (ComputerWord.equals(word)){
            System.out.println("Вітаю, ви вгадали слово.");
        }
    }
}
