package jan29.task;

public class Microwave {
    static String machine="Samsung Grill";
    static int billAmount=12500;
    static String color="Black";
    static float power=800.0f;
    static double discount_percent=15.0;
    static String countryOrgin="Korea";
    static String finish="ceramic";
    static String brand="Samsung";
    static char warranty='1';
    static String delivary="8 feb";
    static String deliveryAddress="Pune";

    public static void main(String[] args){
        /*String machine="Samsung Grill";
        int billAmount=12500;
        String color="Black";
        float power=800.0f;
        double discount_percent=15.0;
        String countryOrgin="Korea";
        String finish="ceramic";
        String brand="Samsung";
        char warranty='1';
        String delivary="8 feb";
        String deliveryAddress="Pune";*/

        System.out.println("machine is "+machine);
        System.out.println("bill amount is "+billAmount);
        System.out.println("machine color is "+color);
        System.out.println("power output is "+power);
        System.out.println("discount given "+discount_percent);
        System.out.println("country origin "+countryOrgin);
        System.out.println("interior finish "+finish);
        System.out.println("brand name is "+brand);
        System.out.println("warranty years "+warranty);
        System.out.println("arrival date "+delivary);
        System.out.println("home address "+deliveryAddress);
    }
}