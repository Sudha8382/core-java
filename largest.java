public class largest {
    public static void main(String[] args) {
            int a[]={13,-17,9,0,-5};
            int size=a.length;
            for(int i=1;i<size;i++){
                for(int j=i;j>=1;j--){
                    if(a[j-1]>a[j])
                    {
                        int temp=a[j-1];
                        a[j-1]=a[j];
                        a[j]=temp; 
                    }
                }
            }
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
                
            }
            System.out.println(" ");
                System.out.print(" 2nd max element:"+a[size-2]);
            }

        
    }

