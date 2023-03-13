package ua.hillel;

public class FindWordPosition {
    public static void main(String[] args) {
        String source;
        String target;
        boolean b;

        source = "Apple";
        target = "Java";
        b = source.contains(target);
        System.out.println("Перша строка: " + source + ". " + "Друга строка: " + target + ". " + "Співпадіння: " + b);
    }
}
