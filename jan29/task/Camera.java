package jan29.task;

public class Camera {
    static String item="Canon EOS";
    static int prize=55000;
    static  String type="Mirrorless";
    static float megapixels=24.2f;
    static double zoomLevel=18.5;
    static String countryOrgin="Japan";
    static String lensMaterial="glass";
    static String brand="Canon";
    static char batteryType='C';
    static String delivary="12 feb";
    static String deliveryAddress="Mysore";
    public static void main(String[] args){
        /*String item="Canon EOS";
        int prize=55000;
        String type="Mirrorless";
        float megapixels=24.2f;
        double zoomLevel=18.5;
        String countryOrgin="Japan";
        String lensMaterial="glass";
        String brand="Canon";
        char batteryType='C';
        String delivary="12 feb";
        String deliveryAddress="Mysore";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("camera type is "+type);
        System.out.println("camera resolution "+megapixels);
        System.out.println("zoom capacity "+zoomLevel);
        System.out.println("item origin is "+countryOrgin);
        System.out.println("lens material is "+lensMaterial);
        System.out.println("brand name is "+brand);
        System.out.println("battery code is "+batteryType);
        System.out.println("expected delivary "+delivary);
        System.out.println("address is "+deliveryAddress);
    }
}