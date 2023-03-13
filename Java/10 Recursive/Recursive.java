
//A recursive function is any function that invokes itself during its exectuion.
public class Recursive {
    public static void main(String[] args) {
        System.out.println("7! = " + Factorial(7L));
    }
    
    //Factorial is a simple example of a mathematical operation that lends itself to a recursive function
    //we should probably check that the result won't exceed the value a long variable can hold
    public static long Factorial(long l) {
        if(l == 1) {
            return l;   //we must have a base case that does not invoke this function again
        } else {
            return l * Factorial(l-1);  //here we call ourselves with a value one less
        }
    }
}