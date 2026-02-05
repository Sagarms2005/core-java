package jan29.task;

public class Hero {
    static String product="Hero Sprint";
    static int cost=15000;
    static String style="Off-road";
    static float frame_size=17.5f;
    static double wheel_diameter=29.0;
    static String countryOrgin="india";
    static String frame_material="Aluminium";
    static String brand="Hero";
    static char gearType='M';
    static String delivary="18 feb";
    static String deliveryAddress="Mangalore";

    public static void main(String[] args){
        /*String product="Hero Sprint";
        int cost=15000;
        String style="Off-road";
        float frame_size=17.5f;
        double wheel_diameter=29.0;
        String countryOrgin="india";
        String frame_material="Aluminium";
        String brand="Hero";
        char gearType='M';
        String delivary="18 feb";
        String deliveryAddress="Mangalore";*/

        System.out.println("product is "+product);
        System.out.println("total cost is "+cost);
        System.out.println("cycling style is "+style);
        System.out.println("frame size is "+frame_size);
        System.out.println("wheel size is "+wheel_diameter);
        System.out.println("manufactured in "+countryOrgin);
        System.out.println("material used is "+frame_material);
        System.out.println("brand is "+brand);
        System.out.println("gear mode "+gearType);
        System.out.println("delivary date "+delivary);
        System.out.println("shipping to "+deliveryAddress);
    }
}