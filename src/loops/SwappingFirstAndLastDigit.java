package loops;

//27/01/2022
import java.util.Scanner;

public class SwappingFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int firstDigit=0,lastDigit=0;
        int count=0;
        int temp = num;
        int sumSwitch = 0;
        int tempSum=num;
        while(num>0){
            count++;
            if(count==1)
               lastDigit=num%10;
            if(num<10)
                firstDigit=num;
            num/=10;
        }
        if(count!=1){
            tempSum = tempSum-lastDigit-(int)(firstDigit*Math.pow(10,count-1));
            sumSwitch+=lastDigit*Math.pow(10,count-1)+firstDigit;
            tempSum+=sumSwitch;
            System.out.println(tempSum);
        }
        else if(count==1){
            System.out.println(temp);
        }

    }
}
