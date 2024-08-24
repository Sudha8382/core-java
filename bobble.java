import java.lang.Math;
public class bobble {
    public static void main(String[] args) {
        int a[]={6,3,5,2,7,1};
        //System.out.println("Array before sorting"+a[i]);
        int len=a.length;
        int temp=0;
        for(int i=0;i<len;i++)
        System.out.println("Array before sorting"+a[i]);
        
        for(int i=0;i<len;i++){
            for(int j=1;j<len-1;j++){
                if(a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=a[j-1];
                }

            }
        }
        for(int i=0;i<len;i++){
            System.out.println("Array sorted"+a[i]);
        }
    }
    
}
