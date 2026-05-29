public class encapsulation {
    private int id;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public static void main(String args[]){
        encapsulation en=new encapsulation();
        en.setId(21);
        System.out.println(en.getId());
    }
}
