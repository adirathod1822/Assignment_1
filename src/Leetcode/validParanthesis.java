package Leetcode;

import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        String s = "()";
        boolean valid = true;
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c:ch){
            if(c == '[') st.push('[');
            else if(c == '{') st.push('{');
            else if(c == '(') st.push('(');
            else if(st.empty() || st.pop()!=c) valid = false;
        }
//        System.out.println(valid);
        System.out.println(st.empty());
    }
}
//        st.peek() == '}' || st.peek() == ']' || st.peek() == ')'
