import java.util.HashMap;
public class Hashing{
   
    public static void main(String args[]){
       // country(key),population(value)
        HashMap<String,String>map=new HashMap<>();

        // Insertion
map.put("India","Delhi");
map.put("US","Washington DC");
map.put("China", "Beijing");
map.put("Japan", "Tokyo");
System.out.println(map);
    }
}
