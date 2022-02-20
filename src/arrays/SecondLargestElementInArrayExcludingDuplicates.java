package arrays;

import java.util.Scanner;

//05/02/2022
/*
Find the Second Largest Element in an Array
1. Apply bubble to sort the elements
2. Check for frequencies: ()->create frequency array
3. Traverse array using nested loops
4. Check for secondLargest
 */
public class SecondLargestElementInArrayExcludingDuplicates {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numElements = obj.nextInt();
        int [] arr = new int[numElements];
        System.out.println("Input elements: ");
        for(int i=0;i<numElements;i++){
            arr[i]=obj.nextInt();
        }
        bubbleSort(arr,numElements); //Step 1
        int [] freq = getFrequency(arr);//Step 2
        System.out.println("Second Largest Element is: "+ findSecondLargest(freq,arr)); //Step 3 && 4
    }

    private static int findSecondLargest(int[] freq, int[] arr) {
        //position of largest element
        int firstLargestPosition=arr.length-1;

        //value of first largest
        int firstLargest=arr[firstLargestPosition];

        //frequency of first largest. In case its not 1, handle duplicates
        int firstLargestCount=freq[firstLargest];

        //handle duplicates of first largest elements && get definite position of second largest
        int secondLargestPosition=firstLargestPosition-firstLargestCount;

        //value of second
        int secondLargest=arr[secondLargestPosition];

        //return secondLargest to main function
        return secondLargest;
    }

    private static int[] getFrequency(int[] arr) {
        int [] freq = new int [1001]; //Assuming constraint: ()largest element is 1000, hence size becomes 1001.
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    private static int [] bubbleSort(int[] arr, int numElements) {
        for(int i=0;i<numElements-1;i++){
            for(int j=i+1;j<numElements;j++){
                int temp;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
