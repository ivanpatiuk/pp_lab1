package lab1_1;

public class lab1_2 {
    public static int countChars(final String str, final char ch){
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch)
                ++n;
        }
        return n;
    }
    public static void main(String[] args) {
        String string = "String to check";
        char ch = 'c';
        System.out.println("String has " + countChars(string,ch) + " chars "+ch);
    }
}