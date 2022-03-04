package Collection_Interface.arraylist;
//This Interface includes abstract methods from List and Collection Interface in turn

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> arrList = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arrList.add(i);
        }
        System.out.println(arrList); //print current arrList
        arrList.remove(2); //remove element at index 2
        System.out.println(arrList);
        arrList.add(0,5);//inserting element at index 0. From ArrayList Class
        System.out.println(arrList);
        arrList.add(3,5);//duplicating and inserting at index 3
        System.out.println(arrList);
        System.out.println("First ocurrence of 5 is at index: "+ arrList.indexOf(5));
        System.out.println("Last occurence of 5 is at index : "+ arrList.lastIndexOf(5));
        System.out.println("Element at index 1 is: "+arrList.get(1));
        System.out.println("Is ArrayList empty: "+arrList.isEmpty());
        System.out.println("Size of ArrayList is: "+arrList.size());
        System.out.println("Is element/Object 4 present: "+arrList.contains(4));
        arrList.set(0,4);//replace element at index 0 with object/element 4
        System.out.println("After replacing is done, new ArrayList is: "+arrList);
    }
}
