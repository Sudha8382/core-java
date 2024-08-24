
 class A{
    int a;
    int b;
    void show(){
        System.out.println("A");
    }   
}
class B extends A{
    int c,d;
    void show2(){
        System.out.println("B");
    }
}
public class inheritance {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.show2();
    }  
}
