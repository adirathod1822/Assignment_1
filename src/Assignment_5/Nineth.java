package Assignment_5;

public class Nineth {
    public static void main(String[] args) {
        String str = "aditya";
        substringCharacter(str,2,100);
    }
    static void substringCharacter(String str,int beginIndex,int endIndex){
        char[] chArr = endIndex <= str.length() ? str.substring(beginIndex, endIndex+1).toCharArray() :
                str.substring(beginIndex, str.length()).toCharArray();
        for(char a : chArr) System.out.println(a);
    }
}
