package loops;

import java.util.Scanner;
//
//Find a count of the number of non-prime digits
public class NonPrimeDigits {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int num = obj.nextInt();
        int count=0;
        while(num>0){
            int t = num % 10;
            for (int i = 2; i < t; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            num/=10;
        }
        System.out.println("Non prime digits : " +count);
    }
}
