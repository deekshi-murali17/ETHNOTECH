import java.util.*;
public class Right_Angled_Triangle{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print("* ");
}
System.out.println();
}
}
}

import java.util.*;
public class Pyramid{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++){
	for(int j=1;j<=n-i;j++){
		System.out.print(" ");
}
for(int k=1;k<=(2*i-1);k++){
	System.out.print("*");
}
System.out.println();
}
}
}
