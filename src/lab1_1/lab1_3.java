package lab1_1;

public class lab1_3 {
    public static String merge(int[] intArray, char[] charArray) {
        String string = "";
        for (int i = 0; i < Math.max(intArray.length, charArray.length); ++i) {
            if (i < intArray.length)
                string += intArray[i];
            if (i < charArray.length)
                string += charArray[i];
        }
        return string;

}
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        String string = merge(intArray,charArray);
        System.out.println(string);
    }
}
