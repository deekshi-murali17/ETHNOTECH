abstract class foodorder{
    String name;
    int quantity;
    int price;
    foodorder(String var1,int var2,int var3){
        this.name=var1;
        this.quantity=var2;
        this.price=var3;
    }
    abstract void confirmation();
    void zomato(){
        System.out.println("-------------------");
        System.out.println("Welcome to Zomato");
    }
    void name(){
        System.out.println("Name:"+this.name);
    }
    void quantity(){
        System.out.println("Quantity:"+this.quantity);
    }
    void price(){
        System.out.println("Price:"+this.price);
    }
    void display(){
       name();
        quantity();
        price();
    }
}

class delivery extends foodorder{
    delivery(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void confirmation(){
        System.out.println("Order Confirmed");
    }
}
class thanks extends delivery{
    thanks(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void display1(){
    super.confirmation();
    }
}
public class abstractmain{
public static void main(String[] args) {
    thanks ob=new thanks("Deekshi",1,250);
    ob.zomato();
    ob.display1();
    ob.display();
}
}
