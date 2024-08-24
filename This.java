public class This{
    int a;
    This(int a){
        this.a=a;

    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[]args){
        This s=new This(2);
        s.show();
    }
    
}
