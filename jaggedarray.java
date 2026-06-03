import java.util.*;
public class jaggedarray {
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number of students:");
      int rows=s.nextInt();
      int arr[][]=new int[rows][];
      for(int i=0;i<rows;i++){
        System.out.println("Enter student " + (i+1) + " number of subjects:");
        int cols=s.nextInt();
        arr[i]=new int[cols];
        System.out.println("Enter marks:");
        for(int j=0;j<cols;j++){
            arr[i][j]=s.nextInt();
        }
      }
      System.out.println("The jagged array for student marks is:");
      for(int i=0;i<rows;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
  }  
}
