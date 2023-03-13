

public class Loops {
    
    public static void main(String[] args) {
        //loops and arrays are made for each other
        int[] sequence = {1,2,3,4,5,6,7,8,9,10};
        
        //the for loop is the most common. The control statement has 3 parts (2 are optional)
        // for([variable initialization];[conditional statement];[iterate statement])
        // the [variable initialization] is optional and only runs at the start of the first execution
        // the [conditional statement] is required and controls when the loop exits 
        // the [iterate statement] is optional and runs at the end of each execution
        for(int i = 0; i < sequence.length; i++) {
            System.out.println("For loop iteration " + i + " value is " + sequence[i]);
        }
        
        //while it's typical to count up, we can just as easily count backwards
        for(int i = sequence.length - 1; i >= 0; i--) {
            System.out.println("For loop 2 iteration " + (10-i) + " value is " + sequence[i]);
        }
        
        //Array-like lists can simplify going through all of the elements with the foreach loop construct
        for(int value:sequence) {
            System.out.println("Foreach " + value);
        }
        
        
        //The do loop is fairly rare. It will always execute once and the exit condition is evaluated
        // at the end of each execution.
        int j = 9;
        do {
            System.out.println("This is a do loop");
            j--;    //don't forget to change the value of the control variable
        } while(j < 5);
        
        
        //The while loop is common but requires the developer to manage the initialization and incrementing
        // of any control variables. They aren't always needed while this can sometimes cause accidental 
        // infinite loops it can also make a cleaner loop when loop counters are not needed.
        int k = 0;
        while(true) {
            k++;    //don't forget to change a control variable; either near the start or the end of the loop
            if(k % 2 == 1) {
                continue;   //the continue statement goes back to the beginning
            }
            System.out.println("While loop iteration " + k);
            if(k > 8) {  //this logic could just be put into the while loop condition
                break;  //the break statement exits the loop immediately. We need a break because this is an infinite loop.
            }
        }
    }
}