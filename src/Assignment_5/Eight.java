package Assignment_5;

import java.util.regex.Pattern;

public class Eight {
    public static void main(String[] args) {
        validUsername("9adit_90876");
    }
    static void validUsername(String str){
        if(Pattern.matches("[a-zA-Z][a-zA-Z0-9|_]{8,30}",str))
            System.out.println("Valid Username");
        else System.out.println("Invalid Username");
    }
}
