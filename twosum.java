import java.util.*;
class twosum{
public int[] index(int[] arr,int target)
{
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++){
if(arr[i]+arr[j]==target)
{
return new int[]{i,j};
}
}
}
return new int[]{};
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int target=s.nextInt();
twosum ob=new twosum();
int res[]=ob.index(arr,target);
System.out.println(res[0]+ " " + res[1]); 
}
}
