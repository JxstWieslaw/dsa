package loops;
//Find the multiple tables with a given a range
//i.e for range 3 to 7, find table of multiples of 3 4 5 6 7

import java.util.Scanner;

public class TablesOfMultiplesWithinRange {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int low = obj.nextInt();
        int high = obj.nextInt();

        for(int i=low; i <= high; i++){
            for(int j = 1; j<=10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
