

    class Disp{
      static  void show(){
            System.out.println("Hello disp");
        }
         static int b;
    }


public class nonstatic {
  public static void main(String[] args) {
        //Disp d=new Disp();
        Disp.show();
        Disp.b=10;
        System.out.println(Disp.b);
    }
}