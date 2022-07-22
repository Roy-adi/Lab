public class array3 {
    public static void main(String[] args) 
      {
          int[] marks = {10, 12,45,10,72,12,18,20};
   
          for (int i = 0; i < marks.length; i++)
          {
              for (int j = i+1; j <marks.length; j++)
              {
                  if (marks[i] == marks[j]) 
                  {
                      System.out.println(marks[j]);
                  }
              }
          }
      }    
  }
