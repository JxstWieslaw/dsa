package arrays;
//02/02/2022
import java.util.Scanner;
/*
    Program to create an array of non-prime digits from a given array
    If (the sum of digits results in a prime, then leave the element)
        else
            append the element into array.
    Pseudocode:
        1. Take input of size
        2. Create arr[size]
        3.Input elements into array
        4.Create newArray[size]
            4.1. currentPointer = 0;
        --> Loop through all elements of arr i.e from i=0 . Keep value of i closely.
        5.Create function to check if sum of digits results in prime ->public static boolean checkSumDigitsPrime(int currentElement)
            5.1. Create function to get sum of digits -> public static int sumDigits(int currentElement); ()->5.2
            5.2. Create function to check if a number is prime(int num) -> public static boolean checkPrime(int sum) ( )->results to boolean
        6. If (!checkSumDigitsPrime(int currentElement)) {
                newArray[currentPointer++] = arr[i]
                countOfValidNumbers = currentPointer. Can use same variable
            }
 */
public class NonePrimeArrayFromGivenArray {

    private static boolean checkPrime(int sumDigits){
        boolean flag = true;
        for(int i=2;i<sumDigits;i++){
            if(sumDigits%i==0){
                flag=false;
                break;
            }
        }
        if(flag)
            return true;
        return false;
    }
    public static int calculateSumDigits(int currentElement){
        int sum=0;
        while(currentElement>0){
            int r=currentElement%10;
            sum = sum + r;
            currentElement = currentElement/10;
        }
        return sum;
    }

    private static boolean checkSumDigitsPrime(int currentElement) {
        calculateSumDigits(currentElement);
        return checkPrime(calculateSumDigits(currentElement));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Input elements: ");
        for(int i=0;i<size;i++)
            arr[i]=input.nextInt();
        int [] newArray = arr;
        int currentPointer = 0;
        for(int i=0;i<size;i++){
            if(!checkSumDigitsPrime(arr[i])){
                newArray[currentPointer++]=arr[i];
            }
        }
        System.out.println("New Array : ");
        for(int i=0;i<currentPointer;i++){
            System.out.print(newArray[i]+" ");
        }
    }

}
