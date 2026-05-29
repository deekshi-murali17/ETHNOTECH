import java.util.*;
public class withoutself{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        System.out.println("enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
        int prod =1;
        for(int j=0;j<n;j++){
            if(i!=j)
            prod*=arr[j];
        }
        System.out.print(prod);
    }
    }
}