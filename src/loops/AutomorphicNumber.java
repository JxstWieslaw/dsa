package loops;
import java.util.Scanner;

//An automorphic number is an integer
// whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776.

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int num = obj.nextInt();
        int count=0;
        int temp=num;
        while(num>0){
            count++;
            num/=10;
        }
        int numSquare = (int)Math.pow(temp,2);
        int d = (int)Math.pow(10,count);
        if(numSquare % d == temp)
            System.out.println(temp+ " is an automorphic number");
        else
            System.out.println(temp+ " is not an automorphic number");

    }
}
