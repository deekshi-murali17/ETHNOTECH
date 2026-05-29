class employee4 extends employee3{
     
    private int balance;
    
    public employee4(String var1,int var2,int var3)
    {
        super(var1,var2,var3);
    }

    
    void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("withdraw:"+withdraw);
        balance=salary-withdraw;
        System.out.println("Balance:"+balance);
}
}
class inheritmain {
    public static void main(String args[]){
        employee3 ob=new employee3("deekshi",30000,20000);
        employee4 ob1=new employee4("lahari",50000,30000);
        ob.display();
        ob1.display();
    }
}
