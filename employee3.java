class employee3 {
    protected String name;
    protected int salary;
    protected int balance;
    int withdraw;
    public employee3(String var1,int var2,int var3)
    {
        this.name=var1;
        this.salary=var2;
        this.withdraw=var3;
    }
    void name(){
        System.out.println("Employee name:"+this.name);
    }
    void salary(){
        System.out.println("Monthly salary:"+this.salary);
    }
    void withdraw(){
        System.out.println("Monthly withdraw:"+this.withdraw);
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("withdraw:"+withdraw);
        balance=salary-withdraw;
        System.out.println("Balance:"+balance);
    }
}
