import java.util.*;
public class Electricity_Bill{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int units=s.nextInt();
int cost=0;
if(units>250)
	cost=units-250;
else
	cost=0;
System.out.println(cost);
}
}
