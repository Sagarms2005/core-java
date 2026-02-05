package jan29.task;

public class Kettle {
    static String machine="Prestige PKOSS";
    static int prize=1150;
    static String style="Electric";
    static float volume=1.8f;
    static double voltage=230.5;
    static String countryOrgin="india";
    static String material="steel";
    static String brand="Prestige";
    static char autoOff='A';
    static String delivary="6 feb";
    static String deliveryAddress="Dharwad";

    public static void main(String[] args){
        /*String machine="Prestige PKOSS";
        int prize=1150;
        String style="Electric";
        float volume=1.8f;
        double voltage=230.5;
        String countryOrgin="india";
        String material="steel";
        String brand="Prestige";
        char autoOff='A';
        String delivary="6 feb";
        String deliveryAddress="Dharwad";*/

        System.out.println("machine name "+machine);
        System.out.println("machine prize "+prize);
        System.out.println("item style "+style);
        System.out.println("tank volume "+volume);
        System.out.println("voltage rating "+voltage);
        System.out.println("origin is "+countryOrgin);
        System.out.println("kettle material "+material);
        System.out.println("brand name "+brand);
        System.out.println("auto switch "+autoOff);
        System.out.println("delivary on "+delivary);
        System.out.println("delivary address "+deliveryAddress);
    }
}