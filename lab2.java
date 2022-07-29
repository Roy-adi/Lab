public class lab2 {
    public static String check (String s){
        if (s.matches("[a-z]+_+[a-z]+$"))
        return " Found match ";
        else 
           
          return "not matched ";
        
        
    }
     public static void main (String [] args){
        System.out.println(check("java_exercises"));
        System.out.println(check("java_exercises"));
     }
}
