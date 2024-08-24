public class Test2 {
    int a=10;
    void show(Test2 h){
        h.a=h.a+2;
        System.out.println(h.a);

    }
    public static void main(String []args){
        Test2 h2=new Test2();
        h2 .a=10;
        System.out.println(h2. a);
        h2.show(h2);
        System.out.println(h2.a);

    }
    
}
