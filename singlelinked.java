import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class singlelinked {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n=s.nextInt();
        node head=null;
        node tail=null;
        System.out.println("Enter the node values:");
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            node newnode=new node(value);
            if(head==null){
                head=tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        System.out.println("Enter the choice:");
        int choice=s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Insertion at Beginning:");
                System.out.println("------------");
                System.out.println("Enter the value:");
                int val1=s.nextInt();
            node newnode1=new node(val1);
            newnode1.next=head;
            head=newnode1;
            break;
            case 2:
                System.out.println("Insertion at End:");
                System.out.println("------------");
                System.out.println("Enter the value:");
                int val2=s.nextInt();
            node newnode2=new node(val2);
            tail.next=newnode2;
            tail=newnode2;
            break;
            case 3:
                System.out.println("Insertion at Kth Position:");
                System.out.println("------------");
                System.out.println("Enter the value:");
                int val3=s.nextInt();
                node newnode3=new node(val3);
                System.out.println("Enter the position to be inserted:");
                int pos=s.nextInt();
                if(pos==1){
                    newnode3.next=head;
                    head=newnode3;
                }
                else{
                    node current=head;
                    for(int i=1;i<pos-1;i++){
                        current=current.next;
                    }
                    newnode3.next=current.next;
                    current.next=newnode3;
                }
                break;
            case 4:
                System.out.println("Deletion at Beginning:");
                System.out.println("------------");
                if(head!=null){
                    head=head.next;
                }
                break;
            case 5:
                System.out.println("Deletion at End:");
                System.out.println("------------");
                if(head==null){
                    System.out.println("List is Empty.");
                }
                else if(head.next==null){
                    head=null;
                }
                else{
                    node current=head;
                    while(current.next.next!=null){
                        current=current.next;
                    }
                    current.next=null;
                    tail=current;
                }
                break;
            case 6:
                System.out.println("Deletion at Kth Position:");
                System.out.println("------------");
                System.out.println("Enter the position to be deleted:");
                int delpos=s.nextInt();
                if(delpos==1){
                    head=head.next;
                }
                else{
                    node current=head;
                    for(int i=1;i<delpos-1;i++){
                        current=current.next;
                    }
                    current.next=current.next.next;
                }
                break;
                default:
                    System.out.println("Enter correct choice.");
        }
        node current=head;
        while(current!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }
}
