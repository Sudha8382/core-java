public class Testing {
    class Disp{
        static void show(){
            System.out.println("hello Disp");
        }
        static int b;
    }
    class Hello{
    }
    public static void main(String[] args) {
       Disp.show();
       Disp.b=10;
       System.out.println(Disp.b);
    }
}
