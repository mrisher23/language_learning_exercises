package com.github.mrisher23.importLib.run;
//Make sure we declare our package the same as our folder structure


//We can now import some of the files that come from the libraries that maven imported
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.primes.Primes;
//All Java code implicitly imports all classes from java.lang.*

public class Driver {

    public static void main(String[] args) {
        String sentence = "Not all of Java is as easy as this";
        if(StringUtils.isAlphanumeric(sentence)) {
            System.out.println("The sentence is alphanumeric");
        } else {
            System.out.println("The sentence is not alphanumeric");
        }

        int prime = Primes.nextPrime(1024);
        System.out.println("The next prime after " + 1024 + " is " + prime);
    }


}
