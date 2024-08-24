
public class Salary{
    public static void main(String[]args){
        String name="sudha";
        double ASR=500000;
        double ASV=24000;
        double tax_ammount=ASR-ASV;
        if(tax_ammount<=200000)
        System.out.println("tax="+0);
        else if(tax_ammount>200000&&tax_ammount<=500000){
            System.out.println("tax_ammount="+tax_ammount*0.1);
        }
        else if(tax_ammount>500000&&tax_ammount<=10000000)
        {
            System.out.println("tax="+tax_ammount*0.2);
        }
        else{
            System.out.println("tax="+tax_ammount*0.3);
        }

    }
}