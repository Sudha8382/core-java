public class twod21dconversion {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[]=new int[9];
        
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[k]=a[i][j];
                k++;
            }

        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //b[k]=a[i][j];
                //k++;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
for(int i=0;i<9;i++){
    System.out.print(b[i]+" ");
}        
    }
    
}
