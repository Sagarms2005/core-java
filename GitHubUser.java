package jan30.task;

public class GitHubUser {
    public static void login(){
        String gitId = "Sagar-MS-2005";
        String email = "sagar@gmail.com";
        int repoTotal = 0;
        boolean isPublic = true;

        System.out.println("ID: " + gitId);
        System.out.println("Email: " + email);
        System.out.println("Repos: " + repoTotal);
        System.out.println("Visibility: " + isPublic);
    }
}