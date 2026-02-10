package jan30.task;

public class FlipkartUser {
    public static void login() {
        long phone = 9876543210L;
        int loginOtp = 4455;
        boolean newUser = true;
        String name = "Sagar M S";

        System.out.println("Number: " + phone);
        System.out.println("OTP: " + loginOtp);
        System.out.println("New Account: " + newUser);
        System.out.println("Profile Name: " + name);
    }
}