import java.util.*;
class intadd{
    int addition(int a,int b){
    int sum=a+b;
    return sum;
}
float addfloat(float x,float y){
    float sum=x+y;
    return sum;
}
}
public class polymorphism {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       float x=s.nextFloat();
       float y=s.nextFloat();
       add ob=new add();
       int res=ob.addition(a,b);
       float res1=ob.addfloat(x,y);
       System.out.println(res);
       System.out.printf("%.3f%n",res1);
   } 
}