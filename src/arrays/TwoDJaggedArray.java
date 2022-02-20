package arrays;

import java.util.Scanner;
/*
A jagged array is an array of arrays such that member arrays
 can be of different sizes, i.e., we can create a 2-D array but
 with a variable number of columns in each row.
 These types of arrays are also known as Jagged arrays.
 */
public class TwoDJaggedArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of rows in Jagged Array: ");
        int numRows= obj.nextInt();
        int [][] arr = new int[numRows][];
        System.out.println("Initialise elements in each row: ");
        for(int i=0;i<numRows;i++){
            System.out.println("Elements in row "+ i +" :");
            int colElements = obj.nextInt();
            arr[i]= new int[colElements];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter row "+ i + " elements:" );
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Jagged array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
