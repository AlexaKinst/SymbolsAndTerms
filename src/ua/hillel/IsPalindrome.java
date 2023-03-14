package ua.hillel;

public class IsPalindrome {
    public static void main(String[] args) {

        String str = "ERE";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {

        char[] array = str.toCharArray();
        String a = "";
        for (int i = array.length - 1; i >= 0; i--) {
            a = a + array[i];
        }

        return str.equals(a);
    }
}
