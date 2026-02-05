package jan29.task;

public class Refrigerator {
    static String item="LG Frost Free";
    static int prize=28000;
    static String doorType="double door";
    static float capacity=260.5f;
    static double star_rating=4.5;
    static String countryOrgin="india";
    static String cooling_tech="inverter";
    static String brand="LG";
    static char energyClass='A';
    static String delivary="10 feb";
    static String deliveryAddress="Delhi";

    public static void main(String[] args){
        /*String item="LG Frost Free";
        int prize=28000;
        String doorType="double door";
        float capacity=260.5f;
        double star_rating=4.5;
        String countryOrgin="india";
        String cooling_tech="inverter";
        String brand="LG";
        char energyClass='A';
        String delivary="10 feb";
        String deliveryAddress="Delhi";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("door type is "+doorType);
        System.out.println("storage capacity is "+capacity);
        System.out.println("star rating is "+star_rating);
        System.out.println("made in "+countryOrgin);
        System.out.println("technology used "+cooling_tech);
        System.out.println("brand is "+brand);
        System.out.println("energy class is "+energyClass);
        System.out.println("delivery expected "+delivary);
        System.out.println("address is "+deliveryAddress);
    }
}