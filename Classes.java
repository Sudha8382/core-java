class Mobile{
    public String name,model_num;
    int RAM,ROM;
    public void calling(){
       System.out.println("this is calling function"); 
    }
    public void message(){
    System.out.println("messages");
    }
}
public class Classes {
    public static void main(String[]args){
        Mobile m=new Mobile();
        m.name="sudha";
        m.RAM=12;
        m.message();
        System.out.println(m.name);
    }
}
