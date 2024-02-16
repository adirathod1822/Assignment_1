package Practise;

import java.util.Stack;

public class javaStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        System.out.println(s);
    }
}
