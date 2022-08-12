import java.util.ArrayList;

public class arrList2 {
    public static void main(String[]args){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Green");
        ar.add("Red");
        ar.add("Black");
        ar.add("White");
        ar.add("pink");
        ArrayList <String> ar1 = new ArrayList<>();
        ar1.add("Red");
        ar1.add("Green");
        ar1.add("Black");
        ar1.add("pinl");
        System.out.println("list 1 : " + ar);
        System.out.println("list 2 : "+ar1);
        for (String e : ar ){
            if(ar1.contains(e)){
                System.out.println("Present");
            }
            else{
                System.out.println("Not Present");
            }

        }
    }
}
