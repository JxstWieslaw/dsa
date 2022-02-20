package loops;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt();
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
