
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
class C extends B{
    int e;
    void show3(){
        System.out.println("C");
    }
}

public class typesinheritence {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.show2();
        c.show3();
    }
    
}
