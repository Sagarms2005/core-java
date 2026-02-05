package jan30.task;

public class WhatsAppUser {
    public static void main(String[] args) {
        int code = 91;
        long contactNumber = 9535123456L;
        String about = "Busy";
        boolean backup = true;

        System.out.println("Phone: +" + code + " " + contactNumber);
        System.out.println("Status: " + about);
        System.out.println("Backup: " + backup);
    }
}