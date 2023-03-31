package com.github.mrisher23.exceptions;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        try {
            checkedException();

            //We can use multiple catch statements to handle different errors with different logic
            //The catch statements are checked in order and the first match is executed
            //This first block uses a multi-catch statement to handle multiple types of errors with
            //the same resolution code.
        } catch(NullPointerException | ArrayIndexOutOfBoundsException npe) {
            //attempt to recover here
            npe.printStackTrace();
        } catch(RuntimeException rte) {
            //attempt to recover here
            rte.printStackTrace();
        } catch(ExecutionException ee) {
            //attempt to recover here
            ee.printStackTrace();
        }

        //This is a runtime exception so we don't need to use a try/catch block
        arrayLengthExceeded();
    }

    private static void checkedException() throws ExecutionException {  // <-- This is a checked exception type so must inform calling code that it may be thrown
        //In this case we are throwing exceptions when inappropriate for their intended meaning
        //but this is just for domonstration purposes. If we don't find existing Exception types
        //for our needs, we can create our own.
        try {
            npe();
        } catch (Exception e) {     // <-- Typically we don't want to catch something as generic as Exception; try to be more specific
            throw new ExecutionException(e);
        }
    }

    private static void arrayLengthExceeded() throws ArrayIndexOutOfBoundsException {
        int[] i = new int[4];
        i[0] = 6;
        i[1] = 3;
        i[2] = 8;
        i[3] = 10;
        i[4] = 99;  //this is beyond the length of the array
    }

    private static void npe() { //npe is shorthand for NullPointerException
        Object o = null;    //Object is the parent object type of all things in Java
        o.toString();   //since we didn't initialize o, this will throw an exception
        System.out.println("This statement is never executed because an exception happened first.");
    }
}