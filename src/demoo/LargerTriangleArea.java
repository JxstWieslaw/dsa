package demoo;

import java.util.Scanner;

public class LargerTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base1=input.nextInt();
        int height1= input.nextInt();
        int base2=input.nextInt();
        int height2=input.nextInt();

        //Area before rounding to a real number
        double area1=(float)base1*(float)height1/2;
        double area2=(float)base2*(float)height2/2;

        //Rounding area1 and area2 to real numbers
        if(Math.ceil(area1) != area1){
            area1=Math.ceil(area1);
        }
        if(Math.ceil(area2) != area2){
            area2 =Math.ceil(area2);
        }
        if(area1 > area2){
            System.out.println(String.format("%.6f",area1));
        }
        else{
            System.out.println(String.format("%.6f",area2));
        }
    }
}
