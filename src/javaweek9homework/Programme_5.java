package javaweek9homework;
/*Write a Java program to iterate through all elements in an array list using
Iterator
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programme_5 {
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList() {
        //creating arraylist
        Set<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pineapple");
        list.add("Orange");

//using Iterator

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
