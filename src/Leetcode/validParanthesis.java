package Leetcode;

import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        String s = "()";

        boolean valid = false;
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length;i++){
             if(ch[i] =='(' || ch[i] =='{' || ch[i] =='[') {
                 System.out.println(ch[i]);
                 st.push(ch[i]);
             }
             else if(!st.isEmpty()){
//                 System.out.println(ch[i]);
                 if ((ch[i] == '}' && st.peek() == '{') || (ch[i] == ']' && st.peek() == '[') || (ch[i] == ')' && st.peek() == '(')) {
                     st.pop();
//                     System.out.println(ch[i]);
                     valid = true;
                 }
                else {
//                     System.out.println("hi");
                     valid = false;
                     break;
                 }
             }
            else {
                 valid = false;
                break;
            }
        }
        System.out.println(valid);
    }
}
//        st.peek() == '}' || st.peek() == ']' || st.peek() == ')'
