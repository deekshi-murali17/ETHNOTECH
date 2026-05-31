interface upipayment{
    void onlinepayment();
}
interface cashpayment{
    void cashdelivery();
}
class payment implements upipayment,cashpayment{
    public void onlinepayment(){
        System.out.println("It is an online UPI payment transaction");
    }
    public void cashdelivery(){
        System.out.println("It is an offine Cash payment transaction");
    }
    public void display(){
        onlinepayment();
        cashdelivery();
        System.out.println("Thank You");
    }
}
public class interfacebank {
   public static void main(String[] args) {
       payment ob=new payment();
       ob.display();
   } 
}
