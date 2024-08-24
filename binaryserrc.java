import java.lang.Math;
public class binaryserrc {
    public static void main(String[] args) {
        int a[]={1,4,6,8,9};
        int len=a.length;
        int flag=0,n;
        int mid,s=0,e=len-1;
        int key =-19;
        //mid=(s+e)/2;
        while(s<=e){
             mid=(s+e)/2;
            if(a[mid]<key){
                s=mid+1;
            }
            else if(a[mid]==key){
                System.out.println("Element is found at index:"+mid);
            
            break;
            }
             else{
                e=mid-1;
                mid=(s+e)/2;
             }
             if(s>e){
                System.out.println("element id not found");
             }
    }


}
    
}
