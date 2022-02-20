package arrays;

import java.util.Scanner;

/*

 */
public class CheckKaprekarNumber {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int t=obj.nextInt();
        while(t-- >0){
            int num=obj.nextInt();
            int countNum=0;
            int tempNum=num;
            int numSquare=num*num;
            int flag=0;
            int count=0;
            int temp=numSquare;
            int temp1=numSquare;
            while(tempNum>0){
                countNum++;
                temp/=10;
            }
            while(temp>0){
                count++;
                temp/=10;
            }
            int []arr = new int[count];
            for(int i=count-1;i>=0;i--){
                arr[i]=temp1%10;
                temp1/=10;
            }
            if(countNum == count){
                if(num == numSquare)
                    flag=1;
            }
            else{
                for(int i=0;i<count;i++){
                    int firstPartValue = calculateValue(arr,0,i);

                    if(i+1==count)
                        break;
                    int secondPArtValue = calculateValue(arr,i+1, count-1);
                    if(firstPartValue + secondPArtValue == num){
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println(flag);
        }
    }

    private static int calculateValue(int []arr,int low, int high) {
        int value=0;
        int p=0;
        for(int i=high;i>=low;i--){
            value = value+arr[i]*(int)Math.pow(10,p++);
        }
        return value;
    }
}
