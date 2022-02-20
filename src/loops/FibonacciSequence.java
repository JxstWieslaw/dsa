package loops;

//28/01/2022
/*The Fibonacci sequence is a set of numbers
        that starts with a one or a zero,
        followed by a one, and proceeds based on the rule that each number
        (called a Fibonacci number) is equal to the sum of the preceding two numbers.
        F (0) = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
        In some texts, it is customary to use n = 1.
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0; //first or second preceding Fibonacci number in series
        int b = 1; //second or first preceding Fibonacci number in series
        System.out.print(a + " " + b + " ");
        for(int i=0;i<10;i++){
            int c = a+b; // current Fibonacci number
            System.out.print(c+ " ");
            a = b ; //updating the value of preceding numbers - second preceding equals the first preceding
            b = c ; //first preceding equals current value of Fibonacci number
        }
    }
}
