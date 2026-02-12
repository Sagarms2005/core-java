package feb9.task;
import jan30.task.*;
public class AllPageLogin {
    public static void main(String[] args) {
        System.out.println("amaozon login");
        AmazonReg ar=new AmazonReg();
        System.out.println("facebook login");
        FacebookSignup.facebookLogin();
        System.out.println("flipkart login");
        FlipkartUser.login();
        System.out.println("github login");
        GitHubUser.login();
        System.out.println("google account");
        GoogleAccount.login();
        System.out.println("insta login");
        InstaSignup.login();
        System.out.println("linked login");
        LinkedInSignup.login();
        System.out.println("myntra login");
        MyntraSignup.login();
        System.out.println("netflix login");
        NetflixUser.login();
        System.out.println("spotify");
        SpotifyProfile.login();
        SwiggyUser.login();
        UberProfile.login();
        WhatsAppUser.login();
        XAccount.login();
        ZomatoUser.login();
    }
}
