package loops;

public class Factorial {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int fact1=1;
        int fact2=1;
        for (int i = num1; i > 0; i--)
            fact1 *= i;
        for (int j = 1; j <=num2; j++)
            fact2 *= j;
        System.out.println("Factorial of "+ num1 + " = " + fact1);
        System.out.println("Factorial of "+ num2 + " = " + fact2);
    }
}
