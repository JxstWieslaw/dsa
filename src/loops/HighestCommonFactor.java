package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//28/01/2022
public class HighestCommonFactor {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int hcf=1;
        for(int i=1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        System.out.println(hcf);
    }
}
