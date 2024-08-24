public class Pronic {
    public static void main(String[]args){
        int i=1,flag=0 ,n=6;
        do{
            if(i*(i+1)==n){
                flag=1;
                break;
            }
            i++;
        }
        while(i<=n/2);
        if(flag==0)
        System.out.println("non pronic");
        else
        System.out.println("pronic num");
    }
    
}
