import java.lang.Math;
public class selectionsort {
    public static void main(String[] args) {
        int a[]={2,-7,0,20,-10};
        int size=a.length;
        for(int i=0;i<size;i++){
            int small=a[i];
            int pos=i;
            for(int j=i+1;j<size;j++){
                if(small>a[j]){
                    small=a[j];
                    pos=j;
                }
            }
            int temp=a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ,");
        }
    }
    
}
