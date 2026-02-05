package feb4.task;

public class Library {
    public static void main(String[] args) {

        String libName = "Central Library";
        String city = "Mysuru";
        int totalBooks = 5000;
        boolean isMembershipFree = false;

        String[] categories = {"Fiction", "Science", "History", "Kannada Literature", "Biography"};
        String[] staffNames = {"Anand", "Deepak", "Savitha", "Pallavi"};
        String[] newsPapers = {"Deccan Herald", "Vijayavani", "The Hindu", "Prajavani"};

        System.out.println("Library: " + libName);
        System.out.println("Place: " + city);
        System.out.println("Books Count: " + totalBooks);
        System.out.println("Free Entry: " + isMembershipFree);

        System.out.println("sections");
        for (String cat : categories) {
            System.out.println(cat);
        }

        System.out.println("Staff");
        for (String s : staffNames) {
            System.out.println(s);
        }

        System.out.println("Papers");
        for (String paper : newsPapers) {
            System.out.println(paper);
        }
    }
}