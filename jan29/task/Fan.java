package jan29.task;

public class Fan {
    static String item="Usha Swift";
    static int prize=2500;
    static String style="classic";
    static float sweepSize=1200.0f;
    static double speed_rpm=350.5;
    static String countryOrgin="india";
    static String material="iron";
    static String brand="Usha";
    static char starRating='5';
    static String delivary="10 feb";
    static String deliveryAddress="Ahmedabad";

    public static void main(String[] args){
        /*String item="Usha Swift";
        int prize=2500;
        String style="classic";
        float sweepSize=1200.0f;
        double speed_rpm=350.5;
        String countryOrgin="india";
        String material="iron";
        String brand="Usha";
        char starRating='5';
        String delivary="10 feb";
        String deliveryAddress="Ahmedabad";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("item Style is "+style);
        System.out.println("sweep size is "+sweepSize);
        System.out.println("fan speed in rpm "+speed_rpm);
        System.out.println("item is based on the "+countryOrgin);
        System.out.println("item material type is "+material);
        System.out.println("item brand is "+brand);
        System.out.println("energy rating is "+starRating);
        System.out.println("items delivary date is "+delivary);
        System.out.println("delivary address is "+deliveryAddress);
    }
}