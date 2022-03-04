package Collection_Interface.stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.push("A")); //add object to top
        System.out.println(s.push("B"));
        s.push(1); //heterogeneous
        System.out.println(s);
        System.out.println(s.pop());//remove from top
        System.out.println(s);
        System.out.println(s.peek());//return top element but do not pop/delete
        System.out.println("Stack after peek: "+s);
        System.out.println(s.search("B"));
        s.push("C");
        s.push("D");
        //after more elements are inserted on top
        System.out.println("Result if object B is not found: "+s.search("B"));
        System.out.println("Result if object Z is not found: "+ s.search("Z"));
    }
}
