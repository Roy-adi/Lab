public class array1 {
    public static void main(String[]args){
        float [] marks = {15.5f ,25.5f,50.5f,45.5f};
        float sum = 0;
        for (float elements:marks){
            sum = sum+ elements;
        }
        System.out.println("total"+ sum);
    }
}
