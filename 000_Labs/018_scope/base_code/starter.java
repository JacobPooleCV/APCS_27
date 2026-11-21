/*
 *	Author: Justin Pyo
 *  Date: 10/9/26
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        int number = 10;
        String message = "Number is less than 5";

        if (number > 5) {
            message = "Number is greater than 5!";
        }

        System.out.println(message);

        int bonus = 0;
        if (number < 20) {
            bonus = 5;
            number = number + bonus;
        }

        int x = 0;
        System.out.println("Bonus was: " + bonus);

        if (x == 0) {
            System.out.println("x is zero!");
        }
        x = 0;

        number = 100;
        System.out.println("Final number: " + number);
    }
}
