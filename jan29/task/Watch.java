package jan29.task;

public class Watch {
    static String itemName = "Titan Edge";
    static int price = 4500;
    static String type = "Analog";
    static float dialSize = 42.5f;
    static double discountPercent = 10.5;
    static String countryOfOrigin = "India";
    static String strapMaterial = "Leather";
    static String brandName = "Titan";
    static char waterResistant = 'Y';
    static String deliveryDate = "5 Feb";
    static String customerCity = "Pune";

    public static void main(String[] args){
        /*String itemName = "Titan Edge";
        int price = 4500;
        String type = "Analog";
        float dialSize = 42.5f;
        double discountPercent = 10.5;
        String countryOfOrigin = "India";
        String strapMaterial = "Leather";
        String brandName = "Titan";
        char waterResistant = 'Y';
        String deliveryDate = "5 Feb";
        String customerCity = "Pune";*/

        System.out.println("Item name is " + itemName);
        System.out.println("Item price is " + price);
        System.out.println("Item type is " + type);
        System.out.println("Item dial size is " + dialSize);
        System.out.println("Discount on the item " + discountPercent);
        System.out.println("Item is made in " + countryOfOrigin);
        System.out.println("Item strap material is " + strapMaterial);
        System.out.println("Item brand is " + brandName);
        System.out.println("Water resistant " + waterResistant);
        System.out.println("Item delivery date is " + deliveryDate);
        System.out.println("Customer city is " + customerCity);
    }
}