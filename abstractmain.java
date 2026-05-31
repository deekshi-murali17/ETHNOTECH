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
        System.out.println("Food Name:"+this.name);
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
        System.out.println("---------------------");
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
class item2 extends delivery{
    item2(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void display1(){
    super.confirmation();
    }
}
    class item3 extends item2{
    item3(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void display1(){
    super.confirmation();
    }
}
    class item4 extends item3{
    item4(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void display1(){
    super.confirmation();
    }
}
    class item5 extends item4{
    item5(String var1,int var2,int var3){
        super(var1,var2,var3);
    }
    void display1(){
    super.confirmation();
    }
    
    
}
public class abstractmain{
public static void main(String[] args) {
    delivery ob1=new delivery("Chicken",2,300);
    item2 ob2=new item2("Biryani",1,250);
    item3 ob3=new item3("pizza",6,1000);
    item4 ob4=new item4("Burger",5,1500);
    item5 ob5=new item5("momos",10,2000);
    ob1.zomato();
    ob1.confirmation();
    ob1.display();
    ob2.display();
    ob3.display();
    ob4.display();
    ob5.display();
}
}
