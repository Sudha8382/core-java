public class sum2darray {
    public static void main(String[] args) {
       int sum=0;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            System.out.println(" ");
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
        
      // int sum;
       sum=sum+a[i][j];
    }
}
System.out.println(" ");
System.out.println(sum);
    }
}
