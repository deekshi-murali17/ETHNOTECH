import java.util.*;
class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class doublenode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n=s.nextInt();
        node head=null;
        node tail=null;
        System.out.println("Enter node values:");
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            node newnode=new node(value);
            if(head==null){
                head=tail=newnode;
            }
            else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }
        }
        System.out.println("Double Linked List:");
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null){
                System.out.print("<->");
            }
            head=head.next;
        }
        System.out.println();
    }
}
