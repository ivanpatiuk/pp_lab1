package lab1_1;

public class Main {
    public static void sort(String[] string) {
        for (int i = 0; i < string.length; ++i) {
            for (int k = 0; k < string.length - 1; ++k) {
                if (string[k].length() > string[k + 1].length()) {
                    String tmp = string[k];
                    string[k] = string[k + 1];
                    string[k + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Sambir";
        array[1] = "Lviv";
        array[2] = "Washington";
        array[3] = "London";
        array[4] = "York";

        sort(array);
        for (String str : array)
            System.out.println(str);

    }
}
