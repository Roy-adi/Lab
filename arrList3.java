
import java.util.LinkedList;
public class arrList3 {
    public static void main(String[]args){
    LinkedList<String> ar = new LinkedList<>();
    ar.add("Red");
    ar.add("Green");
    ar.add("Organge");
    ar.add("White");
    ar.add("black");
    System.out.println(ar);
    ar.addFirst("sky");
    ar.addLast("blue");
    System.out.println(ar);
}
}
