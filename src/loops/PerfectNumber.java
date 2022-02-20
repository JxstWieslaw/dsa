package loops;

import java.util.Scanner;

//28/01/2022
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int num = obj.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
           if(num%i==0)
               sum+=i;
        }
        if(sum==num)
            System.out.println(num+" is a Perfect Number");
        else
            System.out.println(num+ " is not a Perfect Number");
    }
}
