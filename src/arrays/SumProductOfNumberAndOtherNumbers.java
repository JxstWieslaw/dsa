package arrays;

import java.util.Scanner;
//02/02/2022
/*
Two pointers : one to keep current element index.
                one to get sum product.
    Int globalSum=0;
    1.Loop through array from i=0 to i<size
        1.1. int localSum=0;
    2.Nested loop with j=0 to j<size
        2.1. if(i!=j){
            localSum=arr[j]; //Get sum of all other numbers
    3.After inside loop :
        3.1. globalSum+=localSum*arr[i];
    4.Print globalSum;
 */

public class SumProductOfNumberAndOtherNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Input elements: ");
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        int globalSum = 0;
        for(int i=0;i<size;i++){
            int localSum = 0;
            for(int j=0;j<size;j++){
                if(i!=j){
                    localSum+=arr[j];
                }
            }
            localSum = localSum* arr[i];
            globalSum = globalSum + localSum;
        }
        System.out.println("Total : " + globalSum);
    }
}
