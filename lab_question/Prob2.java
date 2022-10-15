import java.util.Scanner;

public class Prob2 {
   
    public static void q1(String str1,String str2) {
        // print lengths of two string value
        System.out.println("Length of string 1: "+str1.length()+" and string 2: "+str2.length());
        // calculate sum of lengths of two string value
        System.out.println ("The sum of 2 string length: "+(str1.length()+str2.length()));
        
    } 

public static void q2(String str1,String str2) {
    // print capitalized first latter of two string value
    System.out.println("Capitalized of two strings: ");
    System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1));
    System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(1));
}

public static void main(String[] args) {
    // created a scanner class object
    Scanner scan = new Scanner(System.in);
    // take input of first string value from user
    System.out.print("Enter String 1: ");
    String str1 = scan.next();
    // take input of second string value from user
    System.out.print("Enter String 2: ");
    String str2 = scan.next();
    // called all methods
   
    q1(str1,str2);
    
    q2(str1,str2);
}
}
