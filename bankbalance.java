public class bankbalance {
    private int salary;
    private String name;
    private int expenditure;
    int balance;
    public void setBalance(int salary,String name,int expenditure){
        this.salary=salary;
        this.name=name;
        this.expenditure=expenditure;
        
    }
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public int getexpenditure(){
        return balance=salary-expenditure;
    }
    public static void main(String args[]){
        bankbalance en=new bankbalance();
        en.setBalance(50000,"deekshi",300);
        System.out.println(en.getsalary());
        System.out.println(en.getname());
        System.out.println(en.getexpenditure());
    }
}


