package feb4.task;

public class RailwayStation {
    public static void main(String[] args) {

        String stationName = "Hassan Junction";
        String zone = "South Western Railway";
        int platformCount = 5;
        char stationCode = 'H';

        String[] trains = {"Siddhaganga", "Gomateshwara", "Rani Chennamma", "Jan Shatabdi"};
        String[] facilities = {"Waiting Hall", "Book Stall", "Canteen", "Parking", "ATM"};
        String[] destinationCities = {"Bengaluru", "Mangaluru", "Mysuru", "Hubballi", "Dharwad"};

        System.out.println("Station: " + stationName);
        System.out.println("Zone: " + zone);
        System.out.println("Platforms: " + platformCount);
        System.out.println("Code: " + stationCode);

        System.out.println(" Train List");
        for (String t : trains) {
            System.out.println(t);
        }

        System.out.println("Services");
        for (String f : facilities) {
            System.out.println(f);
        }

        System.out.println(" Connected To");
        for (String city : destinationCities) {
            System.out.println(city);
        }
    }
}