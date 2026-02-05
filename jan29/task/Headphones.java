package jan29.task;

public class Headphones {
    static String device="Sony WH-1000XM5";
    static int cost=24999;
    static String mode="Wireless";
    static float weight=250.0f;
    static double noiseCancel=99.9;
    static String countryOrgin="Japan";
    static String body_material="plastic";
    static String brand="Sony";
    static char mic='Y';
    static String delivary="5 feb";
    static String deliveryAddress="Kolkata";

    public static void main(String[] args){
        /*String device="Sony WH-1000XM5";
        int cost=24999;
        String mode="Wireless";
        float weight=250.0f;
        double noiseCancel=99.9;
        String countryOrgin="Japan";
        String body_material="plastic";
        String brand="Sony";
        char mic='Y';
        String delivary="5 feb";
        String deliveryAddress="Kolkata";*/

        System.out.println("device name is "+device);
        System.out.println("device cost is "+cost);
        System.out.println("connection mode is "+mode);
        System.out.println("device weight is "+weight);
        System.out.println("noise cancellation level "+noiseCancel);
        System.out.println("origin country is "+countryOrgin);
        System.out.println("material used is "+body_material);
        System.out.println("brand name is "+brand);
        System.out.println("mic available "+mic);
        System.out.println("delivery date "+delivary);
        System.out.println("shipping address "+deliveryAddress);
    }
}