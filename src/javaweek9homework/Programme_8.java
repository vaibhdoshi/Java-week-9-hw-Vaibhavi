package javaweek9homework;
/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
 */

import java.util.HashSet;
import java.util.Set;

public class Programme_8 {

    public static void main(String[] args) {
        hasSetMethod();

    }

    public static void hasSetMethod() {
        //declare hasSet
        Set<Integer> set = new HashSet();
        set.add(4);
        set.add(7);
        set.add(8);
        //using for loop and if else is digit is between 1 and 10
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + "  " + "number is in list");
            } else {
                System.out.println(i + "  " + "number is not in list");
            }

        }

    }


}
