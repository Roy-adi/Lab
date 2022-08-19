import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
public class hasmap {
    ArrayList<Integer> ar = new ArrayList<Integer>();

    ArrayList<Integer> Even(int E){
        for (int i=2 ; i<=E ; i++){
            if (i%2==0){
                ar.add(i);
            }
        }
        return ar;
    }
     ArrayList<Integer> pri(int E){
      ArrayList<Integer> arr1 = new ArrayList<Integer>();
      for (int i = 2; i<E ; i++){
        if (i%2==0){
            arr1.add(i*2);
        }
      }
      return arr1;
     }
      
     void reEven (int r){
        if (ar.contains(r)){
            System.out.println(r);
        }
        else{
            System.out.println("zero");
        }
     }

     public static void main(String[]args){
        hasmap m = new hasmap();
        System.out.println(m.Even(20));
        System.out.println(m.pri(20));
        m.reEven(11);
     }

}
