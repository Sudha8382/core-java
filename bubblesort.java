import java.lang.Math;
public class bubblesort {
    public static void main(String[] args) {
        int a[]={2,-7,0,20,-10};
        int size=a.length;
        for(int i=1;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;               
                }
            }

        }
                for(int i=0;i<size;i++){
                    System.out.print(a[i]+" ");
                }
                                
            
        
       
    }
    
}
