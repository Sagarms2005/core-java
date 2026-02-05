package feb4.task;

public class PoliceStation {
    public static void main(String[] args) {

        String stationName = "City Police Station";
        String area = "Hassan";
        int totalOfficers = 45;
        String headOfficer = "Pratap Kumar";

        String[] departments = {"Criminal Wing", "Traffic", "Cyber Cell", "Intelligence", "Passport Verifier"};
        String[] dutyOfficers = {"Santhosh", "Vinay", "Naveen", "Abhi", "Raju"};
        String[] vehicles = {"Jeep", "Patrol Bike", "Interceptor", "Van", "Ambulance"};

        System.out.println("Station Name: " + stationName);
        System.out.println("Area: " + area);
        System.out.println("Total Staff: " + totalOfficers);
        System.out.println("Inspector Name: " + headOfficer);

        System.out.println("Dept List");
        for (String dept : departments) {
            System.out.println(dept);
        }

        System.out.println("Officers on Duty");
        for (String officer : dutyOfficers) {
            System.out.println(officer);
        }

        System.out.println("Station Vehicles");
        for (String v : vehicles) {
            System.out.println(v);
        }
    }
}