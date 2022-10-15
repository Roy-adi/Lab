import java.util.Scanner;

public class Prob1 {     // main class
    
    public static void check(){
        // created scanner class object
        Scanner scan = new Scanner(System.in);
        // taking user input
        System.out.print("Enter input: ");
        int n = scan.nextInt();
        // for loop to set range
        for (int i = 1; i <= n; i++) {
            // condition to print accordingly
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
        // called method
        check();
    }
}