package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creating main method

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.println("Please enter one of symbol + ,-,*,/ : ");
        char c = scanner.next().charAt(0);
        Calculator obj = new Calculator();
        obj.calculateResult(a, b, c);
        System.out.println("Would you like to do more calculation please enter Y or N :");

        while (scanner.hasNext()) {
            char d = scanner.next().charAt(0);
            if (d == 'y') {
                System.out.println("Enter first number :");
                int e = scanner.nextInt();
                System.out.println("Enter second number :");
                int f = scanner.nextInt();
                System.out.println("Please enter one of symbol +,-,/,* :");
                char g = scanner.next().charAt(0);
                Calculator obj1 = new Calculator();
                obj.calculateResult(a, b, c);

            } else {
                System.out.println("program is terminated ");
                break;
            }
            scanner.hasNext();


        }

    }
}






