package lab1_1;

public class lab1_9 {
    private static <T extends Number> double sum(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    private static <T extends Number> double diff(T firstNumber, T secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
   private static <T extends Number> double mltp(T firstNumber, T secondNumber) {
      return firstNumber.doubleValue() * secondNumber.doubleValue();
   }
   private static <T extends Number> double devide(T firstNumber, T secondNumber) {
      return firstNumber.doubleValue() / secondNumber.doubleValue();
   }

    private static double mltp(CustomDouble firstNumber, CustomDouble secondNumber) {
        return firstNumber.toDouble() * secondNumber.toDouble();
    }

    private static double devide(CustomDouble firstNumber, CustomDouble secondNumber) {
       return firstNumber.toDouble() / secondNumber.toDouble();
    }
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(1, 0.5);
        CustomDouble b = new CustomDouble(2, 0.3);
        a.plus(b);
        System.out.println(devide(a, b));
        System.out.println(mltp(a, b));
        System.out.println(sum(1.2, 1.2));
    }
}