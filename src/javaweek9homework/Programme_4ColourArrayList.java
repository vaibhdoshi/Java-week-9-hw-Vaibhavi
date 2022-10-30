package javaweek9homework;
/*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop
*/

import java.util.ArrayList;

public class Programme_4ColourArrayList {

    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList() {
        //creating ArrayList
        ArrayList<String> list = new ArrayList();
        list.add("red");
        list.add("blue");
        list.add("white");
        list.add("black");
        list.add("pink");

        for (String name : list) {
            System.out.println(name);
        }


    }
}
