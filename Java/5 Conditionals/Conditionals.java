

public class Conditionals {
    
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //conditional assignment
        int c = (5 < 9) ? 5 : 9;     //The ternary operator evaluates a conditional and returns one of two values based on the result of the test
        System.out.println("The value of c is " + c);
                       
        
        //simple conditional
        if(c <= 15) {
            System.out.println("The value of c is less than 15");
        }
        
        if(c > 6) {
            System.out.println("The value of c is greater than 6");
        } else {
            System.out.println("The value of c is less than or equal to 6");
        }
        
        
        //complex conditional
        if((a && b) || (!a && !b)) {    //we use && and || because they can short-circut making the evaluation more efficient
            System.out.println("a and b are biconditional");
        } else {
            System.out.println("a and b are not biconditional");
        }
        
        
        //nested conditional
        if(a) {
            if(b) {
                c = 7;
            } else {
                c = 0;
            }
        } else {
            c = 42;
        }
        System.out.println("The value of c in a nested conditional is " + c);
        
        
        //switch
        //Java switch statements can check equality of a variable to multiple possible values. Types that can be used in a switch statement
        //are int, byte, short, char. Beginning in Java 7 String and Enum types are supported.
        switch(c) {
            case -7: System.out.println("c is -7");
                break;  //don't forget the break statement
            case 0: System.out.println("c is 0");
                //intentionally forgot break statement
                //sometimes this is ok if there is shared logic between multiple values, but more often this is a mistake
            case 5: System.out.println("c is 5  (oops! this is what happens when breaks are missing.)");
                break;
            case 7: System.out.println("c is 7");
                break;
            case 9: System.out.println("c is 9");
                break;
            case 42: System.out.println("c is 42");
                break;
            default:    //default isn't required but must appear at the end if included at all. If none of the cases match, default will execute.
                System.out.println("the value of c isn't any of the prior values");
        }
    }
}