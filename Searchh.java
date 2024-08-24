public class Searchh {
    public static void main(String[] args) {

        int a[]={4,2,6,1};
        int size=4,n=6,flag=0;
        for(int i=0;i<size;i++){
            if(n==a[i]){
                flag=1;
                System.out.println("element found at index"+i);
                break;
            }
            
        }
       if(flag==0){
                System.out.println("not found");

            }
    }
}
