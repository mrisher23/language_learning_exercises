//We need some helper code from Java. More about this later
import java.util.Arrays;


public class ArrayDemo {
    
    
    public static void main(String[] args) {
        //Array types are declared using the square brackets. The brackets must appear next to the type.
        int[] lotsOfNums;
        long[] lotsOfBigNums;
        
        //Right now they are array variables but no memory is allocated for them yet. We need to give them a size first.
        //The size must be non-negative value up to Integer.MAX_VALUE
        lotsOfNums = new int[10];
        lotsOfBigNums = new long[0];    //zero sized arrays are also valid eventhough they cannot hold any data.
        int sizeVariable = 77;
        byte[] dynamicArray = new byte[sizeVariable];   //We can also use a variable to initialize the size
        
        //We can use the Arrays library to quickly initialize all the values to zero.
        Arrays.fill(dynamicArray, (byte)0b0);
        
        //Java arrays start at index 0 zero. The last index is size-1
        lotsOfNums[0] = 42;
        lotsOfNums[1] = lotsOfNums[0] + 1;
        
        //attempting to access an array outside of it's length produces an exception. See later demonstration. We should check the size before accessing.
        //lotsOfNums[10] = 99;
        
        //Instead of declaring a size and initializing it later, we can do both at the same time.
        String[] words = {"rabbit","fox","deer","kangaroo"};
        
        //Java arrays can keep track of their own size so we don't need to manage a companion variable
        System.out.println("There are " + words.length + " words in the list.");
        //Java also knows how to print out an array, but not in a way you'd expect. This is a common mistake.
        System.out.println(words);
        //This is the real way to get the array output you'd expect.
        System.out.println(Arrays.toString(words));
        
        
        //Check out the API documentation for java.util.Arrays to learn about all the utility functions it has available.
    }
}