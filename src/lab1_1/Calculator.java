package lab1_1;

public class Calculator {
    private static <T extends Number> double sum(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    private static <T extends Number> double diff(final T firstNumber, final T secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
   private static <T extends Number> double mltp(final T firstNumber, final T secondNumber) {
      return firstNumber.doubleValue() * secondNumber.doubleValue();
   }
   private static <T extends Number> double devide(final T firstNumber, final T secondNumber) {
      return firstNumber.doubleValue() / secondNumber.doubleValue();
   }

    private static double mltp(final CustomDouble firstNumber, final CustomDouble secondNumber) {
        return firstNumber.toDouble() * secondNumber.toDouble();
    }

    private static double devide(final CustomDouble firstNumber, final CustomDouble secondNumber) {
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