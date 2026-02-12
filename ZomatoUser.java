package jan30.task;

public class ZomatoUser {
    public static void login() {
        String personName = "Sagar";
        long ph = 8877665544L;
        String location = "Hassan";
        double discountVal = 50.0;

        System.out.println("Customer: " + personName);
        System.out.println("Contact: " + ph);
        System.out.println("City: " + location);
        System.out.println("Off: " + discountVal + "%");
    }
}