package loops;

import java.util.Scanner;

//An Armstrong number of three digits is an integer such
// that the sum of the cubes of its digits is equal to the number itself.
public class Armstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num= obj.nextInt(); //used for checking condition of Armstrong
        int count=0; // count variable
        int temp1=num; // variable used for finding count
        int temp2=num; //used for finding each digit
        int temp3=0; //used for summing up to possible armstrong value
        //count the num of digits
        //int temp variable, store the sum of all digits raised to the count
        while(temp1>0){
            count++;
            temp1/=10;
        }

        while(temp2>0){
            int r=temp2%10;
            temp2/=10;
            temp3+=Math.pow(r,count);
        }
        if(temp3==num)
            System.out.println(num+" is an Armstrong");
        else
            System.out.println(num+" is not an Armstrong");
    }
}
