class Constructer{
    Constructer(){
        System.out.println("Constructer");
    }
    Constructer(int a){
        System.out.println(a);
    }
    Constructer(int a,int b){
        System.out.println(a+b);
        
        
    }
    public static void main(String[]args){
        Constructer c=new Constructer();
        Constructer c1=new Constructer(2);
        Constructer c2=new Constructer(2,4);
    }

}