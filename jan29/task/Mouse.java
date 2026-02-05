package jan29.task;

public class Mouse {
    static String gadget="Logitech G502";
    static int prize=4500;
    static String style="Gaming";
    static float sensitivity=12.5f;
    static double dpiSpeed=25000.0;
    static String countryOrgin="China";
    static String material="matte plastic";
    static String brand="Logitech";
    static char rgbLight='L';
    static String delivary="11 feb";
    static String deliveryAddress="Udupi";

    public static void main(String[] args){
        /*String gadget="Logitech G502";
        int prize=4500;
        String style="Gaming";
        float sensitivity=12.5f;
        double dpiSpeed=25000.0;
        String countryOrgin="China";
        String material="matte plastic";
        String brand="Logitech";
        char rgbLight='L';
        String delivary="11 feb";
        String deliveryAddress="Udupi";*/

        System.out.println("gadget is "+gadget);
        System.out.println("gadget prize is "+prize);
        System.out.println("mouse style is "+style);
        System.out.println("item sensitivity "+sensitivity);
        System.out.println("dpi speed is "+dpiSpeed);
        System.out.println("made in "+countryOrgin);
        System.out.println("mouse material "+material);
        System.out.println("brand is "+brand);
        System.out.println("light type "+rgbLight);
        System.out.println("delivary date "+delivary);
        System.out.println("shipping address "+deliveryAddress);
    }
}