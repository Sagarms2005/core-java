package feb11.task;

public class PowerBank {
    static boolean charged;
    static boolean full(){
        if(charged){
            charged=false;
            System.out.println("powerbank is fully charged");
        }
        else {
            charged=true;
            System.out.println("powerbank is empty");
        }
        return charged;
    }
}
