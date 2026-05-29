class parentclass {
    void sleep(){
        System.out.println("sleeping");
    }
    void run(){
      System.out.println("running");  
    }
}
    class childinherit extends parentclass{
        void eat(){
            System.out.println("eating");
        }
    }
    public class inheritance{
    public static void main(String[] args) {
        childinherit ob=new childinherit();
        ob.sleep();
        ob.run();
        ob.eat();
    }
    }
