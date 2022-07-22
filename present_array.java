import java.util.Scanner;
public class array2 {
    public static void main(String[]args){
        float [] marks = {1.5f,2.5f,3.5f,4.5f};
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the no");
        float a = SC.nextFloat();
        for (float elements:marks){
            if (a==elements){
                System.out.println("present");
               break;
            }
            else
            System.out.println("not present");
        }
    }
}
