import java.util.Scanner;

public class Prob1 {
    // method for statement 1 with two parameter
    public static void q1(String str1,String str2) {
        
        System.out.println("Length of string 1: "+str1.length()+" and string 2: "+str2.length());
       
        System.out.println ("The sum of 2 string length: "+(str1.length()+str2.length()));
        
    } 

public static void q2(String str1,String str2) {
    
    System.out.println("Capitalized of two strings: ");
    System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1));
    System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(1));
}

public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
  
    System.out.print("Enter String 1: ");
    String str1 = scan.next();

    System.out.print("Enter String 2: ");
    String str2 = scan.next();

   
    q1(str1,str2);
    
    q2(str1,str2);
}
}
