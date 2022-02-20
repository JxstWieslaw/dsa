package arrays;

import java.util.Scanner;

public class SwappingParity {
    private static  int j=0;
    private static int k=1;
    //function to check for parity of two adjacent numbers i and i1
    private static  void swap (int []arr,int i, int i1) {
        while(arr[i]>arr[i1] && i-1!=-1) {
            if ((i % 2 == 0 && i1 % 2 == 0 || i % 2 == 1 && i1 % 2 == 1) && i > i1) {
                int temp = arr[i];
                arr[i] = arr[i1];
                arr[i1] = temp;
            }
            if (arr[i - 1] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i1];
                arr[i1] = temp;
            }
        }
        j++;
        k++;
    }

    private static void swappingParity(int []arr,int i, int i1){
        if(j==arr.length-2 && k==arr.length-1 && arr[i]<arr[i1]){
            System.out.println(arr);
        }
        swap(arr,i,i1);
        swappingParity(arr,j,k);
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int []arr= {7,5,9,6,8,0,1};
        swappingParity(arr,j,k);
    }
}
