package arrays;

import java.util.Scanner;

public class SumOfRowElementsIn2DArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int [][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            int sumRowElements=0;
            for(int j=0;j<n;j++){
                sumRowElements+=arr[i][j];
            }
            System.out.println(sumRowElements);
        }
        for(int i=0;i<n;i++){
            int sumColElements=0;
            for(int j=0;j<m;j++){
                sumColElements+=arr[j][i];
            }
            System.out.println(sumColElements);
        }
    }
}
