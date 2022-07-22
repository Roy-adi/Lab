public class reverse_array {
    public static void main(String[]args){
    int [] arr = {1,2,3,4,5,6,7,8,9};
    int l =arr.length;
    int n = Math.floorDiv(l, 2);
    for (int i=0 ;i<n ;i++ ){
      int temp;
      temp = arr[i];
      arr[i]= arr[l-1-i];
      arr[l-1-i]= temp;

    }
    for (int elements : arr){
        System.out.println(elements);
    }
}
}


