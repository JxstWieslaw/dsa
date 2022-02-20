package loops;

import java.util.Scanner;

//Find an armstrong number within a range
public class ArmStrongWithinRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int low = obj.nextInt();
        int high =obj.nextInt();
        for(int i=low;i<=high;i++){
            int num= i; //used for checking condition of Armstrong
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
                System.out.println(num);
        }

    }
}
