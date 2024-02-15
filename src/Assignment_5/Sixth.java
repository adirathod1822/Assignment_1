package Assignment_5;

public class Sixth {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i++) {
            if(i%3 == 0&&i%5 == 0) System.out.println(i +"FizzBuzz");
            else if(i%3 == 0) System.out.println(i + "Fizz");
            else if(i%5 == 0) System.out.println(i +"Buzz");
        }
    }
}
