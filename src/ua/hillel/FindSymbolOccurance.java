package ua.hillel;

public class FindSymbolOccurance {
    public static void main(String[] args) {
        String line = "You are your only limit";

        char[] a = line.toCharArray();
        System.out.println("Строка: " + line);
        System.out.println("Дублюючі символи строки:");
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j < line.length(); j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
