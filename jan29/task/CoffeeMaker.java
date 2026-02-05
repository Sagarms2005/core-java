package jan29.task;

public class CoffeeMaker {
    static String product="Nescafe Gold";
    static int prize=5500;
    static String style="Automatic";
    static float waterTank=1.5f;
    static double pressure_bar=15.0;
    static String countryorgin="Germany";
    static String material="stainless steel";
    static String brand="Nescafe";
    static char powerkey='P';
    static String delivary="9 feb";
    static String deliveryAddress="Shimoga";

    public static void main(String[] args){
        /*String product="Nescafe Gold";
        int prize=5500;
        String style="Automatic";
        float waterTank=1.5f;
        double pressure_bar=15.0;
        String countryorgin="Germany";
        String material="stainless steel";
        String brand="Nescafe";
        char powerkey='P';
        String delivary="9 feb";
        String deliveryAddress="Shimoga";*/

        System.out.println("product is "+product);
        System.out.println("product prize is "+prize);
        System.out.println("brewing style is "+style);
        System.out.println("tank capacity "+waterTank);
        System.out.println("steam pressure "+pressure_bar);
        System.out.println("origin of product "+countryorgin);
        System.out.println("body material "+material);
        System.out.println("brand name is "+brand);
        System.out.println("power mode "+powerkey);
        System.out.println("delivery date "+delivary);
        System.out.println("address "+deliveryAddress);
    }
}