public class Patt13 {
    public static void main(String[]args){
        //Floyd's tringle
    //   int n=1;
    //   for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(n+" ");
    //         n++;
    //     }
    //     System.out.println(" ");
    //   }

    //triangle;
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j)%2!=0){
    //             System.out.print("1");
    //         }
    //         else
    //         System.out.print("0");
    //     }
    //     System.out.println(" ");
    // }

    //diamond
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
        System.out.print("  ");
    }
    for(int j=1;j<i;j++){
        System.out.print("*");

        //System.out.println(" ");
    }
     System.out.println(" ");
}
}
}
