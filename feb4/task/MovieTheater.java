package feb4.task;

public class MovieTheater {
    public static void main(String[] args) {

        String theaterName = "Sahyadri Cinema";
        String location = "Hassan";
        int screens = 3;
        float ticketPrice = 150.0f;

        String[] currentMovies = {"Kantara", "KGF 2", "Vikrant Rona", "777 Charlie"};
        String[] snackItems = {"Popcorn", "Samosa", "Cold Drink", "Ice Cream", "Coffee"};
        String[] showTimings = {"10:30 AM", "1:30 PM", "4:30 PM", "7:30 PM", "10:30 PM"};

        System.out.println("Theater: " + theaterName);
        System.out.println("City: " + location);
        System.out.println("Total Screens: " + screens);
        System.out.println("Base Price: " + ticketPrice);

        System.out.println(" Running Now");
        for (String m : currentMovies) {
            System.out.println(m);
        }

        System.out.println("Food Menu");
        for (String food : snackItems) {
            System.out.println(food);
        }

        System.out.println(" Timings");
        for (String time : showTimings) {
            System.out.println(time);
        }
    }
}