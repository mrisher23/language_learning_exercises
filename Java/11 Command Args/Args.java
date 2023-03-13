import java.util.Arrays;


public class Args {

    //Arguments passed on the commandline to this program are stored in this args array.
    //each space on the command delimits a different array value.
    //Try invoking this program with different numbers and contents of parameters following the 'java Args' command.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}