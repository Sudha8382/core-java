public class arraytoarraycopy {
    public static void main(String[] args) {
        // int a[]={1,4,-2,4};
        // int size=a.length;
        // int b[]=b[size];

        int c[] = {1, 2, 3}; 
        int size=  c.length; 
        int d[] = new int[size];
      for (int i = 0; i < d.length; i++) {
         d[i] = c[i];
      
      System.out.print(d[i]+" ");
    }
}
}
