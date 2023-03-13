public class IsPalindrome {
    public static void main(String[] args) {
        String str = "ERE";

        char[] array = str.toCharArray();
        String a = "";
        for (int i = array.length - 1; i >= 0; i--) {
            a = a + array[i];
        }

        System.out.println(str.equals(a));
    }
}
