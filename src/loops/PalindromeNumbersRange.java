package loops;

import java.util.Scanner;

//Range for palindrome numbers between 10 to 100
/*TODO:
1. take upper and lower limits
2. write code to check for palindrome
4. make a reverse of the number : store in variable sum
5. if numbers are the same then it is a palindrome: sum and value of i
6. Print values of palindrome
*/
public class PalindromeNumbersRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int low=obj.nextInt();
        int high=obj.nextInt();
        for(int num=low;num<=high;num++){
            int temp=num;
            int sum=0;
            while(temp>0){
                int r=temp%10;
                sum= sum*10+r;
                temp/=10;
            }
            if(num==sum)
                System.out.println(num);
        }
    }
}
