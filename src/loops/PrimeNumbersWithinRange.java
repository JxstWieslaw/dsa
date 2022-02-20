package loops;

import java.util.Scanner;

//Find List of Prime numbers within a Range
//Using flag
public class PrimeNumbersWithinRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int low = obj.nextInt();
        int high = obj.nextInt();
        if(low==2)
            System.out.println(low);
        for(int i= low; i<=high;i++){
            boolean flag = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println(i);
        }
    }
}
