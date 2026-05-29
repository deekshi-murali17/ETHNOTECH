import java.util.*;
class arraylist{
public int method(List<Integer> list){
int sum=0;
for(int i=0;i<list.size();i++)
sum+=list.get(i);

return sum;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<Integer> list=new ArrayList<>();
for(int i=0;i<n;i++)
list.add(s.nextInt());
arraylist ar=new arraylist();
int res=ar.method(list);
System.out.println(res);
}
}