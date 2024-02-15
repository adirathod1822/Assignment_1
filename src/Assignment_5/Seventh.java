package Assignment_5;

import java.util.Arrays;

public class Seventh {
    public static void main(String[] args) {
        String str = "aditya";
        pigLatinTranslator(str);

    }
    static void pigLatinTranslator(String name){
        System.out.println(name.split("\\b\\w")[1] +name.charAt(0)+ "ay");
    }
}
