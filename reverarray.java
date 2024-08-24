public class reverarray {
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        int size=arr.length;
        System.out.println(size);
        for(int i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;

        }
        for(int i=0;i<size;i++){

        
        System.out.print(arr[i]+" ");
        }
    }
    
}
