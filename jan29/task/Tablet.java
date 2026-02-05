package jan29.task;

public class Tablet {
    static String item="iPad Air";
    static int prize=54900;
    static String style="modern";
    static float screenSize=10.9f;
    static double weightGrams=461.0;
    static String country_orgin="vietnam";
    static String material="recycled aluminium";
    static String brand="Apple";
    static char cellular='N';
    static String delivary="12 feb";
    static String deliveryAddress="Lucknow";

    public static void main(String[] args){
        /*String item="iPad Air";
        int prize=54900;
        String style="modern";
        float screenSize=10.9f;
        double weightGrams=461.0;
        String country_orgin="vietnam";
        String material="recycled aluminium";
        String brand="Apple";
        char cellular='N';
        String delivary="12 feb";
        String deliveryAddress="Lucknow";*/

        System.out.println("item is "+item);
        System.out.println("item prize is "+prize);
        System.out.println("item Style is "+style);
        System.out.println("screen size is "+screenSize);
        System.out.println("item weight is "+weightGrams);
        System.out.println("item is based on the "+country_orgin);
        System.out.println("item material type is "+material);
        System.out.println("item brand is "+brand);
        System.out.println("cellular support "+cellular);
        System.out.println("items delivary date is "+delivary);
        System.out.println("delivary address is "+deliveryAddress);
    }
}