package loops;

import java.util.Scanner;

//Find List of Prime numbers within a Range
//Without Using Flag
public class PrimeNumbersWithinRangeNoFlag {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int low = obj.nextInt();
        int high = obj.nextInt();
        if(low==2)
            System.out.println(low);
        for(int i= low; i<=high;i++){
            int j;
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j)
                System.out.println(i);
        }
    }
}
