import java.util.*;
public class declearation2d{
    public static void main(String[] args) {
        
    
    System.out.print("Enter 2D array size : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    //System.out.println("j");
    System.out.println("Enter array elements : ");    
     
    int a[][]=new int[n][m];
     
       
     for(int i=0; i<n;i++)
      {            
         for(int j=0; j<m;j++)
         {
             a[i][j]=sc.nextInt();
         }
      }
     System.out.print("entered data: \n");
     for(int []x:a){
         for(int y:x){
         System.out.print(y+"        ");
         }
         System.out.println();
     }
}
}

    

