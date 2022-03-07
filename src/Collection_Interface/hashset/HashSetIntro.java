package collection_interface.hashset;

import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Delhi");
        hashSet.add("Pune");
        hashSet.add("Mumbai");
        hashSet.add("Agra");
        hashSet.add("Chennai");
        hashSet.add("Assam");
        System.out.println(hashSet);
        System.out.println(hashSet.add("Delhi")); // no duplicates allowed in HashSet
        System.out.println("HashSet contains Pune is :"+ hashSet.contains("Pune")); // .contains(Object o)
        hashSet.remove("Agra");
        System.out.println(hashSet);
        hashSet.clear();  //clears all entries insereted into hashSet
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty()); //returns true if hashSet is indeed empty

    }
}

