
/*
 * Converting between different data types is critical to many programs. Understanding how to do it and 
 * the possible side effects is critical.
 */
public class TypeConversion {
    
    public static void main(String[] args) {
        final short s = 12;
        final char c = 'Z';
        final byte b = 111;
        final int i = 1024;
        final long l = 234153;
        final String str = "56";
        final float f = 77.9948f;
        final double d = 10E22;
        final boolean bool = false;
        
        int i2;
        short s2;
        char c2;
        byte b2;
        long l2;
        String str2;
        float f2;
        double d2;
        
        // to integer
        {
            i2 = i;     //simple copy of value to new variable;
            i2 = s;     //smaller short value moved into larger int. Always ok.
            i2 = b;     //smaller byte value moved into larger int. Always ok.
            i2 = (int)f;     //floating point moved into integer truncates the non-whole number value. Floats can also hold larger numbers than int, so we must be careful.
            i2 = (int)d;    //double precision floating point moved into integer truncates the non-whole number value. Doubles can also hold larger numbers than int, so we must be careful.
            i2 = (int)l;    //longs are larger than int so must be trucated if it contains a large value. Caution is needed.
            i2 = Integer.parseInt(str);     //Extracting an integer value from a string requires using the wrapper class. Some care must be taken to ensure the string contains the expected type. Thows an exception if it does not.
            //booleans cannot be converted to any types except String
        }
        
        
        // to character
        {
            c2 = c;     //same type; always ok
            c2 = b;     //byte is smaller than char, but char is unsigned. We must be careful that the convertion has the intended result.
            c2 = s;     //short and char are the same length but short is signed and char is unsigned. We must be careful
            c2 = (char) i;  //int is larger than char so explicit conversion is needed. We must be cautious here.
            c2 = (char) l;  //long is larger than char so explicit conversion is needed.
            c2 = (char) f;  //because char is basically a short, the float is converted to whole number then the unicode character value. Some funny results may happen.
            c2 = (char) d;  //because char is basically a short, the double is converted to whole number then the unicode character value. Some funny results may happen.
            c2 = str.charAt(0); //Because a String is a series of characters we cannot convert it to a single char variable
            //booleans cannot be converted to a char type
        }
        
        
        // to short
        {
            s2 = s;     //short value copied to short variable
            s2 = b;     //byte value copied to short variable
            s2 = c;     //character value copied to short. Char is unsigned so it may result in a negative short value
            s2 = (short) i;     //integer is larger than short so explicit cast is needed and may result in truncation.
            s2 = (short) l;     //long is larger than short so explicit cast is needed and may result in tructation.
            s2 = (short) f;     //float casting to short will result in trucation of decimal value.
            s2 = (short) d;     //double casting to short will result in truncation of decimal value and larger magnitude whole numbers.
            s2 = Short.parseShort(str); //extract short number from a string's content
            //booleans cannot be converted to short type
        }
        
        
        // to byte
        
        
        
        
        // to long
        {
            //all whole number type conversions are ok
            l2 = l;
            l2 = b;
            l2 = s;
            l2 = c;
            l2 = i;
            
            //floating point types will result in dropping of the decimal portion but whole number value is preserved.
            l2 = (long)f;
            l2 = (long)d;
            l2 = Long.parseLong(str);   //the string is expected to contain a long type value
            //booleans cannot be converted to long types
        }
        
        
        // to float
        {
            f2 = f;
            f2 = b;
            f2 = s;
            f2 = c;
            f2 = i;
            f2 = l;
            f2 = (float)d;
            f2 = Float.parseFloat(str);
            //booleans cannot be converted to long types
        }
        
        
        // to double
        {
            d2 = d; //double to double; value is copied
            d2 = b; //byte to double. ok
            d2 = s; //short to double. ok
            d2 = c; //char to double. ok
            d2 = i; //int to double. iEEE format double precision can accurately represent all 32-bit integer types
            d2 = l; //long to double. Some precision in larger numbers may be lost
            d2 = f; //float to double is always ok.
            d2 = Double.parseDouble(str);   //treat the string as containing a floating point number
            //booleans cannot be converted to double
        }
        
        
        // to String
        if(str instanceof String) { //Because str is an Object type (not primitive) we can check that it is really a String
            str2 = str;     //Simple copy of String object reference. Since Strings are immutable (cannot be changed) we don't need to worry about accidently modifying both str and str2.
            
            //all primitive data types are easily converted to string types using the wrapper classes. 
            //There is no need to use toString() functions when using System.out.print as it is implied
            str2 = Short.toString(s);
            str2 = Byte.toString(b);
            str2 = Character.toString(c);
            str2 = Integer.toString(i);
            str2 = Long.toString(l);
            str2 = Float.toString(f);
            str2 = Double.toString(d);
            str2 = Boolean.toString(bool);
        }
        
        // to boolean
        
    }
    
}