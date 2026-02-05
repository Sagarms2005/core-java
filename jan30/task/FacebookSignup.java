package jan30.task;

public class FacebookSignup {
    public static void main(String[] args) {
        String firstName = "Sagar";
        String surName = "M S";
        String contactInfo = "2005sagarms@gmail.com";
        String pass = "Sagu@123";
        byte birthDay = 14;
        String birthMonth = "May";
        short birthYear = 2005;
        char gender = 'M';

        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surName);
        System.out.println("Email/Mobile: " + contactInfo);
        System.out.println("Password: " + pass);
        System.out.println("DOB: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Gender: " + gender);
    }
}