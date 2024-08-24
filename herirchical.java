

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
class C extends A{
    int e;
    void show3(){
        System.out.println("C");
    }
}


public class herirchical {
    public static void main(String[] args) {
         C c=new C();
        c.show();
       B b=new B();
       b.show();
    }
    
}
