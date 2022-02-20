package arrays;
//31/01/2022
import java.util.Scanner;

public class MaxAndMinElementInArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] =new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++)
            arr[i]= obj.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Maximum Value in Array : "+max);
        System.out.println("Minimum Value in Array : "+min);

    }
}
