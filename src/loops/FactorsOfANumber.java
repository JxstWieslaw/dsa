package loops;

import java.util.Scanner;

//28/01/2022
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        int num = obj.nextInt();
        for(int i=1;i<=num;i++){
           if(num%i==0)
               System.out.print(i + " ");
        }
    }
}
