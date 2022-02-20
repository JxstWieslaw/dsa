package loops;

public class Power {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int pow=1;
        for(int i=2;i<a;i++)
            pow*=a;
        System.out.println(a + " to the Power of "+ b + " = " + pow);
    }
}
