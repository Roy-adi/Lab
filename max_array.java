import javax.lang.model.element.Element;

public class max_array {
    public static void main(String[]args){
        int [] arr ={4,8,55,48,25,78,85,7};
        int max = 0;
        for (int elements:arr){
            if (elements>max){
               max =elements;
               continue;
            }
        }
        System.out.println("max "+ max);
    }
}

