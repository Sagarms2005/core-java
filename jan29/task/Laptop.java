package jan29.task;

public class Laptop {
    static String product="HP Pavilion";
    static int cost=62000;
    static String usage="Gaming";
    static float screen_size=15.6f;
    static double taxRate=18.5;
    static String madeIn="Vietnam";
    static String processor="Intel i5";
    static String company="HP";
    static char keyboardBacklight='Y';
    static String shipDate="10 Feb";
    static String shipTo="Hyderabad";

    public static void main(String[] args){
        /*String product="HP Pavilion";
        int cost=62000;
        String usage="Gaming";
        float screen_size=15.6f;
        double taxRate=18.5;
        String madeIn="Vietnam";
        String processor="Intel i5";
        String company="HP";
        char keyboardBacklight='Y';
        String shipDate="10 Feb";
        String shipTo="Hyderabad";*/

        System.out.println("product is "+product);
        System.out.println("product cost is "+cost);
        System.out.println("usage type is "+usage);
        System.out.println("screen size is "+screen_size);
        System.out.println("tax on the laptop "+taxRate);
        System.out.println("laptop is made in "+madeIn);
        System.out.println("processor type is "+processor);
        System.out.println("laptop brand is "+company);
        System.out.println("backlight available "+keyboardBacklight);
        System.out.println("shipping date is "+shipDate);
        System.out.println("shipping address is "+shipTo);
    }
}