package ua.hillel;

public class FindWordPosition {
    public static void main(String[] args) {

        findWordPosition();
    }

    public static void findWordPosition() {

        String source = "method";
        String target = "et";
        int position = source.indexOf(target);

        System.out.println("Перша строка: " + source + ". " + "Друга строка: " + target + ". " + "Позиція: " + position);
    }
}
