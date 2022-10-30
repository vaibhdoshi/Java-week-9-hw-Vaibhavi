package javaweek9homework;
/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
*/

import java.util.HashMap;
import java.util.Map;

public class Programme_9HashMap {

    public static void main(String[] args) {

        mapMethod();
    }

    public static void mapMethod() {
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Viral");
        list.put(2, "Disha");
        list.put(3, "Manish");
        list.put(4, "Himesh");

        for (Map.Entry<Integer, String> name : list.entrySet()) {
            System.out.println(name);
        }


    }

}
