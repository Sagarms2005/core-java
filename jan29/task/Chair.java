package jan29.task;

public class Chair {
    static String item="Ergo Plus";
    static int prize=8500;
    static String style="Professional";
    static float heightAdj=4.5f;
    static double weightLimit=120.0;
    static String countryOrgin="india";
    static String material="mesh";
    static String brand="Featherlite";
    static char qualityCheck='S';
    static String delivary="14 feb";
    static String deliveryAddress="Belgaum";

    public static void main(String[] args){
        /*String item="Ergo Plus";
        int prize=8500;
        String style="Professional";
        float heightAdj=4.5f;
        double weightLimit=120.0;
        String countryOrgin="india";
        String material="mesh";
        String brand="Featherlite";
        char qualityCheck='S';
        String delivary="14 feb";
        String deliveryAddress="Belgaum";*/

        System.out.println("item name is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("chair style is "+style);
        System.out.println("height adjustment "+heightAdj);
        System.out.println("max weight "+weightLimit);
        System.out.println("origin is "+countryOrgin);
        System.out.println("cloth material is "+material);
        System.out.println("brand is "+brand);
        System.out.println("QC status "+qualityCheck);
        System.out.println("delivary date "+delivary);
        System.out.println("delivary address "+deliveryAddress);
    }
}