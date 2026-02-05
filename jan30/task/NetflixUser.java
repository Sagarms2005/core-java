package jan30.task;

public class NetflixUser {
    public static void main(String[] args) {
        String userMail = "sagar@netflix.com";
        String pword = "netflix$123";
        int planType = 2;
        boolean autoRenew = true;

        System.out.println("Email: " + userMail);
        System.out.println("Password: " + pword);
        System.out.println("Plan ID: " + planType);
        System.out.println("Active: " + autoRenew);
    }
}