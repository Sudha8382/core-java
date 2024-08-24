public class sumarray{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int size=4,sum=0;
        for(int i=0;i<size;i++){
            if(i==size-1){
                System.out.print(arr[i]+"=");
            }
            else
            System.out.print(arr[i]+"+");
            sum=sum+arr[i];
        }
        System.out.print(sum);


    }
}