package demoo;

import java.util.Scanner;

public class saleCount {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int saleCount = input.nextInt();
            if (saleCount >=81) {
                System.out.println("A");
            }
            else if (saleCount >=61) {

                System.out.println("B");
            }
            else if (saleCount >=51) {
                System.out.println("C");
            }
            else if (saleCount >= 30){
                System.out.println("D");
            }
        }
}
