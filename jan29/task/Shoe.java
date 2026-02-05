package jan29.task;

public class Shoe {
    static String product="Nike Air";
    static int price=4999;
    static String category="running";
    static float size=9.5f;
    static double tax=12.5;
    static String countryOrgin="Vietnam";
    static String soulMaterial="rubber";
    static String brand="Nike";
    static char gender='M';
    static String delivary="12 feb";
    static String deliveryAddress="Chennai";

    public static void main(String[] args){
        /*String product="Nike Air";
        int price=4999;
        String category="running";
        float size=9.5f;
        double tax=12.5;
        String countryOrgin="Vietnam";
        String soulMaterial="rubber";
        String brand="Nike";
        char gender='M';
        String delivary="12 feb";
        String deliveryAddress="Chennai";*/

        System.out.println("product is "+product);
        System.out.println("product price is "+price);
        System.out.println("item category is "+category);
        System.out.println("shoe size is "+size);
        System.out.println("tax on the item "+tax);
        System.out.println("item is made in "+countryOrgin);
        System.out.println("soul material type is "+soulMaterial);
        System.out.println("item brand is "+brand);
        System.out.println("item for gender "+gender);
        System.out.println("items delivary date is "+delivary);
        System.out.println("delivary address is "+deliveryAddress);
    }
}