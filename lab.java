import java.util.regex.Pattern;
class lab1 {
    String regex ="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = regex + " "+ regex + "."+ regex + "."+ regex;

    void ch ( String sc) {
        boolean bo = pattern.matches(pattern );
        System.out.println(bo);
    }
}
 public class lab {
    public static void main (String[]args){
        lab1 l1 = new lab1();
        l1.ch("000.12.12.034");
        l1.ch("121.234.12.12");
        l1.ch("23.45.123.123123.123");
        l1.ch("hello.ip");
    }
 }
