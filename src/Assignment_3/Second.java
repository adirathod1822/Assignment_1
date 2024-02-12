package Assignment_3;

public class Second {
    public static void main(String[] args) {
        System.out.println(repeatedAinInfiniteString("aba",10));;

    }
    public static int repeatedAinInfiniteString(String s, int n){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/s.length()+1; i++) {
            sb.append(s);
        }
        char[] arr = sb.subSequence(0,n).toString().toCharArray();
        for(char a:arr) if(a=='a') count++;
        return count;
    }
}
