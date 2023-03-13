

public class Operators {
    
    public static void main(String[] args) {
        
        int a = 4837;
        int b = 9302;
        double c = 7.548;
        double d = 9.99782;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Addition
        int x = a + b;  // a and b are added and stored in x
        double y = c + d;   // c and d are added and stored in y
        System.out.println("a + b = " + x);
        System.out.println("c + d = " + y);
        
        
        //Subtraction
        x = a - b;  // b is subtracted from a which results in a negative value
        y = d - c; // c is taken away from d. Because floating point math is a bit inprecise there may be some extra at the end
        System.out.println("a - b = " + x);
        System.out.println("d - c = " + y);
        
        
        //Multiplication
        x = a * 3;  // 3 As are placed into the x variable
        y = c * 2; // 2 Cs are placed into the y variable
        System.out.println("a * 3 = " + x);
        System.out.println("c * 2 = " + y);
        
        
        //Division
        x = b / 3;  //This performs integer division. Since b and 3 are integers, the result is also an integer even though b is not divisible by 3
        y = d / 2;  //Floating point division behaves more like you would expect
        System.out.println("b / 3 = " + x);
        System.out.println("d / 2 = " + y);
        
        
        //Modulus
        x = b % 9;  // The value of b is divided by 9 and the remainer is stored in x
        System.out.println("b % 9 = " + x);
        
        
        //BitShift
        x = 74 << 6;    //Shifts the binary representation of 74 (0100 1010) and appends 6 zeros to the right 
        y = -635 >> 4;  //Shifts the binary representation of -645 and removes the right most 4 bits while preserving the sign of the number
        int z = -84 >>> 2; //Shifts the binary representation of -645 and removes the right most 4 bits while not preserving the sign of the number
        System.out.println("74 << 6 = " + x);
        System.out.println("b >> 4 = " + y);
        System.out.println("-84 >>> 2 = " + z);
        
        //Bit AND
        x = 6 & 5;  // the bit value of 6 (110) and 5 (101) are combined where there is a 1 in both 4 (100)
        System.out.println("6 & 5 = " + x);
        
        //Bit OR
        x = 6 | 2;  // the bit value of 6 (110) and 1 (010) are combined where there is a 1 in either 6 (110)
        System.out.println("6 | 2 = " + x);
        
        
        //Logical AND
        boolean i = true && false;  //logical value of true AND false
        boolean j = false && false; //locial value of false AND false
        boolean k = true && true;   //locial value of true AND true
        System.out.println("true && false = " + i);
        System.out.println("false && false = " + j);
        System.out.println("true && true = " + k);
        
        //Logical OR
        i = true || false;  //logical value of true OR false
        j = false || false; //logical value of false OR false
        k = true || true;   //logical value of true OR true
        System.out.println("true || false = " + i);
        System.out.println("false || false = " + j);
        System.out.println("true || true = " + k);
        
        
        //Logical XOR
        i = true ^ false;   //logical value of true XOR false
        j = false ^ false;  //logical value of false XOR false
        k = true ^ true;    //logical value of true XOR true
        System.out.println("true ^ false = " + i);
        System.out.println("false ^ false = " + j);
        System.out.println("true ^ true = " + k);
        
        
        //Less Than
        i = a < b;  //Test that a is less than b
        j = b <= b; //Test that b is less than or equal to b
        System.out.println("a < b = " + i);
        System.out.println("b <= b = " + j);
        
        //More Than
        i = c > d;  //Test that a is greater than b
        j = d >= d; //Test that b is greater or equal to b
        System.out.println("c > d = " + i);
        System.out.println("d >= d = " + j);
        
        //Equal
        i = (7 == 8);   //The parenthesis are not required but are there for clarity. Double == tests for equality while = assigns values.
        j = (11 == 11);
        k = (j && i) || !(j && i);   //We can combine statements for more complex logic
        System.out.println("7 == 8   " + i);
        System.out.println("11 == 11   " + j);
        System.out.println("k = " + k);
        
        //Not
        i = !true;  // The NOT operator ! can be used directly on a logical operator or the result of a logical test
        j = (44 != 82); // The != tests for inequality
        System.out.println("!true = " + i);
        System.out.println("44 != 82   " + j);
    }
}