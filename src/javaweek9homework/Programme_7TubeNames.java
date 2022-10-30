package javaweek9homework;
/*Write a Java program to test an array list is empty or not. Define array list with
underground tube name
*/

import java.util.ArrayList;

public class Programme_7TubeNames {
    public static void main(String[] args) {
        emptyArrayList();
    }

    public static void emptyArrayList() {
        //create an array list
        ArrayList<String> tubeName = new ArrayList();
        tubeName.add("Northenline");
        tubeName.add("Jubilee");
        tubeName.add("Circle");
        tubeName.add("Metropolitan");
        // Test whether the array is empty or not.
        if (tubeName.isEmpty()) {
            System.out.println("The Arraylist is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }

    }

}
