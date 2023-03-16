package com.github.mrisher23.organization.util;
//^^^ we must include a package statement as the first thing in the file
// the structure of the package name must match the folder structure where
// the code is located.

public class Compute {
    /*
     * There are different ideas on how code within a class should be organized, but generally
     *   (1) variables
     *   (2) constructors
     *   (3) functions
     *
     *  Order of static and non-static (instance) methods and variables is less definitive, but
     *  consistiency is more important.
     */

    // Because this is a utility class all of the methods are static.
    // We declare a private constructor to prevent anyone using a
    // 'new' statement. If we don't declare any constructor, Java will
    // add a public one by default.
    private Compute(){}


    //Just some silly functions to demonstrate invoking functions from another class file.
    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

}