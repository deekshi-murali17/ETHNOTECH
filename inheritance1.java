class employee{
    void name(){
        System.out.println("deekshitha");
    }
}
class salary extends employee{
    void money(){
        System.out.println("500000");
    }
}
class role extends salary{
    void work(){
        System.out.println("Developer");
    }
    void display(){
        super.name();
        super.money();
        work();
    }
}
class employee2 extends salary{
    void name(){
        System.out.println("lahari");
    }
    void work(){
        System.out.println("ai analyst");
    }
    void display(){
        name();
        super.money();
        work();
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        role ob=new role();
        employee2 ob1=new employee2();
        ob.display();
        ob1.display();
    }
}
