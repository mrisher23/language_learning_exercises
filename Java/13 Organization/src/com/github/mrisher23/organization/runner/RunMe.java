package com.github.mrisher23.organization.runner;

//we can use the * to import all the files in the package
import com.github.mrisher23.organization.util.*;

//A static import statement is less intuitive and generally avoided
//but it allows us to invoke any public methods or variables as if
//they were declared locally.
//import static com.github.mrisher23.util.Compute.*;

class RunMe {

    public static void main(String[] args) {
        //In order to call the add method we need to call it using the format:
        // <Class Name>.<method name>(<arguments>);
        // This format applies to any method that is marked static. Instance methods are a bit
        // different which will be covered in lesson 30
        int sum = Compute.add(5,7);
        Printer.print("The sum of 5 and 7 is " + sum);
    }
}