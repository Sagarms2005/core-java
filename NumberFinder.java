package feb17.task;

public class NumberFinder {
    public static void main(String[] args) {
        String nameToSearch = "sagar";
        PhoneNumber n=new PhoneNumber();
        int phone = n.getNumber(nameToSearch);
        System.out.println("Phone number of " + nameToSearch + " is: " + phone);
    }
}
