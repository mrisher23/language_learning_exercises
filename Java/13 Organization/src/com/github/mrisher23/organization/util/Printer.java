package com.github.mrisher23.organization.util;
//^^^ we must include a package statement as the first thing in the file
// the structure of the package name must match the folder structure where
// the code is located.

//import statements come next
import java.io.PrintStream;

public class Printer {
    /*
     * There are different ideas on how code within a class should be organized, but generally
     *   (1) variables
     *   (2) constructors
     *   (3) functions
     *
     *  Order of static and non-static (instance) methods and variables is less definitive, but
     *  consistiency is more important.
     */

    //Here we have a private variable that can only be used within this class.
    private static PrintStream defaultOutputStream = System.out;

    // Because this is a utility class all of the methods are static.
    // We declare a private constructor to prevent anyone using a
    // 'new' statement. If we don't declare any constructor, Java will
    // add a public one by default.
    private Printer() {}

    public static void print(String output) {
        defaultOutputStream.println(output);
    }
}