package jan29.task;

public class Clock {
    static String item="Ajanta Quartz";
    static int prize=550;
    static String style="Round";
    static float diameter=12.0f;
    static double batteryvolt=1.5;
    static String countryorgin="india";
    static String material="plastic";
    static String brand="Ajanta";
    static char glasstype='C';
    static String delivary="3 feb";
    static String deliveryAddress="Hassan";

    public static void main(String[] args){
        /*String item="Ajanta Quartz";
        int prize=550;
        String style="Round";
        float diameter=12.0f;
        double batteryvolt=1.5;
        String countryorgin="india";
        String material="plastic";
        String brand="Ajanta";
        char glasstype='C';
        String delivary="3 feb";
        String deliveryAddress="Hassan";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("clock style is "+style);
        System.out.println("clock size "+diameter);
        System.out.println("battery used "+batteryvolt);
        System.out.println("origin country "+countryorgin);
        System.out.println("clock material "+material);
        System.out.println("brand name is "+brand);
        System.out.println("glass code "+glasstype);
        System.out.println("delivary by "+delivary);
        System.out.println("address is "+deliveryAddress);
    }
}