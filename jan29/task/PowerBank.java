package jan29.task;

public class PowerBank {
    static String item="Mi Power Bank 3i";
    static int prize=2100;
    static String style="slim";
    static float output_volt=5.1f;
    static double capacity=20000.0;
    static String countryOrgin="india";
    static String material="aluminium";
    static String brand="Xiaomi";
    static char fastCharge='Y';
    static String delivary="5 feb";
    static String deliveryAddress="Kochi";

    public static void main(String[] args){
        /*String item="Mi Power Bank 3i";
        int prize=2100;
        String style="slim";
        float output_volt=5.1f;
        double capacity=20000.0;
        String countryOrgin="india";
        String material="aluminium";
        String brand="Xiaomi";
        char fastCharge='Y';
        String delivary="5 feb";
        String deliveryAddress="Kochi";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("item Style is "+style);
        System.out.println("voltage output is "+output_volt);
        System.out.println("battery capacity is "+capacity);
        System.out.println("item is based on the "+countryOrgin);
        System.out.println("item material type is "+material);
        System.out.println("item brand is "+brand);
        System.out.println("fast charge support "+fastCharge);
        System.out.println("items delivary date is "+delivary);
        System.out.println("delivary address is "+deliveryAddress);
    }
}