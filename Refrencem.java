public class Refrencem {
    int a;
    void show(int b){
        a=b;
        a++;
        System.out.println(a);
    }    
    public static void main(String[]args){
        int x=10;
        System.out.println(x);
        Refrencem r=new Refrencem();
        r.show(x);
        System.out.println(x);

    }
}
