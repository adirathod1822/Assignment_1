package Assignment_5;
import java.util.*;

class NegativeSizeException extends Exception{
    public NegativeSizeException(String str){
        super(str);}
}
public class Third extends Exception{
    public static void main(String[] args)  {
        try{
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter total elements: ");
            int size = ip.nextInt();
            int[] i = new int[size];
            for (int j = 0; j < i.length; j++) {
                System.out.print("Enter elements at "+ j +": ");
                int a = ip.nextInt();
                if(a>=0) i[j] = a;
                else throw new NegativeSizeException("Negative number given as input!!!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
