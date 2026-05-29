
interface  A{
    void GroupA();
    void GroupB();
}
interface  B{
    void GroupC();
    void GroupD();
}
class C implements A,B{
    public void GroupA(){
        System.out.println("Welcome to Group A");
    }
    public void GroupB(){
        System.out.println("Welcome to Group B");
    }
    public void GroupC(){
        System.out.println("Welcome to Group C");
    }
    public void GroupD(){
        System.out.println("Welcome to Group D");
    }
    public void GroupE(){
        System.out.println("Welcome to Group E");
    }
    
}
public class interfacemain {
    public static void main(String[] args) {
        C ob=new C();
        ob.GroupA();
        ob.GroupB();
        ob.GroupC();
        ob.GroupD();
        ob.GroupE();
    }
}
