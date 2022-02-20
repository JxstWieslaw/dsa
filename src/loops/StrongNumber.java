package loops;

import java.util.Scanner;

//Strong number is a special number whose sum of
// the factorial of digits is equal to the original number
public class StrongNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt(); //used for checking condition of Armstrong
        int temp=num; // variable used for finding Strong number
        int sum=0;
        while(num>0){
            int r=num%10;
            num/=10;
            int f=1;
            for(int i=r;i>0;i--)
                f=f*i;
            //BigInteger num1= BigIntegerMath.factorial(r);
//            sum+=;
        }
        if(sum==temp)
            System.out.println(temp +" is a Strong number");
        else
            System.out.println(temp +" is not a Strong number");
    }
}
