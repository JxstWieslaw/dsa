package arrays;

import java.util.Scanner;

public class PairSumOfGivenNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = obj.nextInt();
        System.out.println("Enter number of elements in array: ");
        int size=obj.nextInt();
        int [] arr = new int[size];
        System.out.println("Input elements: ");
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        System.out.println();
        for(int i=0;i<size-1;i++){
            for(int j = i+1; j<size; j++){
                if(arr[i]+arr[j]==num)
                    System.out.println(arr[j]+ " + " + arr[i] +" equals "+ num);
            }
        }
    }
}
