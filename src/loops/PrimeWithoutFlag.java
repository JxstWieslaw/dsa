package loops;

public class PrimeWithoutFlag {
    public static void main(String[] args) {
        int num = 7;
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not Prime");
                break;
            }
        }
        if (i == num)
            System.out.println(num + " is Prime");
    }
}
