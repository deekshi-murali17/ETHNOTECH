import java.util.Scanner;

class user{
    void ridebook(int bookfare){
        System.out.println("ride bookings");
    }
}
class auto extends user{
    public void ridebook(int bookfare){
        if(bookfare>=250)
        System.out.println("The price to book auto is 250.");
    }
}
class cab extends user{
    public void ridebook(int bookfare){
        if(bookfare>=100)
        System.out.println("The price to book cab is 100.");
    }
}
class bike extends user{
    public void ridebook(int bookfare){
        if(bookfare>=80){
        System.out.println("The price to book bike is 80.");
    }
    else{
        System.out.println("No rides are available");
    }
    }
}

public class polymorphismride {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int bookfare=s.nextInt();
        user a=new auto();
        user b=new cab();
        user c=new bike();
        a.ridebook(bookfare);
        b.ridebook(bookfare);
        c.ridebook(bookfare);
    }
}
