package loops;
//21/01/2022
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("is a Palindrome");
        else
            System.out.println("is not a Palindrome");
    }
}
