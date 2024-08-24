public class ENcapsulation{
    int area(int s){
        int area=s*s;
        return area;
        // System.out.println(s*s);
    }
    int area(int l,int b){
        int area=l*b;
        return area;
        // System.out.println(l*b);
    }
    int area(int a,int b,int c){
        int area=(a*b*c);
        return area;
        // System.out.println(a*b*c);
    }
     float area(float r){
        float area= r;
        return area;
        // System.out.println(r);
    }
    public static void main(String args[]){
      ENcapsulation s=new ENcapsulation();
      int area=s.area(2,3);
      System.out.println("area="+area);
       
    }
}