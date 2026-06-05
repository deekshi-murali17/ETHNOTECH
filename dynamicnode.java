import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class dynamicnode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n=s.nextInt();
        node head=null;
        node tail=null;
        System.out.println("Enter node values:");
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            node newnode=new node(value);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        System.out.println("Linked List:");
        while(head!=null){
            System.out.print(head.data + "->");
            head=head.next;
        }
        System.out.println("null");
    }
}
