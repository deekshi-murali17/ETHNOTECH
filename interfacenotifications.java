interface notifications{
    void instanotificationsbar();
    void whatsappnotificationsbar();
}
class alerts implements notifications{
    public void instanotificationsbar(){
        System.out.println("Notification from Instagram");
    }
    public void whatsappnotificationsbar(){
        System.out.println("Notification from Whatsapp");
    }
    public void display(){
        instanotificationsbar();
        whatsappnotificationsbar();
        System.out.println("Thank You");
    }
}
class messages implements notifications{
    public void instanotificationsbar(){
        System.out.println("4+ new messages");
    }
    public void whatsappnotificationsbar(){
        System.out.println("Lahari:HELLO");
    }
    public void display(){
        instanotificationsbar();
        whatsappnotificationsbar();
    }
}
public class interfacenotifications {
    public static void main(String[] args) {
      alerts ob=new alerts();
      messages ob1=new messages();
       ob.display();
       ob1.display();
   } 
}
