public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello world!";
        char[] array = str.toCharArray();
        String a = "";
        for (int i = array.length - 1; i >= 0; i--) {
            a = a + array[i];
        }
        System.out.println(a);
    }
}
