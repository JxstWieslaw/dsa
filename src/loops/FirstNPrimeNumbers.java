package loops;

import java.util.Scanner;

public class FirstNPrimeNumbers {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=1;
        int num=2;
        System.out.println(num);
        while(n!=count){
            num++;
            int i;
            for(i=2;i<num;i++){
                if(num%i==0){
                    break;
                }
            }
            if(i==num){
                count++;
                System.out.println(num);
            }
        }
    }
}
