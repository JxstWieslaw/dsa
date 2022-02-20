package arrays;
// 01/01/2022
import java.util.Scanner;

public class ArrayOddEvenArranged {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many array elements: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Input elements: ");
        for(int i=0;i<size;i++){
            arr[i]= obj.nextInt();
        }
        int[] odd =new int[size];
        int[] even =new int[size];
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
                even[evenCount++]=arr[i];
            else
                odd[oddCount++]=arr[i];
        }
        System.out.print("\nOdd array elements: ");
        for(int i=0;i<oddCount;i++)
            System.out.print(odd[i]+ " ");

        System.out.print("\nEven array elements: ");
        for(int i=0;i<evenCount;i++)
            System.out.println(even[i]+" ");

        int merge[]=new int[size];
        for(int i=0;i<oddCount;i++)
            merge[i]=odd[i];

        evenCount=0; //change count for even array to start from 0;
        for(int i=oddCount;i<size;i++)
            merge[i]=even[evenCount++];

        System.out.println("\nArranged array: ");
        for(int i=0;i<size;i++)
            System.out.println(merge[i]+" ");
    }
}
