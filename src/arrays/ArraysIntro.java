package arrays;
//21/01/2022
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i]= input.nextInt();
        System.out.println("Printing elements using Arrays.toString()");
        System.out.println(Arrays.toString(arr));
        System.out.println("Printing using direct access");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
}
