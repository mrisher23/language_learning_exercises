
/*
Java has 8 built-in primitive data types seen below. Plus one major object type in String.

- This class and the main method are marked as 'public'. This means that any othe portion of code
may access this class or the main function (more in the function demo). Public static variables are
the closest Java has to the idea of a Global variable which is considered very unsafe.

- Variables that are marked 'private' may only be used within the Variables class. It is good practice
for all variables declared outside of a function (e.g. class variables).

- Protected variables may be accessed by any code within the same folder or package as this code

- Class variables with no access modifier are called 'default' access. They can be accessed with any
code within the same package or any child classes (see inheritance demos)


- Variables or functions marked 'static' are only created once. Variables that are not static (e.g. instance)
will be created again every time the Variables class is created (using the 'new' keyword). Only static
variables can be used within static methods.
 */
public class Variables {
    //This private integer is declared using Octal notation. This is really 63 in decimal notation
    private static int integer = 077;    //32-bit signed whole number representation

    //Characters may only have a single value. That value should be encosed in single quotes
    private char character = 'C';        //16-bit unsigned number/character

    //Strings may have zero or more characters surrounded by double quotes. The backslash is the escape character.
    protected static String string = "A whole bunch of characters";  //Java has built-in String implementation

    //This variable is declared using scientific notation. Note this variable is not static.
    double double_length_floatingpoint = 1.4657E5;  //64-bit signed floating point number

    //This long variable is declared using HEX notation for its value.
    static long other = -0xFFD6AC;  //64-bit whole number representation

    /*
    Variables declared within a function may only be used within that function.
     */
    public static void main(String[] args) {
        byte b = 5; //8-bit signed whole number
        //The 'final' keyword makes this variable illegal to modify (e.g. a constant)
        final double double_precision = 3.14159;  //64-bit signed floating point number
        float single_precision = 1.10f; //32-bit signed floating point number. The trailing 'f' indicates this is a float literal but is not always necessary.
        short s = -77;   //16-bit signed whole number
        boolean bool = false; //Boolean type

        System.out.println("The value of integer 077 = " + integer);
        System.out.println("The value of character 'C' cannot be accessed from a static function");
        System.out.println("The value of string is: " + string);
        System.out.println("The value of double_length_floatingpoint is not accessible from a static function");
        System.out.println("The value of other = " + other);

        System.out.println("The value of byte b = " + b);
        System.out.println("The value of double_precision = " + double_precision);
        System.out.println("The value of single_precision = " + single_precision);
        System.out.println("The value of short s = " + s);
        System.out.println("The value of bool = " + bool);
        System.out.println("The opposite of bool is " + (!bool));
    }

}
