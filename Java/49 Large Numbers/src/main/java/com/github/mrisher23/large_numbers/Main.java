package com.github.mrisher23.large_numbers;


import java.math.BigInteger;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Integer types (e.g. long) only provide 64-bit of accuracy which is fine for most applications, but sometimes
        // we need bigger numbers. Double allows us to hold very large numbers, but it starts to lose accuracy.
        // the same can be said for needing large numbers of decimal places: we can hold a lot of decimal places
        // but it's limited and loses accuracy after a bit.

        //Usually we find that we need to use these extra large numbers once we've overflowed one of the built-in types
        //and ended up with some weird behavior to debug.

        //Unforunately, we don't get the ability to hold these large arbitrary values for free. Performing math
        //operations is less than ideal.
        ReallyBigIntegers();
        ReallyBigDecimal();
    }

    private static void ReallyBigDecimal() {
        BigDecimal bigDecimal = new BigDecimal(Double.MIN_NORMAL);
        bigDecimal.divide(BigDecimal.TEN);  //make sure it's a minuscule number
        System.out.println(bigDecimal);
    }

    private static void ReallyBigIntegers() {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        bigInteger.add(new BigInteger("1"));    //make sure we are larger than any primitive type can hold
        if(!bigInteger.isProbablePrime(99))
            bigInteger = bigInteger.nextProbablePrime();
        System.out.println(bigInteger);
    }
}