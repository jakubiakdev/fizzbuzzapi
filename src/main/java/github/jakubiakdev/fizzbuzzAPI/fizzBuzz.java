package github.jakubiakdev.fizzbuzzAPI;

import java.util.function.IntPredicate;

public class fizzBuzz {
    public static String solve(Integer number) {
        String output = "";
        if(number % 3 == 0) {
            output += "Fizz";
        }
        if(number % 5 == 0) {
            output += "Buzz";
        }
        if(output.equals("")) {
            output = String.valueOf(number);
        }
        return output;
    }
}
