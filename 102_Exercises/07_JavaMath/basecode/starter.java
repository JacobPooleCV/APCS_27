/*
 *	Author:  Justin Pyo
 *  Date: 9/7/26
*/

class starter {
	public static void main(String args[]) {
        // ===================================================
        // SECTION 1: Declaring int and double variables
        // ===================================================
 
        // TODO: Construct and declare an int variable named applesPicked and set it to 12
        int applesPicked = 12;
        
 
        // TODO: Construct and declare a double variable named boxWeightLbs and set it to 2.5
        double boxWeightLbs = 2.5;
 
        System.out.println("Apples picked: " + applesPicked);
        System.out.println("Box weight: " + boxWeightLbs);
        // Expected:
        // Apples picked: 12
        // Box weight: 2.5

        // ===================================================
        // SECTION 2: Basic arithmetic (+, -, *)
        // ===================================================
 
        int applesPerBasket = 4;
 
        // TODO: Construct and declare an int variable named totalBaskets that equals
        // applesPicked multiplied by applesPerBasket
        
        int totalBaskets = applesPicked*applesPerBasket;

        System.out.println("Total baskets: " + totalBaskets);
        // Expected: Total baskets: 48
 
 
        // ===================================================
        // SECTION 3: Integer division vs. double division
        // ===================================================
        // Careful! Dividing two ints in Java performs INTEGER division,
        // which drops (truncates) any remainder.
 
        int totalCookies = 17;
        int studentsInClass = 5;
        int cookiesPerStudentInt = totalCookies/studentsInClass;

        // TODO: Construct and declare an int variable named cookiesPerStudentInt that
        // divides totalCookies by studentsInClass using INTEGER division
        
 
        System.out.println("Cookies per student (int division): " + cookiesPerStudentInt);
        // Expected: Cookies per student (int division): 3
        // (17 / 5 = 3.4, but int division truncates to 3)
 
        // TODO: Construct and declare a double variable named cookiesPerStudentDouble that
        // divides totalCookies by studentsInClass using DOUBLE (decimal) division.
        // Hint: you'll need to cast at least one of the ints to a double,
        // e.g. (double) totalCookies or add/multiple by 0.0/1.0
        double cookiesPerStudentDouble = (double)totalCookies/studentsInClass;
 
        System.out.println("Cookies per student (double division): " + cookiesPerStudentDouble);
        // Expected: Cookies per student (double division): 3.4

 
        // ===================================================
        // SECTION 4: The modulo operator (%)
        // ===================================================
        // % gives you the REMAINDER left over after division.
 
        // TODO: Construct and declare an int variable named leftoverCookies that stores
        // the remainder of totalCookies divided by studentsInClass
        
        int leftoverCookies = totalCookies%studentsInClass;
 
        System.out.println("Leftover cookies: " + leftoverCookies);
        // Expected: Leftover cookies: 2

 
        // ===================================================
        // SECTION 5: Mixing int and double in one expression
        // ===================================================
 
        double pricePerApple = 0.35;
 
        // TODO: Construct and declare a double variable named totalCost that equals
        // applesPicked times pricePerApple
        double totalCost = applesPicked*pricePerApple;
        
 
        System.out.println("Total cost: $" + totalCost);
        // Expected: Total cost: $4.2
 
        // ===================================================
        // SECTION 6: Order of operations
        // ===================================================
 
        // TODO: Construct and declare an int variable named mathResult that calculates
        // the following, following normal order of operations (PEMDAS):
        //     (8 + 2) * 3 - 10 / 2
        
        int mathResult = ((8 + 2) * 3 - 10 / 2);
		
        System.out.println("Math result: " + mathResult);
        // Expected: Math result: 25
    }
}