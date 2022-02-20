package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxPerfectSquareSum {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int m = Integer.parseInt(br.readLine());
        int[][] inmatrix = new int[m][];
        int n=0;
        for(int i=0;i<m;i++){
            String str = br.readLine();
            String[] row = str.split(",");
            n = row.length;
            inmatrix[i] = new int[n];

            for (int j = 0; j < n; j++) {
//               System.out.println(row[j]+ " ");
                inmatrix[i][j] = Integer.parseInt(row[j]);
            }
//            System.out.println();
        }
        //Debugging
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(inmatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        int []temparr = new int[m*n];
        int []sqnumarr = new int[m*n];
        int outnum=-1;
        int tempArrCurrentIndex = 0;
        int sqNumArrCurrentIndex = 0;
        int tempArrSum=0;
        //traversal row by row
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    temparr[tempArrCurrentIndex] = inmatrix[i][j];
                    tempArrSum = tempArrSum + temparr[tempArrCurrentIndex];
                    if(checkPerfectSquareSum(tempArrSum)){

                        sqnumarr[sqNumArrCurrentIndex++] = temparr[tempArrCurrentIndex];
                        if(tempArrSum > outnum){
                            outnum = tempArrSum;
                        }
                        reinitialise(temparr,0,tempArrCurrentIndex);
                        tempArrCurrentIndex = 0;
                        tempArrSum = 0;
                    }
                    else{
                        tempArrCurrentIndex++;
                    }
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    temparr[tempArrCurrentIndex] = inmatrix[i][j];
                    tempArrSum = tempArrSum + temparr[tempArrCurrentIndex];
                    if(checkPerfectSquareSum(tempArrSum)){

                        sqnumarr[sqNumArrCurrentIndex++] = temparr[tempArrCurrentIndex];
                        if(tempArrSum > outnum){
                            outnum = tempArrSum;
                        }
                        reinitialise(temparr,0,tempArrCurrentIndex);
                        tempArrCurrentIndex = 0;
                        tempArrSum = 0;
                    }
                    else{
                        tempArrCurrentIndex++;
                    }
                }
                }
            }
        System.out.println(outnum);
        }

    private static void reinitialise(int[] temparr, int start, int tempArrCurrentIndex) {
        for(int i=start;i<=tempArrCurrentIndex;i++) {
            temparr[i] = 0;
        }
    }

    private static boolean checkPerfectSquareSum(int tempArrSum) {
        int sqrt = (int)Math.sqrt(tempArrSum);
        if(sqrt*sqrt==tempArrSum) {
            return true;
        }
        else {
            return false;
        }
    }
}
