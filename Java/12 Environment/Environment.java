import java.util.*;

public class Environment {
    
    public static void main(String[] args) {
        
        //Here we can get any accessible operating system environment variables by name
        String path = System.getenv("PATH");
        if(path != null) {
            System.out.println(path.substring(0, 40) + "...");
        } else {
            System.out.println("We didn't find a path in the environment");
        }
        
        //Or we can grab all of the environment variables at once
        Map<String,String> envProperties = System.getenv();
        
        
        
        
        //Asking for properties retrieves them from the Java runtime 
        String version = System.getProperty("java.version");
        System.out.println("The java version is " + version);
        
        //Or we can grab all of the properties and search them as needed
        //A list of available properties can be found in the official documentation {@link System#getProperties() getProperties}
        Properties javaProperties = System.getProperties();
        
        String url = javaProperties.getProperty("java.vendor.url");
        System.out.println(url);
    }
}