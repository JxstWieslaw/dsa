package collections.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Character> linkedList= new LinkedList<>();
        linkedList.add('A'); //add from Collection Interface
        linkedList.add('B');
        linkedList.add('C');
        linkedList.add('D');
        linkedList.add('E');
        System.out.println(linkedList);
        //indexing but backend logic is not random/direct access.
        linkedList.remove(3); // Full traversal till node
        System.out.println(linkedList);
        System.out.println("Size of LinkedList: "+ linkedList.size());; //get size of linked List
        linkedList.add(3, 'Z'); //same backedn ode to add object at specific index
        System.out.println(linkedList);
        //removes element C at its appropriate index returned by .indexOf('C')
        linkedList.remove(linkedList.indexOf('C'));
        System.out.println(linkedList);
        System.out.println(linkedList.get(3));//get object at index 3
        linkedList.addFirst('G'); //add to front
        System.out.println(linkedList);
        linkedList.addLast('H');//add to rear/end
        System.out.println(linkedList);
        System.out.println("First Element is: "+linkedList.getFirst());
        System.out.println("Last Element is: "+linkedList.getLast());
        linkedList.removeFirst();//remove First object
        System.out.println(linkedList);
        linkedList.removeLast();//remove Last object
        System.out.println(linkedList);
    }
}
