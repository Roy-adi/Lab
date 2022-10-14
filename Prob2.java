import java.util.Scanner;

public class Prob2 {     
    
    public static void check(){
       
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter input: ");
        int n = scan.nextInt();
      
        for (int i = 1; i <= n; i++) {
           
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Good Morning");
            } else if ( (i%3 == 0) && (i%5 != 0) ) {
                System.out.println("Good");
            }else if ( (i%3 != 0) && (i%5 == 0) ) {
                System.out.println("Morning");
            } else {
                System.out.println(i);
            }
        }
    }
    // main method
    public static void main(String[] args) {
        
        check();
    }
}
