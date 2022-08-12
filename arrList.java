import java.util.ArrayList;
public class arrList {
    public static void main(String[]args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Red");
        ar.add("Green");
        ar.add("Organge");
        ar.add("White");
        ar.add("black");
        System.out.println("Before"+ ar);
        System.out.println(("after"+ar.subList(0, 3)));
    }
}
