package jan29.task;

public class HairDryer {
    static String item="Philips HP8100";
    static int prize=899;
    static String style="compact";
    static float cordLength=1.5f;
    static double wattage=1000.0;
    static String countryOrgin="india";
    static String material="plastic";
    static String brand="Philips";
    static char heatSetting='H';
    static String delivary="4 feb";
    static String deliveryAddress="Bellary";

    public static void main(String[] args){
        /*String item="Philips HP8100";
        int prize=899;
        String style="compact";
        float cordLength=1.5f;
        double wattage=1000.0;
        String countryOrgin="india";
        String material="plastic";
        String brand="Philips";
        char heatSetting='H';
        String delivary="4 feb";
        String deliveryAddress="Bellary";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("item style is "+style);
        System.out.println("wire length is "+cordLength);
        System.out.println("power usage is "+wattage);
        System.out.println("made in "+countryOrgin);
        System.out.println("body material is "+material);
        System.out.println("brand name is "+brand);
        System.out.println("heat mode "+heatSetting);
        System.out.println("delivery on "+delivary);
        System.out.println("address is "+deliveryAddress);
    }
}