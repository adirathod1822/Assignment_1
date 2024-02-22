package Assignment_8;

import java.util.function.Predicate;

public class First {
    public static void main(String[] args) {
        String s1 = "asdasdasds1";
        Predicate<String> onlyAlpha = s -> s.chars().allMatch(Character::isAlphabetic);
        System.out.println(onlyAlpha.test(s1));
    }
}
