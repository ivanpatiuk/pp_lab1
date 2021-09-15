package lab1_1;

public class lab1_4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; ++i){
            if (i%3==0 && i%5 ==0)
                System.out.print("FizzBuzz");
            else if (i%5==0)
                System.out.print("Buzz");
            else if (i%3==0)
                System.out.print("Fizz");
            else
                System.out.print(i);
            System.out.print(" ");
        }
    }
}
