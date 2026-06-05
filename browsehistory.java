import java.util.*;
class node{
    String url;
    node next;
    node(String url){
        this.url=url;
        this.next=null;
    }
}
public class browsehistory {
    node head=null;
    node tail=null;
    void visitedpage(String url){
        node newnode=new node(url);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        System.out.println("Visited pages are:" +url);
    }
    void displayhistory(){
        if(head==null){
            System.out.println("No Browsing History.");
            return;
        }
        System.out.println("Browsing History:");
            node current=head;
            while(current!=null){
                System.out.println(current.url);
                current=current.next;
        }
    }
    void searchpage(String page){
        node current=head;
        int pos=1;
        while(current!=null){
            if(current.url.equalsIgnoreCase(page)){
                System.out.println("Page found at position:"+pos);
                return;
            }
            current=current.next;
            pos++;
        }
        System.out.println("Page not found.");
    }
    void deletepage(String page){
        if(head==null){
            System.out.println("History is empty.");
            return;
        }
        if(head.url.equalsIgnoreCase(page)){
            head=head.next;
            System.out.println("History deleted.");
            return;
        }
        node current=head;
        while(current.next!=null&& !current.next.url.equalsIgnoreCase(page)){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("History not found.");
        }
        else{
            current.next=current.next.next;
            System.out.println("Page Deleted.");
        }
    }
    void countpages(){
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total Pages:"+count);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        browsehistory bh=new browsehistory();
        System.out.println("Enter the choice:");
        while(true){
            System.out.println("<----Visited pages----->");
            System.out.println("<----Display history--->");
            System.out.println("<----Search page------->");
            System.out.println("<----Delete page------->");
            System.out.println("<----Count pages------->");
            System.out.println(); 
        int choice=s.nextInt();
        s.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter page url:");
                String url=s.nextLine();
                bh.visitedpage(url);
                break;
            case 2:
                bh.displayhistory();
                break;
            case 3:
                System.out.println("Enter the page to search:");
                String search=s.nextLine();
                bh.searchpage(search);
                break;
            case 4:
             System.out.println("Enter the page to delete:");
                String delete=s.nextLine();
                bh.deletepage(delete);
                break;
            case 5:
                bh.countpages();
                break;
            case 6:
                System.out.println("------>Exit.");
                return;
            default:
                System.out.println("Invalid choice.");
        }
        }
    }
}
