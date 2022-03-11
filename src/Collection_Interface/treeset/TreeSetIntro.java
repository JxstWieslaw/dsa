package collection_interface.treeset;

import java.util.TreeSet;

//Collection(I)-> Set (I) ->SortedSet(I) -> NavigableSet(I) -> TreeSet(Class)
//TreeSet is the implementation class of ....SortedSet, NavigableSet INterfaces
//Underlying Data Structure is Balanced Tree
//Insertion Order is not preserved
//Heterogenous elements are not allowed
//Homogeneous and comparable

public class TreeSetIntro {
    public static void main(String[] args) {
        TreeSet <Character> treeSet = new TreeSet<>();
        treeSet.add('Z');
        treeSet.add('a');
        treeSet.add('b');
        treeSet.add('d');
        treeSet.add('z');
        treeSet.add('c');
        System.out.println(treeSet);
        System.out.println(treeSet.add('z'));
    }
}
