import java.util.*;
public class rotation1 {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
   }
   int k=s.nextInt();
   for(int i=0;i<k;i++){
   int last=arr[n-1];
   
   for(int j=n-1;j>0;j--){
    arr[j]=arr[j-1];
   }
   arr[0]=last;
}
   for(int i=0;i<n;i++){
    System.out.print(arr[i] + " ");
   }
   } 
}

