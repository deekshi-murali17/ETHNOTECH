import java.util.*;
public class studentarraylist {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n=s.nextInt();
    s.nextLine();
    ArrayList<String> list=new ArrayList<>();
    System.out.println("Enter the names:");
    for(int i=0;i<n;i++){
        list.add(s.nextLine());
    }
    System.out.println("Student names are:");
    for(String str:list){
        System.out.println(str + " ");
    }
}    
}
