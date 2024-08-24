public class searchin2darray {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=0,flag=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(n==a[i][j]){
                    flag=1;
                    System.out.println("element is found at index "+i+j);
                    break;
                }
            }    
            }
            if(flag==0){
                    System.out.println("element is not found");
        }
    }
}
