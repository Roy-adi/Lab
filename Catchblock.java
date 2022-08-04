import java.util.Scanner;
import java.util.InputMismatchException;
public class Catchblock {
    public static void main(String[]args) throws InputMismatchException{
     for (int i=0; i>0; i++);
    
    try {
        Scanner S = new Scanner(System.in);
        System.out.println("input1");
        int X = S.nextInt();
        System.out.println("input2");
        int Y = S.nextInt();
        int output = X/Y;
        System.out.println(output);
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e);
    }
}
}
