package jan29.task;

public class Telivision {
    static String device="Sony Bravia";
    static int prize=45999;
    static String display="OLED";
    static float screenInches=55.0f;
    static double refresh_rate=120.5;
    static String countryOrgin="Malaysia";
    static String panelType="LED";
    static String brand="Sony";
    static char energyRating='A';
    static String delivary="22 feb";
    static String deliveryAddress="Hubli";

    public static void main(String[] args){
        /*String device="Sony Bravia";
        int prize=45999;
        String display="OLED";
        float screenInches=55.0f;
        double refresh_rate=120.5;
        String countryOrgin="Malaysia";
        String panelType="LED";
        String brand="Sony";
        char energyRating='A';
        String delivary="22 feb";
        String deliveryAddress="Hubli";*/

        System.out.println("device name is "+device);
        System.out.println("device prize is "+prize);
        System.out.println("display type is "+display);
        System.out.println("screen size "+screenInches);
        System.out.println("refresh rate is "+refresh_rate);
        System.out.println("made in "+countryOrgin);
        System.out.println("panel material is "+panelType);
        System.out.println("brand name is "+brand);
        System.out.println("energy rating "+energyRating);
        System.out.println("delivary by "+delivary);
        System.out.println("send to "+deliveryAddress);
    }
}