package feb4.task;

public class Hospital {
    public static void main(String[] args) {

        String name = "Government Hospital";
        String location = "Hassan";
        int staffCount = 150;
        String type = "Public";

        String[] branches = {"General Ward", "Pathologist", "Heart Ward", "ICU", "Emergency"};
        String[] doctorsInGeneral = {"Ramesh", "Suresh", "Mahesh", "Ganesh", "Lokesh"};
        String[] medicines = {"Paracetamol", "Amoxicillin", "Cough Syrup", "Vitamin C", "Aspirin"};

        System.out.println("Hospital Name is: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Staff: " + staffCount);
        System.out.println("Hospital Type: " + type);

        System.out.println(" Hospital Branches ");
        for (String b : branches) {
            System.out.println(b);
        }

        System.out.println(" Doctors List ");
        for (String doc : doctorsInGeneral) {
            System.out.println(doc);
        }

        System.out.println("Available Medicines");
        for (String med : medicines) {
            System.out.println(med);
        }
    }
}