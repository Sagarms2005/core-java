package jan29.task;

public class SmartWatch {
    static String product="Apple Watch";
    static int price=35000;
    static String type="Digital";
    static float display=1.9f;
    static double batteryHealth =98.5;
    static String countryOrgin="China";
    static String strap="silicone";
    static String brand="Apple";
    static char waterproof='Y';
    static String delivary="15 feb";
    static String deliveryAddress="Mumbai";

    public static void main(String[] args){
        /*String product="Apple Watch";
        int price=35000;
        String type="Digital";
        float display=1.9f;
        double batteryHealth =98.5;
        String countryOrgin="China";
        String strap="silicone";
        String brand="Apple";
        char waterproof='Y';
        String delivary="15 feb";
        String deliveryAddress="Mumbai";*/

        System.out.println("product is "+product);
        System.out.println("product price is "+price);
        System.out.println("watch type is "+type);
        System.out.println("display size is "+display);
        System.out.println("battery health is "+ batteryHealth);
        System.out.println("item is based on "+countryOrgin);
        System.out.println("strap material is "+strap);
        System.out.println("brand name is "+brand);
        System.out.println("is waterproof "+waterproof);
        System.out.println("delivery date is "+delivary);
        System.out.println("delivery address is "+deliveryAddress);
    }
}