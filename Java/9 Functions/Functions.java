


public class Functions {
    
    public static void main(String[] args) {
        SimpleFunction();
        
        AddIt(6,8);
        
        int result = MultiplyThem(4, 11);
        System.out.println(result);
        
        PrintNames("Joe","Ann","Sam","Daisy");
        PrintNames("Matt","Riley","Leo","Amber","David","Lisa");
    }
    
    //Because main is a static function, all functions need to be declared static in order to be invoked from the main method
    
    //private methods can only be access within this class
    private static void SimpleFunction() {
        System.out.println("This is just a simple function.");
    }
    
    //This function accepts two integer arguments. We can accept as many as we'd like but 7 is a best practices maximum.
    //All parameters are pass-by-value so there is no need to be careful about modifying a and b.
    private static void AddIt(int a, int b) {
        System.out.println("This is how we add two numbers " + (a+b));
    }
    
    //This protected method can be accessed by any code in the same directory or via class inheritance (covered later).
    //This method returns an integer value. It must have a return statement at the end of every execution. Returns
    //can appear in the middle of the function if it finishes it's objective early.
    //the parameters here are marked final so they can't be modified which isn't required but good practice.
    protected static int MultiplyThem(final int a, final int b) {
        int c = a * b;
        return c;
    }
    
    //This public function cann be called from code anywhere
    //This function takes a variable number of arguments. A function can only take one variable argument parameter and it must be the last parameter.
    public static void PrintNames(String... names) {
        //A variable arguments parameters is an array within the function
        for(String name : names) {
            System.out.println(name);
        }
    }
    
    
    //Java does not support default values for parameter variables. All parameters are required. Method overloading can be used to eliminate optional parameters.
    
    
    //Java does not support returning multiple values from a method. We can return an array or an custom Object type to compensate.
}