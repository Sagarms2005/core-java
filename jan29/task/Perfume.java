package jan29.task;

public class Perfume {
    static String scent="Blue de Chanel";
    static int rate=9500;
    static String fragrance="Woody";
    static float volume=100.0f;
    static double taxValue=12.0;
    static String countryOrgin="France";
    static String bottleType="glass";
    static String brand="Chanel";
    static char sizeCode='L';
    static String delivary="20 feb";
    static String deliveryAddress="Bangalore";

    public static void main(String[] args){
        /*String scent="Blue de Chanel";
        int rate=9500;
        String fragrance="Woody";
        float volume=100.0f;
        double taxValue=12.0;
        String countryOrgin="France";
        String bottleType="glass";
        String brand="Chanel";
        char sizeCode='L';
        String delivary="20 feb";
        String deliveryAddress="Bangalore";*/

        System.out.println("scent name is "+scent);
        System.out.println("rate is "+rate);
        System.out.println("fragrance type is "+fragrance);
        System.out.println("volume in ml "+volume);
        System.out.println("tax added "+taxValue);
        System.out.println("made in "+countryOrgin);
        System.out.println("bottle material is "+bottleType);
        System.out.println("brand is "+brand);
        System.out.println("size code "+sizeCode);
        System.out.println("delivery on "+delivary);
        System.out.println("delivery to "+deliveryAddress);
    }
}