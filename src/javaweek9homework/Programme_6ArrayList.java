package javaweek9homework;
/*Write a Java program to retrieve an element (at a specified index) from a given
array list
 */


import java.util.ArrayList;

public class Programme_6ArrayList {
    public static void main(String[] args) {

        array1();
    }

    public static void array1() {
//create a list and add some vegetable to the list
        ArrayList<String> list = new ArrayList();
        list.add("Broccoli");
        list.add("Cauliflower");
        list.add("Tomato");
        list.add("Cabbage");
        //print the list
        System.out.println(list);
        //Retrieve the first and third element
        String element = list.get(0);
        System.out.println("First element : " + element);
        element = list.get(2);
        System.out.println("Third element : " + element);
    }

}
