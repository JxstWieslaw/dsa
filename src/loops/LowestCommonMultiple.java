package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowestCommonMultiple {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int big = a > b ? a : b ;
        for(int i = big; i <=a*b ; i++){
            if(i%a==0 && i%b==0){
                System.out.println(i + " is the LCM of "+a+ " and "+b);
                break;
            }
        }
    }
}
