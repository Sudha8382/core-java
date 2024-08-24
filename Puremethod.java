public class Puremethod {
    static int a=10;
    static void show(){
        a++;
        //public static void main(String[]args){}
        System.out.println(a+10);
    }
    public static void main(String[]args){
        System.out.println(a);
        show();
        System.out.println(a);
    }
    
}
