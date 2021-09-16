package lab1_1;

public class Task3 {
    public static String merge(final int[] intArray, final char[] charArray) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(intArray.length, charArray.length); ++i) {
            if (i < intArray.length)
                result.append(intArray[i]);
            if (i < charArray.length)
                result.append(charArray[i]);
        }
        return result.toString();

}
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        String string = merge(intArray,charArray);
        System.out.println(string);
    }
}
