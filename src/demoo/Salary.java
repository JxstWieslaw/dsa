package demoo;

import java.util.Scanner;

public class Salary {
/*
 * female with more than 5 yrs 20%
 * " 3-5 yrs 15%
 * male more than 5 yrs 15%
 * " 3-5 yrs 10%
 * Qstn: calculate the increment and resulting total salary.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sal = input.nextInt();
        char gen =input.next().charAt(0);
        int exp = input.nextInt();
        int inc=0;

        if (exp > 5 && gen=='f') {
            inc=sal*20/100;
            System.out.println("Increment : " + sal);
            System.out.println("New Salary : " + (sal+inc));
        }
        else if (((exp>=3 && exp<6) && gen=='f' ) || (exp>5 && gen=='m')) {
            inc=sal*15/100;
            System.out.println("Increment : " + inc);
            System.out.println("New Salary : " + (sal+inc));
        }
        else if (exp >=3 && exp <6 && gen=='m' ) {
            inc=sal*10/100;
            System.out.println("Increment : " + inc);
            System.out.println("New Salary : " + (sal+inc));
        }
        else {
            System.out.println("Increment : " + inc);
            System.out.println("New Salary : " + (sal+inc));
        }
    }
}

